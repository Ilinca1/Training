import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.client.HttpClient;
import org.codehaus.jackson.map.ObjectMapper;


/**
 * Created by ivamesu on 7/27/2016.
 */
public class CommentWebServiceClientImpl implements CommentWebServiceClient {

    URL url;
    HttpURLConnection conn;
    ObjectMapper mapper = new ObjectMapper();
    HttpClient httpClient;

    public Comment save(Comment comment) {
        try {
            url = new URL("http://localhost:8080/restfulapis/comment");
            conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            String jsonInString = mapper.writeValueAsString(comment);
            OutputStream os = conn.getOutputStream();
            os.write(jsonInString.getBytes());
            os.flush();
            os.close();

            if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            conn.disconnect();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return comment;
    }

    public Comment update(Comment comment, Long commentId) {

        try {
            url = new URL("http://localhost:8080/restfulapis/comment/" + commentId);
            conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("PUT");
            conn.setRequestProperty("Content-Type", "application/json");
            String jsonInString = mapper.writeValueAsString(comment);
            OutputStream os = conn.getOutputStream();
            os.write(jsonInString.getBytes());
            os.flush();
            os.close();

            if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            conn.getInputStream();
            conn.disconnect();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Comment findById(Long commentId) {
        Comment comment = null;
        try {
            url = new URL("http://localhost:8080/restfulapis/comment/" + commentId);
            comment = mapper.readValue(url, Comment.class);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return comment;
    }

    public List<Comment> findAll() {
        CommentWrapper something;
        ArrayList<Comment> list;
        try {
            url = new URL("http://localhost:8080/restfulapis/comment/");
            something = mapper.readValue(url, CommentWrapper.class);
            list = something.get_embedded().get("comment");
            return list;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void delete(Long commentId) {
        try {
            url = new URL("http://localhost:8080/restfulapis/comment/" + commentId);
            conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("DELETE");

            if (conn.getResponseCode() != HttpURLConnection.HTTP_NO_CONTENT) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

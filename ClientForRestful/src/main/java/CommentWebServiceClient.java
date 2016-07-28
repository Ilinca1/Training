import java.util.List;

/**
 * Created by ivamesu on 7/27/2016.
 */
public interface CommentWebServiceClient {
    Comment save(Comment comment);
    Comment update(Comment comment,Long commentId);
    Comment findById(Long commentId);
    List<Comment> findAll();
    void delete(Long commentId);
}

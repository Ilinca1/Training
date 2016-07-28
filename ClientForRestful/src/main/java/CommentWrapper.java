import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * Created by ivamesu on 7/28/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CommentWrapper {
    LinkedHashMap<Object, ArrayList<Comment>> _embedded ;

    public LinkedHashMap<Object, ArrayList<Comment>> get_embedded() {
        return _embedded;
    }

    public void set_embedded(LinkedHashMap<Object, ArrayList<Comment>> _embedded) {
        this._embedded = _embedded;
    }
}

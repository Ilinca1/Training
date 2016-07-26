package visitor;

/**
 * Created by ivamesu on 7/24/2016.
 */
public interface Element {
    int accept(Visitor visitor);
}

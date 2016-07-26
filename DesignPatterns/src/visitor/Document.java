package visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivamesu on 7/24/2016.
 */
public class Document implements Element {

    private List<String> lines = new ArrayList<>();


    public List<String> getLines() {
        return lines;
    }

    public Document(String fileName) {
        this.lines = new ReadFromFile().readFromFile(fileName);
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Document{" +
                "lines=" + lines +
                '}';
    }
}

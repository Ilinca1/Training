package visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivamesu on 7/24/2016.
 */
public class WordCountVisitor implements Visitor {

    @Override
    public int visit(Document document) {
        System.out.println("WORD");
        String line;
        int counter = 0;
        for (int i = 0; i < document.getLines().size(); i++) {
            line = document.getLines().get(i);
            String[] splitter = line.split(" ");
            counter = counter + splitter.length;
        }
        return counter;
    }
}

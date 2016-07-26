package visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivamesu on 7/24/2016.
 */
public class CharacterCountVisitor implements Visitor {
    @Override
    public int visit(Document document) {
        System.out.println("CHARACTER");
        String line;
        int counter = 0;
        for (int i = 0; i < document.getLines().size(); i++) {
            line = document.getLines().get(i);
            String[] splitter = line.split(" ");
            for (int j = 0; j < splitter.length; j++)
                counter = counter + splitter[j].length();
        }
        return counter;
    }
}

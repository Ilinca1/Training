package letters;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivamesu on 7/22/2016.
 */
public class AlphabetMapping {

    public static void main(String[] args) {
        List<LetterMapping> list = new ArrayList<>();
        LetterMapping letter;
        for (char character = 'a'; character <= 'z'; character++)
            list.add(new LetterMapping(character));
        for (LetterMapping let : list)
            System.out.println(let);
    }
}

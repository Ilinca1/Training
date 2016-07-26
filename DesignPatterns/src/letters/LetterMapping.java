package letters;


/**
 * Created by ivamesu on 7/22/2016.
 */
public class LetterMapping {

    char character;
    int number;

    public LetterMapping(Character character) {
        this.character = character;
        this.number = character.toLowerCase(character) - 97 + 1;
    }

    @Override
    public String toString() {
        return "LetterMapping{" +
                "character=" + character +
                ", number=" + number +
                '}';
    }
}

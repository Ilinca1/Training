package randomstring;

import java.util.Random;

/**
 * Created by ivamesu on 7/7/2016.
 */
public class RandomStringGenerator {

    private int length;
    private String alphabet;

    public RandomStringGenerator(int length, String alphabet) {
        this.length = length;
        this.alphabet = alphabet;
    }

    public String next(){
        String newString = "";
        Random generator = new Random();
        char[] characters = alphabet.toCharArray();
        for(int i = 0; i < this.length; i++) {
            int value = generator.nextInt(length);
            newString = newString + characters[value];
        }
        return newString;
    }
}

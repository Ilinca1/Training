package exercises;

/**
 * Created by ivamesu on 7/14/2016.
 */
public class StringModifier {

    public String backAround(String str) {
        char last = str.charAt(str.length() - 1);
        return last + str + last;
    }

    public String everyNth(String str, int n) {
        StringBuilder result = new StringBuilder();
        result.append(str.charAt(0));
        for (int i = 1; n * i < str.length(); i++) {
            result.append(str.charAt(i * n));
        }
        return result.toString();
    }
}

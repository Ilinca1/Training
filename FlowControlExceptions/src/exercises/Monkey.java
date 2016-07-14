package exercises;

/**
 * Created by ivamesu on 7/14/2016.
 */
public class Monkey {

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if(aSmile == true && bSmile == true)
            return true;
        else if (aSmile == false && bSmile == false)
                 return true;
        else
            return false;
    }

}

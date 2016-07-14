package exercises;

/**
 * Created by ivamesu on 7/14/2016.
 */
public class Parrot {
    public boolean parrotTrouble(boolean talking, int hour){
        if(talking == true && hour <7)
            return true;
        else if(talking == true && hour > 20)
            return true;
        else
            return false;
    }
}

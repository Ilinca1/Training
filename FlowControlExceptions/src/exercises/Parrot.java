package exercises;

/**
 * Created by ivamesu on 7/14/2016.
 */
public class Parrot {
    public boolean parrotTrouble(boolean talking, int hour){
        if(talking && hour <7)
            return true;
        else return talking && hour > 20;
    }
}

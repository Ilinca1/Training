package exercises;

/**
 * Created by ivamesu on 7/14/2016.
 */
public class Number {

    public boolean posNeg(int a, int b, boolean negative){
        if(a < 0 && b > 0)
            return true;
        else if(a > 0 && b < 0)
             return true;
        else if((a < 0 && b < 0) && negative == true )
            return true;
        else
            return false;
    }

    public boolean scoresIncreasing(int[] scores){
        int counter = 0;
        for(int i = 0; i < scores.length -1 ;i++)
            if (scores[i + 1] >= scores[i])
                counter++;
        if(counter == scores.length - 1)
            return true;
        else
            return false;
    }

    public int sumHeights(int[] heights, int start, int end) {
        int result = 0;
        int temp;
        for(int i = start; i < end ; i++){
            temp = Math.abs(heights[i]  - heights[i + 1]);
            result = result + temp;
        }
        return result;
    }
}

package exercises;

import java.util.List;

/**
 * Created by ivamesu on 7/14/2016.
 */
public class Calculator {

    public Integer add(Integer a, Integer b) {
        Integer sum = a + b;
        if (sum > Integer.MAX_VALUE)
            throw new OverflowException("OverflowException");
        else if (sum < Integer.MIN_VALUE)
            throw new UnderflowException("UnderflowException");
        return sum;
    }

    public Integer divide(Integer a, Integer b) {
        return a / b;
    }

    public Integer average(List<Integer> collection) {
        Integer result = 0;
        for (Integer integer : collection) {
            result = add(result, integer);
        }
        return this.divide(result, collection.size());
    }
}

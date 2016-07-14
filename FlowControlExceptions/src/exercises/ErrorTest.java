package exercises;

/**
 * Created by ivamesu on 7/14/2016.
 */
public class ErrorTest {

    public void outOfMemoryTest() {
        double[] var = new double[Integer.MAX_VALUE];
    }

    public void stackOverflowTest() {
        stackOverflowTest();
    }
}

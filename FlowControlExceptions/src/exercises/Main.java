package exercises;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivamesu on 7/14/2016.
 */
public class Main {

    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        System.out.println("Ex 1");
        System.out.println(monkey.monkeyTrouble(true, true));
        System.out.println(monkey.monkeyTrouble(false, false));
        System.out.println(monkey.monkeyTrouble(true, false));

        Parrot parrot = new Parrot();
        System.out.println("Ex 2");
        System.out.println(parrot.parrotTrouble(true, 6));
        System.out.println(parrot.parrotTrouble(true, 7));
        System.out.println(parrot.parrotTrouble(false, 6));

        Number number = new Number();
        System.out.println("Ex 3");
        System.out.println(number.posNeg(1, -1, false));
        System.out.println(number.posNeg(-1, 1, false));
        System.out.println(number.posNeg(-1, -4, true));

        StringModifier stringModifier = new StringModifier();
        System.out.println("Ex 4");
        System.out.println(stringModifier.backAround("cat"));
        System.out.println(stringModifier.backAround("Hello"));
        System.out.println(stringModifier.backAround("a"));

        System.out.println("Ex 5");
        System.out.println(stringModifier.everyNth("Miracle", 2));
        System.out.println(stringModifier.everyNth("abcdefg", 2));
        System.out.println(stringModifier.everyNth("abcdefg", 3));

        System.out.println("Ex 6");
        int[] a = {1, 3, 4};
        int[] b = {1, 3, 2};
        int[] c = {1, 1, 4};
        System.out.println(number.scoresIncreasing(a));
        System.out.println(number.scoresIncreasing(b));
        System.out.println(number.scoresIncreasing(c));

        System.out.println("Ex 7");
        int[] d = {5, 3, 6, 7, 2};
        System.out.println(number.sumHeights(d, 2, 4));
        System.out.println(number.sumHeights(d, 0, 1));
        System.out.println(number.sumHeights(d, 0, 4));

        System.out.println("Ex 8");
        ErrorTest test = new ErrorTest();
        //  test.outOfMemoryTest();
        // test.stackOverflowTest();

        System.out.println("Ex 9");
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Calculator calculator = new Calculator();
        System.out.println("The average of " + list + " is " + calculator.average(list));

        System.out.println("Ex 10");
        try {
            calculator.divide(2, 0);
            return;
        } catch (ArithmeticException e) {
            System.out.println("Don't divide by 0");
        } finally {
            System.out.println("Finally block is executed");
        }
    }
}

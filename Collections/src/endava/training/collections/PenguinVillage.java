package endava.training.collections;

import java.util.*;

/**
 * Created by ivamesu on 7/18/2016.
 */
public class PenguinVillage {

    private static final int NUMBER_OF_PENGUINS = 12000;

    public static void main(String[] args) {
        
        Map<Penguin, Integer> penguinMap = new HashMap<>();
        PenguinHatchery penguinHatchery = new PenguinHatchery();
        Penguin penguin = null;
        for (int i = 0; i < NUMBER_OF_PENGUINS; i++) {
            penguin = penguinHatchery.hatchPenguin();
            penguinMap.put(penguin,i);
        }

        Long current = System.nanoTime();
        Integer integer = penguinMap.get(penguin);
        Long after = System.nanoTime();
        System.out.println("Before: " + current);
        System.out.println("After: " + after);
        System.out.println("The difference is: " + (after-current));
    }
}

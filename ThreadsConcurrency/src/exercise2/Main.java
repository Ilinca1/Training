package exercise2;

import java.io.*;
import java.util.*;

/**
 * Created by ivamesu on 7/20/2016.
 */
public class Main {

    public static void main(String[] args) {

        WordsThread thread1 = new WordsThread(0, 999);
        WordsThread thread2 = new WordsThread(1000, 1999);
        WordsThread thread3 = new WordsThread(2000, 2999);
        WordsThread thread4 = new WordsThread(3000, 3999);
        WordsThread.readFile();
        Long before = System.currentTimeMillis();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Long after = System.currentTimeMillis();
        Iterator itMap = WordsThread.map.entrySet().iterator();
        while (itMap.hasNext()) {
            Map.Entry pair = (Map.Entry) itMap.next();
            System.out.println("The word \"" + pair.getKey() + "\" is " + (int) pair.getValue() * 100 / WordsThread.allWords.size() + "%");
        }

        System.out.println("The time is : " + (after - before));
    }
}

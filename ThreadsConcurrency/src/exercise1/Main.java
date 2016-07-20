package exercise1;

import sun.awt.windows.ThemeReader;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by ivamesu on 7/20/2016.
 */
public class Main {

    private static final int NR_ELEM = 100000;

    public static void main(String[] args) {

        List list = new ArrayList();
        Random random = new Random(100);
        for (int i = 0; i < NR_ELEM; i++) {
            list.add(random.nextInt());
        }

        //with one thread time -> 238
        //with two threads time -> 148
        //with four threads time -> 89

        Long before = System.currentTimeMillis();
        MyThread thread1 = new MyThread(0,  25000, list);
        MyThread thread2 = new MyThread(25001, 50000, list);
        MyThread thread3 = new MyThread(50001, 75000, list);
        MyThread thread4 = new MyThread(75001, 100000, list);
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
        for (int i = 0; i < MyThread.primeList.size(); i++)
            System.out.println(MyThread.primeList.get(i));
        System.out.println("With one thread : " + (after - before));

    }
}

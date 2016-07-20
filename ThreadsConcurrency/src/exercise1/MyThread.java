package exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by ivamesu on 7/20/2016.
 */
public class MyThread extends Thread {

    private int start;
    private int stop;
    private List list;
    static List primeList = new ArrayList();

    public MyThread(int start, int stop, List list) {
        this.start = start;
        this.stop = stop;
        this.list = list;
    }

    public void run() {
        randomPrimeList();
    }

    public void randomPrimeList() {
        for (int i = start; i < stop; i++) {
            if (isPrime((int) this.list.get(i)))
                synchronized (primeList) {
                    primeList.add(this.list.get(i));
                }
        }
    }

    boolean isPrime(int n) {
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public List getList() {
        return primeList;
    }

}

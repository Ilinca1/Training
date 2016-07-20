package exercise2;

import java.io.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by ivamesu on 7/20/2016.
 */
public class WordsThread extends Thread {

    static final String fileName = "D:/Workspace/ThreadsConcurrency/MyFile.txt";
    static List<String> allWords = new ArrayList<String>();
    static Map<String, Integer> map = new HashMap<>();
    static int numberOfWordsStart;
    static int numberOfWordsStop;


    public WordsThread(int numberOfWordsStart, int numberOfWordsStop) {
        this.numberOfWordsStart = numberOfWordsStart;
        this.numberOfWordsStop = numberOfWordsStop;
    }

    public void run() {
        calculatePercentage();
    }


    public static int howManyTimes(List<String> list, String str) {
        int counter = 0;
        for (String string : list) {
            if (string.compareTo(str) == 0)
                counter++;
        }
        return counter;
    }

    public static void calculatePercentage() {
        for (int i = numberOfWordsStart; i < numberOfWordsStop; i++)
            map.put(allWords.get(i), howManyTimes(allWords, allWords.get(i)));
    }

    public static void readFile() {
        BufferedReader bufferedReader = null;
        try {
            Reader fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);
            String data;
            List<String> lines = new ArrayList<String>();
            while ((data = bufferedReader.readLine()) != null) {
                String[] splitter = data.split(" ");
                for (int i = 0; i < splitter.length; i++)
                    allWords.add(splitter[i]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("The second file is missing: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O exception at the second file: " + e.getMessage());
        } finally {
            System.out.println("Everything is closed!");
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException ex) {
                System.out.println("I/O exception at the second file: " + ex.getMessage());
            }
        }
    }


}

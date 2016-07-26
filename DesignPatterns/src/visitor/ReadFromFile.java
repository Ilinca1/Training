package visitor;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivamesu on 7/24/2016.
 */
public class ReadFromFile {


    public static List<String> readFromFile(String fileName) {
        BufferedReader bufferedReader = null;
        List<String> lines;
        lines = null;
        try {
            Reader fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);
            String data;
            lines = new ArrayList<String>();

            while ((data = bufferedReader.readLine()) != null) {
                lines.add(data);
            }

        } catch (FileNotFoundException e) {
            System.out.println("The file is missing: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O exception at the file: " + e.getMessage());
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException ex) {
                System.out.println("I/O exception at the file: " + ex.getMessage());
            }
        }
        return lines;
    }
}

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivamesu on 7/19/2016.
 */
public class Examples {

    static final char LETTER = 'a';
    static final String fileName1 = "D:/Workspace/IOStreams/MyFile.txt";
    static final String fileName2 = "D:/Workspace/IOStreams/YourFile.txt";
    static final String fileName3 = "D:/Workspace/IOStreams/TreeFile.txt";
    static final String rootPath = "D:/Workspace/IOStreams/";

    public static void main(String[] args) {

        writeToFile(fileName1);
        readFromFile(fileName1);
        readFromFileReverse(fileName1);
        getTree(" ", new File(rootPath));

    }

    public static void readFromFile(String fileName) {
        int counter = 0;
        try (Reader fileReader = new FileReader(fileName)) {
            int data;
            while ((data = fileReader.read()) != -1) {
                char dataChar = (char) data;
                if (dataChar == LETTER) {
                    counter++;
                }
                System.out.print(dataChar);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File missing: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O exception: " + e.getMessage());
        }
        System.out.println("");
        System.out.println("The letter " + LETTER + " appears " + counter + " times.");
    }

    public static void writeToFile(String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName, true)) {

            fileWriter.write("“War is peace");
            fileWriter.append(System.lineSeparator());
            fileWriter.write("Freedom is slavery.");
            fileWriter.append(System.lineSeparator());
            fileWriter.write("Ignorance is strength.”");
            fileWriter.append(System.lineSeparator());
            fileWriter.write("- George Orwell, 1984");
            fileWriter.append(System.lineSeparator());
        } catch (FileNotFoundException e) {
            System.out.println("File missing: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O exception: " + e.getMessage());
        }
    }

    public static void readFromFileReverse(String fileName) {
        BufferedReader bufferedReader = null;
        String line = "";
        try {
            Reader fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);
            //data is used for reading each line from the file
            String data;
            //each line is kept as an element in the array
            List<String> lines = new ArrayList<String>();

            while ((data = bufferedReader.readLine()) != null) {
                lines.add(data);
            }
            //the array is iterated backwards
            for (int i = lines.size() - 1; i >= 0; i--) {
                line = lines.get(i);
                //each line is splited into an array of words
                String[] splitter = line.split(" ");

                try (FileWriter fileWriter = new FileWriter(fileName2, true)) {

                    //the words are written into the file backwards
                    for (int j = splitter.length - 1; j >= 0; j--) {
                        fileWriter.write(splitter[j]);
                        fileWriter.write(" ");
                    }

                    fileWriter.append(System.lineSeparator());
                } catch (FileNotFoundException e) {
                    System.out.println("The first file is missing: " + e.getMessage());
                } catch (IOException e) {
                    System.out.println("I/O exception at the first file: " + e.getMessage());
                }
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

    public static void getTree(String in, File file) {
        try (FileWriter fileWriter = new FileWriter(fileName3, true)) {
            for (int i = 0; i < in.length(); i++) {
                fileWriter.write(" ");
            }
            fileWriter.write(file.getName());
            fileWriter.append(System.lineSeparator());
        } catch (FileNotFoundException e) {
            System.out.println("The first file is missing: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O exception at the first file: " + e.getMessage());
        }
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++)
                getTree(in + "/t", files[i]);
        }
    }
}

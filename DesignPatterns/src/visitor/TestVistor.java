package visitor;

/**
 * Created by ivamesu on 7/24/2016.
 */
public class TestVistor {

    static final String fileName = "D:/Workspace/DesignPatterns/MyFile.txt";
    public static void main(String[] args) {

        Document document = new Document(fileName);
        System.out.println("Number of words: " + calculateNumberOfWords(document));
        System.out.println("Number of characters: " + calculateNumberOfCharacters(document));
    }

    public static int calculateNumberOfWords(Element element){
        Visitor visitor = new WordCountVisitor();
        return element.accept(visitor);
    }

    public static int calculateNumberOfCharacters(Element element){
        Visitor visitor = new CharacterCountVisitor();
        return element.accept(visitor);
    }
}

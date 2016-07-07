package biblioteca;

/**
 * Created by ivamesu on 7/7/2016.
 */
public class Main {

    public static void main(String[] args) {
        Carte c1 = new Carte();
        Carte c2 = new Carte();
        Test test = new Test();
        Verificari v = new Verificari();
        test.addBook(c1);
        test.addBook(c2);
        System.out.println(c1);
        System.out.println(c2);
        test.afisareTitlu(c1);
        if(v.verificareDubluExemplar(c1,c2))
            System.out.println("Cartile " + c1.getTitlu() + " si " + c2.getTitlu() + " sunt in dublu exemplar.");
        else
            System.out.println("Cartile " + c1.getTitlu() + " si " + c2.getTitlu() + " nu sunt in dublu exemplar.");

        System.out.println("Cartea " + v.verificareGrosime(c1,c2) + " e mai groasa.");
    }
}

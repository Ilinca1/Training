package biblioteca;

import java.util.Scanner;

/**
 * Created by ivamesu on 7/7/2016.
 */
public class Test {


    public void addBook(Carte carte){

        int numarPagini = 1;
        Scanner s = new Scanner(System.in);
        System.out.println("Introduceti titlul: ");
        String titlu = s.nextLine();
        carte.setTitlu(titlu);
        System.out.println("Introduceti autorul: ");
        String autor = s.nextLine();
        carte.setAutor(autor);
        System.out.println("Introduceti editura: ");
        String editura = s.nextLine();
        carte.setEditura(editura);
        do {
            System.out.println("Introduceti numarul de pagini: ");
            numarPagini = s.nextInt();
        } while(numarPagini <= 0);

        carte.setNumarPagini(numarPagini);
    }

    public void afisareTitlu(Carte carte){
        System.out.println(carte.getTitlu().toUpperCase() + " " + carte.getAutor() + " " + carte.getEditura().toLowerCase());
    }
}

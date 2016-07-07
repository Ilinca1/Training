package numerecomplexe;

/**
 * Created by ivamesu on 7/7/2016.
 */
public class Main {
    public static void main(String[] args) {

        NumarComplex numar1 = new NumarComplex();
        NumarComplex numar2 = new NumarComplex();
        Operatii op = new Operatii();
        numar1.setIm(1);
        numar2.setIm(2);
        numar1.setRe(3);
        numar2.setRe(4);
        System.out.println("Result for adding: " + op.add(numar1,numar2).getRe() + " " + op.add(numar1,numar2).getIm() );
        System.out.println("Result for multiplication: " + op.multiply(numar1,numar2).getRe() + " " + op.multiply(numar1,numar2).getIm() );
    }
}

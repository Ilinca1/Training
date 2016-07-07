package biblioteca;

/**
 * Created by ivamesu on 7/7/2016.
 */
public class Carte {

    private String titlu;
    private String autor;
    private String editura;
    private int numarPagini;

    public String getTitlu() {
        return titlu;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditura() {
        return editura;
    }

    public int getNumarPagini() {
        return numarPagini;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public void setEditura(String editura) {
        this.editura = editura;
    }

    public void setNumarPagini(int numarPagini) {
        this.numarPagini = numarPagini;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "titlu='" + titlu + '\'' +
                ", autor='" + autor + '\'' +
                ", editura='" + editura + '\'' +
                ", numarPagini=" + numarPagini +
                '}';
    }
}

package biblioteca;

/**
 * Created by ivamesu on 7/7/2016.
 */
public class Verificari {

    public boolean verificareDubluExemplar(Carte carte1, Carte carte2){
        if(carte1.getAutor().equals(carte2.getAutor()) && carte1.getTitlu().equals(carte2.getTitlu()))
            return true;
        else
            return false;
    }

    public String verificareGrosime(Carte carte1, Carte carte2){
        if(carte1.getNumarPagini() > carte2.getNumarPagini())
            return carte1.getTitlu();
        else
            return carte2.getTitlu();
    }

}

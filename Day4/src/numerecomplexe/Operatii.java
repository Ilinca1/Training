package numerecomplexe;

import com.sun.xml.internal.ws.wsdl.writer.document.OpenAtts;

/**
 * Created by ivamesu on 7/7/2016.
 */
public class Operatii {

    public NumarComplex add(NumarComplex numarComplex1, NumarComplex numarComplex2){

        NumarComplex result = new NumarComplex();
        result.setIm(numarComplex1.getIm() + numarComplex2.getIm());
        result.setRe(numarComplex1.getRe() + numarComplex2.getRe());
        return result;
    }

    public NumarComplex multiply(NumarComplex numarComplex1, NumarComplex numarComplex2){

        NumarComplex result = new NumarComplex();
        result.setIm(numarComplex1.getIm() * numarComplex2.getRe() + numarComplex2.getIm() * numarComplex1.getRe());
        result.setRe(numarComplex1.getRe() * numarComplex2.getRe() - numarComplex1.getIm() * numarComplex2.getIm());
        return result;
    }
}

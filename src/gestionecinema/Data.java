
package gestionecinema;


public class Data {
    private int giorno;
    private int mese;
    private int anno;
/**
 * 
 * @param giorno int
 * @param mese int 
 * @param anno int
 */
    Data(int giorno, int mese, int anno) {
        this.anno=anno;
        this.giorno=giorno;
        this.mese=mese;
    }

    public int getGiorno() {
        return giorno;
    }

    public void setGiorno(int giorno) {
        this.giorno = giorno;
    }

    public int getMese() {
        return mese;
    }

    public void setMese(int mese) {
        this.mese = mese;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    @Override
    public String toString() {
        return "Data : "+ giorno + "/" + mese + "/" + anno;
    }
}

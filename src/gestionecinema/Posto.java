
package gestionecinema;


public class Posto {
    private int sedile;
    private File fila;
    private boolean occupato=false;

    public boolean isOccupato() {
        return occupato;
    }

    public void setOccupato(boolean occupato) {
        this.occupato = occupato;
    }
    
    Posto(int sedile,File fila){
        this.sedile=sedile;
        this.fila=fila;
    }

    public int getSedile() {
        return sedile;
    }

    public void setSedile(int sedile) {
        this.sedile = sedile;
    }

    public File getFila() {
        return fila;
    }

    public void setFila(File fila) {
        this.fila = fila;
    }

    @Override
    public String toString() {
        return "Posto   Fila \n" + sedile+"   "+ fila;
    }
    
    
}

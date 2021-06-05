
package gestionecinema;


public class Posto {
    private int sedile;
    private Fila fila;
    private boolean occupato=false;

    public boolean isOccupato() {
        return occupato;
    }

    public void setOccupato(boolean occupato) {
        this.occupato = occupato;
    }
    
    Posto(int sedile,Fila fila){
        this.sedile=sedile;
        this.fila=fila;
    }

    public int getSedile() {
        return sedile;
    }

    public void setSedile(int sedile) {
        this.sedile = sedile;
    }

    public Fila getFila() {
        return fila;
    }

    public void setFila(Fila fila) {
        this.fila = fila;
    }

    @Override
    public String toString() {
        return "Posto   Fila \n" + sedile+"   "+ fila;
    }
    
    
}

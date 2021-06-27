
package gestionecinema;


public class Posto {
    
    
    private int sedile;
    private int fila;
    private boolean occupato;
    //costruttori
    public Posto(int sedile,int fila){
        this.sedile=sedile;
        this.fila=fila;
        this.occupato=false;
    }
    public Posto(){
        this.occupato=false;
    }
    
    //metodi
    public boolean getOccupato() {
        return occupato;
    }

    public void setOccupato(boolean occupato) {
        this.occupato = occupato;
    }

    public int getSedile() {
        return sedile;
    }

    public void setSedile(int sedile) {
        this.sedile = sedile;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    @Override
    public String toString() {
        return "F: "+ fila+" P: "+ sedile;
    }
    
    
}

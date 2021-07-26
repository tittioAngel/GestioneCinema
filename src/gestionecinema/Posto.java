/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionecinema;

/**
 * Identifica il posto a sedere all'interno di una sala.
 * @author matte
 */

public class Posto {
    
    private int sedile;
    private int fila;
    private boolean occupato;
    
    
    public Posto(int sedile,int fila){
        this.sedile=sedile;
        this.fila=fila;
        this.occupato=false;
    }
    public Posto(){
        this.sedile = 0;
        this.fila = 0;
        this.occupato=false;
    }
    
    
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
        switch(fila){
            case 0: return "Fila = A    Sedile = "+ (sedile+1);
                
            case 1: return "Fila = B    Sedile = "+ (sedile+1);
                
            case 2: return "Fila = C    Sedile = "+ (sedile+1);
               
            case 3: return "Fila = D    Sedile = "+ (sedile+1);
                
            case 4: return "Fila = E    Sedile = "+ (sedile+1);
                
            case 5: return "Fila = F    Sedile = "+ (sedile+1);
                
            case 6: return "Fila = G    Sedile = "+ (sedile+1);
               
            case 7: return "Fila = H    Sedile = "+ (sedile+1);
            
            default: return "C'è qualcosa di sbagliato";
                
        }

       
    }
    
    
}

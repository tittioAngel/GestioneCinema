/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionecinema;

import java.io.*;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 * Ientifica la scelta tra le proiezioni e ne assegna un posto.
 * @author matte
 */

public class Biglietto {
    
    private Proiezione scelta = new Proiezione();
    private Posto posto_assegnato = new Posto();
    

    public Biglietto(Proiezione scelta) {
        this.scelta = scelta;
        Posto p=new Posto(0,0);
        this.posto_assegnato=p;    
    }
    
    public Biglietto(){
    }
    
    /**
     * Stampa i biglietti richiesti in maniera appropriata rispetto alla quantità richiesta
     * I biglietti da consegnare al cliente verranno stampati in un documento di testo chiamato biglietto.txt
     * Verranno anche aggiornati due file di testo, uno per tenere traccia dei posti occupati e uno per tenere traccia di tutti i biglietti venduti
     * @param nb numero di biglietti richiesti
     * @throws IOException 
     */
    public void stampaBiglietti(int nb) throws IOException{
        FileWriter f=new FileWriter("src\\gestionecinema\\biglietto.txt");
        File storico_posti=new File("src\\gestionecinema\\storico_posti.txt");
        File storico_biglietti=new File("src\\gestionecinema\\storico_biglietti.txt");
        
        Writer posti_occupati = new BufferedWriter(new FileWriter(storico_posti, true));
        Writer biglietti_venduti = new BufferedWriter(new FileWriter(storico_biglietti, true));
        
        int n=0;// tiene conto dei posti assegnati 
        int fila = scelta.getSala_p().trovaFila(nb);
        
        if( scelta.getSala_p().trovaFila(nb) == -1){  // vediamo se ci sono abbastanza posti consecutivi
            JOptionPane.showMessageDialog(null, "La sala "+scelta.getSala_p().getNumero()+" alle ore "+scelta.getOrario_p().toString()+" non ha abbastanza POSTI LIBERI consecutivi","ATTENZIONE!!",ERROR_MESSAGE);
        }else{
            for(int i=0;i<scelta.getSala_p().getSf()&& n<nb;i++){
                    //p=scelta.getSala_p().getPosti()[fila][i];
                    if(!scelta.getSala_p().getPosti()[fila][i].getOccupato()){
                        posto_assegnato=scelta.getSala_p().getPosti()[fila][i];
                        f.write("Biglietto n: "+(n+1)+"\n"+this.toString()+"\n\n");
                        n++;
                        scelta.getSala_p().getPosti()[fila][i].setOccupato(true);
                        posti_occupati.write(scelta.getSala_p().getNumero()+","+scelta.getOrario_p()+","+posto_assegnato.getFila()+","+posto_assegnato.getSedile()+"\n");
                        biglietti_venduti.write(this.toString()+"\n\n");
 
                    }
                    
            }
        }
        f.close();
        posti_occupati.close();
        biglietti_venduti.close();  
    }
    
    /**
     * Restituisce il totale del prezzo da pagare, semplicemente il numero dei biglietti acquistati moltipicato per 5€.
     * @param nb numero di biglietti chiesti
     * @return Totale da pagare
     */
    public String prezzo(int nb){
        return nb*5+" €";
    }


    public Proiezione getScelta() {
        return scelta;
    }

    public void setScelta(Proiezione scelta) {
        this.scelta = scelta;
    }
    
    public void setPosto_assegnato(Posto posto_assegnato) {
        this.posto_assegnato = posto_assegnato;
    }
    
    
    @Override
    public String toString() {
        return "Film: "+scelta.getFilm_p().getTitolo()+"\nOrario: "+scelta.getOrario_p().toString()+"\nSala: "+scelta.getSala_p().getNumero()+"\nPosto: "+ posto_assegnato;
    }
    
    
}
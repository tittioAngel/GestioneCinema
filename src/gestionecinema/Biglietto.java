/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestionecinema;


import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class Biglietto {
    private Proiezione scelta=new Proiezione();
    private Posto p=new Posto(0,0);
    
    //costruttori
    public Biglietto(Proiezione scelta) {
        this.scelta = scelta;
        
    }
    public Biglietto(){
    }
    //metodi
    
    //Stampa i biglietti richiesti
    public void stampaBiglietti(int nb) throws IOException{
        FileWriter f=new FileWriter("src\\gestionecinema\\biglietto.txt");
        int n=0;//tiene conto dei biglietti stampati
        for(int i=0;i<scelta.getSala_p().getNf();i++){ // scorriamo le file
            if(scelta.getSala_p().liberiFila(i)>=nb){ //vediamo se nella fila ci sono abbastanza posti
                for (int j=0;j<scelta.getSala_p().getGf();j++){ //scorriamo i sedili
                    if(scelta.getSala_p().getPosti()[i][j].getOccupato()==false && n<nb){ //se il sedile è non occupato e non abbiamo ancora stampato tutti i biglietti
                        f.write("Biglietto numero: "+(n+1)+"\n");//System.out.println(scelta.getFilm_p().getTitolo()+"  ora: "+scelta.getOrario_p().toString()+"\n"+scelta.getSala_p().getNumero()+" Posto: "+scelta.getSala_p().getPosti()[i][j]);
                        f.write("Film: "+scelta.getFilm_p().getTitolo()+"\nOrario: "+scelta.getOrario_p().toString()+"\nSala: "+scelta.getSala_p().getNumero()+"\nPosto: "+scelta.getSala_p().getPosti()[i][j]);
                        f.write("\n\n");
                        scelta.getSala_p().occupaPosto(scelta.getSala_p().getPosti()[i][j]); // rendiamo il posto occupato
                        n++;// aggiorniamo i biglietti stampati
                    }
                }
            }
                
        }
        f.close();
    }

    public Proiezione getScelta() {
        return scelta;
    }

    public void setScelta(Proiezione scelta) {
        this.scelta = scelta;
    }
    
    public Posto getP() {
        return p;
    }

    public void setP(Posto p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "Biglietto{" + "scelta=" + scelta + ", p=" + p + '}';
    }
    
    
}
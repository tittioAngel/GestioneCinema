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

    public Biglietto(Proiezione scelta) {
        this.scelta = scelta;
        
    }
    public Biglietto(){
        
    }

    public void trovaPosto(Posto p,int nb) throws IOException{
        boolean trovato=false;
        int f=p.getFila();
       // int postiliberiFila=scelta.getSala_p().liberiFila(p.getFila());
        if(scelta.getSala_p().pieno())
            JOptionPane.showMessageDialog(null,"LA SALA E' PIENA");
        else{
            while(trovato==false){
                if(scelta.getSala_p().liberiFila(p.getFila())<=nb){
                    trovato=true;
                    stampaBiglietti(p,nb);
                }else{
                    p.setFila(f+1);
                    p.setSedile(0);
                    trovaPosto(p,nb);
            }
        }
        }

    }

    private void stampaBiglietti(Posto p,int nb) throws IOException{
        int n=0;
        FileWriter b = new FileWriter("Biglietti.txt");
        for(int i=0;i<nb;i++){
            if(scelta.getSala_p().getPosti()[p.getFila()][p.getSedile()].getOccupato()==false)
            {
                System.out.println("Film: "+scelta.getFilm_p().getTitolo()+"   Ora: "+scelta.getOrario_p()+"\nSala: "+scelta.getSala_p().getNumero()+"  Posto: "+p.toString());
                b.write("Film: "+scelta.getFilm_p().getTitolo()+"   Ora: "+scelta.getOrario_p()+"\nSala: "+scelta.getSala_p().getNumero()+"  Posto: "+p.toString());
                scelta.getSala_p().occupaPosto(p);
                n=p.getSedile()+1;
                p.setSedile(n);
            }
         }
         
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
    
    
}
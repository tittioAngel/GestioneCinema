
package gestionecinema;

import java.util.ArrayList;


public class Sala {
    private int nf; // numero di file
    private int nposti; 
    private int gf; //numero di sedili per fila
    private int numero;
    private Posto posti[][];
    private int nLiberi=0;

    //costruttori
    public Sala(int numero){
        this.numero = numero;
        switch(numero){
            case 1: nposti=40;
                    nf=4;
                    
            break;
            case 2: nposti=50;
                    nf=5;
                    
            break;
            case 3: nposti=60;
                    nf=6;
                   
            break;
            case 4: nposti=70;
                    nf=7;
       
            break;
            case 5: nposti=80;
                    nf=8;
     
            break;
        } 
        gf=nposti/nf; // vediamo quanti posti ci sono in una fila
        nLiberi = nposti; 
        posti=new Posto[nf][gf];
        for(int j=0;j<nf;j++){
            for(int i=0;i<posti[j].length;i++){
                posti[j][i]=new Posto(i,j);
            } 
        }
    }

    //metodi
    
    
    //aggiorniamo il numero di posti liberi 
    public void aggiornaPosti(){ 
        nLiberi--;
    }
    
    //ci restituisce se la sala è piena o meno
    public boolean pieno(){
        if (nLiberi!=0) return false; //se la sala non è piena torna falso
        else return true; // se la sala è piena torna true 
    }
    
    //rende un posto occupato
    public void occupaPosto(Posto posto){ 
        posti[posto.getFila()][posto.getSedile()].setOccupato(true);// il posto viene reso occupato
        nLiberi--;
    }
         
    //ci conta i posti liberi in una fila
    public int liberiFila(int f){
        int n=0; //n è il numero di posti liberi
        for(int i=0;i<gf;i++){ //un for per i posti che sono in una fila
            if(!posti[f][i].getOccupato()) // se il posto selezionato è occupato aggiorniamo n 
               n++; 
        }
        return n;
    }
    
    
    public int getNf() {
        return nf;
    }

    public int getNposti() {
        return nposti;
    }

    public int getGf() {
        return gf;
    }

    public int getNumero() {
        return numero;
    }

    public Posto[][] getPosti() {
        return posti;
    }
    
    public void getMatrice() {
        for(int i=0;i<nf;i++){
            for(int j=0;j<posti[i].length;j++){
                System.out.print(posti[i][j].toString()+"  ");
            }
            System.out.println(" ");
        }
    }

    public int getnLiberi() {
        return nLiberi;
    }

   /* @Override
    public String toString() {
        return numero+""+;
    }*/

    @Override
    public String toString() {
        return "Sala{" + "nf=" + nf + ", nposti=" + nposti + ", gf=" + gf + ", numero=" + numero +", nLiberi=" + nLiberi + '}';
    }
    

    
    
    
}

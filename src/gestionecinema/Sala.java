
package gestionecinema;

import java.util.ArrayList;


public class Sala {
    private int nf; // numero di file
    private int nposti; 
    private final int sf = 10; //numero di sedili per fila
    private int numero;
    private Posto posti[][];

    //costruttori
    /**
     * Rispetto al numero della sala vengono assegnati  il numero di posti e di file.
     * Per la sala 1 ci saranno 40 posti e 4 file;
     * per la sala 2 ci saranno 50 posti e 5 file;
     * per la sala 3 ci saranno 60 posti e 6 file;
     * per la sala 2 ci saranno 70 posti e 7 file;
     * per la sala 2 ci saranno 80 posti e 8 file;
     * Viene poi creata la matrice di posti rispetto alle dimensioni
     * @param numero int che identifica la sala
     */
    
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
        posti=new Posto[nf][sf];
        for(int j=0;j<nf;j++){
            for(int i=0;i<posti[j].length;i++){
                posti[j][i]=new Posto(i,j);
            } 
        }
    }

    //metodi
    
    /**
     * Ci dice se la sala è piena o meno
     * @return ci torna true se la sala è piena altrimenti torna falso
     */
    public boolean Pieno(){
        for(int i=0; i< nf; i++){
            for(int j=0; j<sf; j++){
                if(posti[i][j].getOccupato() == false)
                    return false;
            }
        }
        return true; 
    }
    
    /**
     * rende un determinato posto occupato 
     * @param posto  Posto
     */
    public void occupaPosto(Posto posto){ 
        posti[posto.getFila()][posto.getSedile()].setOccupato(true);// il posto viene reso occupato
    }
         
    /**
     * Ci conta il numero di posti liberi nella fila data 
     * @param f int, fila chiesta 
     * @return int, il numero di posti liberi nella fila
     */
    public int liberiFila(int f){
        int n=0; //n è il numero di posti liberi
        for(int i=0;i<sf;i++){ //un for per i posti che sono in una fila
            if(posti[f][i].getOccupato()==false) // se il posto selezionato è occupato aggiorniamo n 
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
        return sf;
    }

    public int getSf() {
        return sf;
    }

    public int getNumero() {
        return numero;
    }

    public Posto[][] getPosti() {
        return posti;
    }
    
    public int numPostiLiberi(){
        int nLiberi = 0;
        for(int i=0; i< nf; i++){
            for(int j=0; j<sf; j++){
                if(posti[i][j].getOccupato() == false)
                    nLiberi++;
            }
        }
        return nLiberi; 
    }
    
    public int trovaFila(int numBiglietti){
        int n=0;
        for(int i=0; i< nf; i++){
            for(int j=0; j<sf; j++){
                if(posti[i][j].getOccupato() == false && n<numBiglietti)
                    n++;    
            }
            if(n==numBiglietti)
                return i;
            else n=0;
        } 
        return -1;
    }

    @Override
    public String toString() {
        return "Sala{" + "nf=" + nf + ", nposti=" + nposti + ", gf=" + sf + ", numero=" + numero + '}';
    }
    

    
    
    
}

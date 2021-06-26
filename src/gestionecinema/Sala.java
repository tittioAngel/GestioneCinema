
package gestionecinema;


public class Sala {
    private final int nf=10; // numero di file
    private int nposti; 
    private int gf; //numero di sedili per fila
    private int numero;
    private Posto[][] posto;
    private int nLiberi;

    public Sala(int numero, Posto[][] posto, int nLiberi,int nposti) {
        this.numero = numero;
        this.posto = posto;
        this.nLiberi = nposti;
        this.nposti=nposti;
        this.gf=nposti/nf; // vediamo quanti posti ci sono in una fila
        posto=new Posto[nf][gf];
    }
    
    public Sala(int numero){
        this.numero = numero;
    }
    
    public void AggiornaPosti(){ //aggiorniamo il numero di posti liberi 
        nLiberi--;
    }
    
    
    public boolean Pieno(){
        if (nLiberi!=0) return false; //se la sala non è piena torna falsa 
        else return true; // se la sala è piena torna true 
    }
    
    
     public void PostoOccupato(Posto posto){
         for(int i =0;i<nf;i++){ //cerchiamo il posto chiesto
             for(int j=0;j<gf;j++){
                 if (this.posto[i][j]==posto){
                     this.posto[i][j].setOccupato(true);// il posto viene reso occupato
                     this.AggiornaPosti();
                     return;
                 }
             }
         }
     }
     
     
    public int LiberiFila(Fila f){
        int n=0;
        for(int i =0;i<gf;i++){
            if(!posto[f.ordinal()][i].isOccupato())
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

    public Posto[][] getPosto() {
        return posto;
    }

    public int getnLiberi() {
        return nLiberi;
    }

    @Override
    public String toString() {
        return numero+"";
    }

    
    
    
}

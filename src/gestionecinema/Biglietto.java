

package gestionecinema;


import java.io.*;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;


public class Biglietto {
    
    private Proiezione scelta = new Proiezione();
    private Posto posto_assegnato = new Posto();
    
    
    public Biglietto(Proiezione scelta, Posto p) {
        this.scelta = scelta;
        this.posto_assegnato = p;    
    }
    
    public Biglietto(){
    }

    public void setPosto_assegnato(Posto posto_assegnato) {
        this.posto_assegnato = posto_assegnato;
    }
    
    
    /**
     * Stampa i biglietti richiesti in maniera appropriata rispetto alla quantità richiesta
     * Verranno stampati in un documento di testo chiamato biglietto.txt
     * @param nb numero di biglietti richiesti
     * @throws IOException 
     */
    public void stampaBiglietti(int nb) throws IOException{
        FileWriter f=new FileWriter("src\\gestionecinema\\biglietto.txt");
        File storico_biglietti=new File("src\\gestionecinema\\storico_biglietti.txt");
        Writer output = null;
        output = new BufferedWriter(new FileWriter(storico_biglietti, true));
        
        
        int n=0;// tiene conto dei posti assegnati 
        int fila = scelta.getSala_p().trovaFila(nb);
        
        if( scelta.getSala_p().trovaFila(nb) == -1){  // vediamo se ci sono abbastanza posti consecutivi
            JOptionPane.showMessageDialog(null, "La sala "+scelta.getSala_p().getNumero()+" alle ore "+scelta.getOrario_p().toString()+" non ha abbastanza POSTI LIBERI consecutivi","ATTENZIONE!!",ERROR_MESSAGE);
        }else{
            for(int i=0;i<scelta.getSala_p().getSf()&& n<nb;i++){
                    //p=scelta.getSala_p().getPosti()[fila][i];
                    if(!scelta.getSala_p().getPosti()[fila][i].getOccupato()){
                        posto_assegnato=scelta.getSala_p().getPosti()[fila][i];
                        f.write("Biglietto n: "+(n+1)+"\n"+"Film: "+scelta.getFilm_p().getTitolo()+"  Sala: "+scelta.getSala_p().getNumero()+" Ora:"+scelta.getOrario_p()+"\n Posto: "+posto_assegnato.toString());
                        f.write("\n\n");
                        n++;
                        scelta.getSala_p().getPosti()[fila][i].setOccupato(true);
//                        System.out.println(posto_assegnato);
//                        System.out.println(posto_assegnato.getOccupato());
                        output.write(scelta.getSala_p().getNumero()+","+scelta.getOrario_p()+","+posto_assegnato.getFila()+","+posto_assegnato.getSedile());
                        output.write("\n");
 
                    }
                    
            }
        }
        f.close();
        output.close();
        
            
        
    }
    /**
     * Restituisce il totale del prezzo da pagare
     * @param nb numero di biglietti chiesti
     * @return String
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
    
    @Override
    public String toString() {
        return "Film: "+scelta.getFilm_p().getTitolo()+"\nOrario: "+scelta.getOrario_p().toString()+"\nSala: "+scelta.getSala_p().getNumero()+"\nPosto: "+ posto_assegnato;
    }
    
    
}
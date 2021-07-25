

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
        
        int fila = scelta.getSala_p().trovaFila(nb);
        if(fila == -1){
            JOptionPane.showMessageDialog(null, "La sala "+scelta.getSala_p().getNumero()+" alle ore "+scelta.getOrario_p().toString()+" non ha abbastanza POSTI LIBERI consecutivi","ATTENZIONE!!",ERROR_MESSAGE);
        }
        else{
            boolean stampa= true;
            int i=0;
            while(stampa){
                if(scelta.getSala_p().getPosti()[fila][i].getOccupato()==false){
                    Posto p = new Posto(fila,i);
                    posto_assegnato = p;
                    for(int n=0;n<nb;n++){
                        f.write("Biglietto numero: "+(n+1)+"\n");
                        f.write(this.toString());
                        i++;
                    }
                    stampa=true; 
                }
                i++;
                
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
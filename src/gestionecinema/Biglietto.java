

package gestionecinema;


import java.io.*;
import javax.swing.JOptionPane;


public class Biglietto {
    private Proiezione scelta=new Proiezione();
    //costruttori
    public Biglietto(Proiezione scelta) {
        this.scelta = scelta;
        
    }
    public Biglietto(){
    }
    //metodi
    
    /**
     * Stampa i biglietti richiesti in maniera appropriata rispetto alla quantità richiesta
     * Verranno stampati in un documento di testo chiamato biglietto.txt
     * @param nb numero di biglietti richiesti
     * @throws IOException 
     */
    public void stampaBiglietti(int nb) throws IOException{
        FileWriter f=new FileWriter("src\\gestionecinema\\biglietto.txt");
        File storico_biglietti=new File("src\\gestionecinema\\storico_biglietti.txt");
        File posti_occupati=new File("src\\gestionecinema\\posti_occupati.txt");
        Writer output = null;
        output = new BufferedWriter(new FileWriter(storico_biglietti, true));
        int n=0;//tiene conto dei biglietti stampati
        if(scelta.getSala_p().getnLiberi()>=nb){
            for(int i=0;i<scelta.getSala_p().getNf();i++){ // scorriamo le file
                if(scelta.getSala_p().liberiFila(i)>=nb){ //vediamo se nella fila ci sono abbastanza posti
                    for (int j=0;j<scelta.getSala_p().getGf();j++){ //scorriamo i sedili
                        if(scelta.getSala_p().getPosti()[i][j].getOccupato()==false && n<nb){//se il sedile è non occupato e non abbiamo ancora stampato tutti i biglietti
                            f.write("Biglietto numero: "+(n+1)+"\n");
                            f.write("Film: "+scelta.getFilm_p().getTitolo()+"\nOrario: "+scelta.getOrario_p().toString()+"\nSala: "+scelta.getSala_p().getNumero()+"\nPosto: "+scelta.getSala_p().getPosti()[i][j]);
                            f.write("\n\n");
                            output.write("Film: "+scelta.getFilm_p().getTitolo()+"\nOrario: "+scelta.getOrario_p().toString()+"\nSala: "+scelta.getSala_p().getNumero()+"\nPosto: "+scelta.getSala_p().getPosti()[i][j]);
                            output.write("\n\n");
                            scelta.getSala_p().occupaPosto(scelta.getSala_p().getPosti()[i][j]); // rendiamo il posto occupato
                            n++;// aggiorniamo i biglietti stampati
                        }
                    }
                }
                
            }
            for(int i=0;i<50;i++){
                output.write("-");
            }
            output.write("\n");
            f.close();
            output.close();
        }else{
            JOptionPane.showMessageDialog(null, "ATTENZIONE!!\nLa sala "+scelta.getSala_p().getNumero()+" alle ore "+scelta.getOrario_p().toString()+" non ha abbastanza POSTI LIBERI");
        }
            
        
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
        return "Biglietto{" + "scelta=" + scelta;
    }
    
    
}
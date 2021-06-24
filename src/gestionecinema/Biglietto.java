
package gestionecinema;


import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class Biglietto {
    private Proiezione scelta;
    private int nb;
    private Posto p=new Posto(0,Fila.A);
    
    public Biglietto(Proiezione scelta, int nb) {
        this.scelta = scelta;
        this.nb = nb;
    }
    
    public void trovaPosto(Posto p) throws IOException{
        boolean trovato=false;
        
        if(scelta.getSala_p().Pieno())
            JOptionPane.showMessageDialog(null,"LA SALA E' PIENA");
        else{
            while(!trovato){
                if(scelta.getSala_p().LiberiFila(p.getFila())>=nb){
                trovato=true;
                stampaBiglietti(p);
            }else{
               Fila f=p.getFila();
               f.Avanza(f);
               p.setFila(f);
               trovaPosto(p);
            }
        }
        }
            
    }
    
    public void stampaBiglietti(Posto p) throws IOException{
         FileWriter b = new FileWriter("Biglietti.txt");
         for(int i=0;i<nb;i++){
            if(scelta.getSala_p().getPosto()[p.getFila().ordinal()][p.getSedile()].isOccupato())
            {
                b.write("Film: "+scelta.getFilm_p()+"   Ora: "+scelta.getOrario_p()+"\nSala: "+scelta.getSala_p()+"  Posto: "+p.toString());
                scelta.getSala_p().PostoOccupato(p);
                scelta.getSala_p().AggiornaPosti();
                int n=p.getSedile()+1;
                p.setSedile(n);
            }
         }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionecinema;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author matte
 */
public class GestioneCinema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Catalogo c = new Catalogo();
        c.riempiCatalogo();
        
        Proiezione p= new Proiezione();
        p=c.getCatalogo_consultabile().get(0);
        Biglietto b=new Biglietto(p);
        Posto s=new Posto(0,0);
        //System.out.println(c.proiezioneScelta(p.getFilm_p().getTitolo(),p.getOrario_p(),p.getSala_p().getNumero()));
        //System.out.println(p.getSala_p().getNposti()+"    "+p.getSala_p().getNf()+"  "+p.getSala_p().getGf());
        //p.getSala_p().getMatrice();
        b.trovaPosto(s,2);
        System.out.println(p.getSala_p().liberiFila(0));
//        System.out.println("Seconda richiesta \n");
//        b.trovaPosto(s,5);
//        System.out.println("Terza richiesta\n");
//        b.trovaPosto(s,5);


        
   
        
//      
//        Interfaccia i=new Interfaccia();
//       
//       
//        //inserisco i nomi dei film nella lista 
//        String []s=new String[c.listaTitoliFilm().size()];
//        for (int j=0;j<c.listaTitoliFilm().size();j++){
//            s[j]=(String) (c.listaTitoliFilm().get(j));
//        } 
//        
//        i.listaTitoli.setListData(s);
//        i.listaTitoli.getLastVisibleIndex();
//
//        //in base agli orari al numero di biglietti mi stampa i biglietti 
//        
//        i.setVisible(true);
//        
        
       
    }
    
}

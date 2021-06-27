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
        
        Proiezione p;
        p=c.getCatalogo_consultabile().get(0);
        Biglietto b=new Biglietto(p);
        System.out.println("stampa 1");
        b.stampaBiglietti(6); 
//        System.out.println("stampa 2");
//        b.stampaBiglietti(5);
//        System.out.println("stampa 3");
//        b.stampaBiglietti(2);
//        System.out.println(p.getSala_p().getnLiberi());
        //System.out.println(p.getSala_p().liberiFila(0));
       
        
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

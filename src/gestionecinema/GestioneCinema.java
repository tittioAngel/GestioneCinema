/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionecinema;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author matte
 */
public class GestioneCinema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
       Catalogo c = new Catalogo();
        c.riempiCatalogo();
        
        Interfaccia i=new Interfaccia();
       
       
        //inserisco i nomi dei film nella lista 
        String []s=new String[c.listaTitoliFilm().size()];
        for (int j=0;j<c.listaTitoliFilm().size();j++){
            s[j]=(String) (c.listaTitoliFilm().get(j));
        } 
        
        i.listaTitoli.setListData(s);
        i.listaTitoli.getLastVisibleIndex();

        //in base agli orari al numero di biglietti mi stampa i biglietti 
        
        i.setVisible(true);
        
        
       
    }
    
}

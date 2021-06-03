/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionecinema;

import java.util.ArrayList;

/**
 *
 * @author matte
 */
public class Catalogo {
    
    //Attributi
    private ArrayList<Proiezione> catalogo_consultabile;
    
    //Costruttori
    public Catalogo(ArrayList<Proiezione> catalogo_consultabile) {
        this.catalogo_consultabile = catalogo_consultabile;
    }
    
    
}

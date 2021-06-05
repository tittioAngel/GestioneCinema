/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionecinema;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author matte
 */
public class Catalogo {
    
    //Attributi
    private ArrayList<Proiezione> catalogo_consultabile;
    
    //Costruttori
    public Catalogo() {
        
    }
    
    //Metodi
    
    //forma il catalogo con tutte le proiezioni
    public void riempiCatalogo() throws FileNotFoundException{
        File in = new File("C:\\Users\\matte\\OneDrive\\Documents\\NetBeansProjects\\GestioneCinema\\src\\gestionecinema\\proiezioni.txt");
        Scanner input = new Scanner(in);
        while(input.hasNextLine()){
            Proiezione p = new Proiezione();
            String titolo = input.nextLine();
            String genere = input.nextLine();
            String regista = input.nextLine();
            int durata = input.nextInt();
            int anno = input.nextInt();
            String vuoto = input.nextLine();
            String nazione = input.nextLine();
            String distribuzione = input.nextLine();
            String trama = input.nextLine();
            p.setFilm_p(new Film(titolo, genere, regista, durata, anno, nazione, distribuzione, trama));
            System.out.print(p);
        }
    }
    
    //seleziona i titoli dei film da, successivamente, visualizzare senza ripetersi
    public ArrayList selezionaTitoloFilm(){
        ArrayList<String> listaTitoli = new ArrayList<String>();        //inizializzo un ArrayList di stringe per contenere i titoli de film di cui abbiamo dele proiezioni
        for(Proiezione p: catalogo_consultabile){                       //scorre tutte le proiezoni nel catalogo
            if(!(p.getFilm_p().getTitolo().equals(listaTitoli))){       //controlla se il titolo del film è già presente nella lista
                listaTitoli.add(p.getFilm_p().getTitolo());
            }
        }
        return listaTitoli;
    }
    
}

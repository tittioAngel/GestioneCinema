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
        this.catalogo_consultabile = new ArrayList<Proiezione>();
    }
    
    //Metodi
    
    /**Inserisce nel catalogo tutte le proiezioni contenute nel file proiezioni.txt
     * Scansiona il file e per ogni proiezione aggiorna il film, la sala e l'orario.
     * @throws FileNotFoundException 
     */
    public void riempiCatalogo() throws FileNotFoundException{
        File in = new File("src\\gestionecinema\\proiezioni.txt");
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
            int numero_sala = input.nextInt();
            String vuoto2 = input.nextLine();
            String orario = input.nextLine();
            String[] parts = orario.split(":");
            int ora = Integer.parseInt(parts[0]);
            int minuto = Integer.parseInt(parts[1]);
            p.setFilm_p(new Film(titolo, genere, regista, durata, anno, nazione, distribuzione, trama));
            p.setSala_p(new Sala(numero_sala));
            p.setOrario_p(new Orario(ora,minuto));
            this.catalogo_consultabile.add(p);
        }
    }
    
    /**Inserisce in un ArrayList i titoli dei film senza ripetersi
     * Andranno poi visualizzati
     * @return lista dei titoli
     */
    public ArrayList listaTitoliFilm(){
        ArrayList<String> listaTitoli = new ArrayList<String>();        //inizializzo un ArrayList di stringe per contenere i titoli de film di cui abbiamo dele proiezioni
        for(Proiezione p: catalogo_consultabile){                       //scorre tutte le proiezoni nel catalogo
            if(!(listaTitoli.contains(p.getFilm_p().getTitolo()))){       //controlla se il titolo del film è già presente nella lista
                listaTitoli.add(p.getFilm_p().getTitolo());
            }
        }
        return listaTitoli;
    }
    
    /**Scelto il titolo di un film seleziona le sale in cui il film è visibile
     * 
     * @param titolo_Film Titolo del film scelto
     * @return lista delle sale per quel determinato film
     */
    
    public Sala visualizzaSalaFilm(String titolo_Film, Orario orario_Film){
        int salaFilm = 0;
        for(Proiezione p:catalogo_consultabile){
            if(p.getFilm_p().getTitolo().equals(titolo_Film) && p.getOrario_p().getOra()==orario_Film.getOra() && orario_Film.getMinuto()==p.getOrario_p().getMinuto()){
                salaFilm = p.getSala_p().getNumero();
            }
        }
 
        for(Proiezione p:catalogo_consultabile){
            if(p.getSala_p().getNumero()==salaFilm)
               return p.getSala_p();
        }
       
        return null;
    }
    
    /**
     * 
     * @param titolo_Film
     * @return 
     */
    public ArrayList visualizzaOrariFilm(String titolo_Film){
        ArrayList<Orario> orariFilm = new ArrayList<Orario>();
        for(Proiezione p:catalogo_consultabile){
            if(p.getFilm_p().getTitolo().equals(titolo_Film)){
                orariFilm.add(p.getOrario_p()); 
            }
        }
        
        return orariFilm;
    }
    
    
    public Proiezione proiezioneScelta(String titolo,Orario ora,Sala s){
        for(int i=0;i<catalogo_consultabile.size();i++){
            if(catalogo_consultabile.get(i).getFilm_p().getTitolo()==titolo && catalogo_consultabile.get(i).getOrario_p().equals(ora) && catalogo_consultabile.get(i).getSala_p().equals(s))
                return catalogo_consultabile.get(i);
        }
        return null;
    }
    public void VisualizzaCatalogo(){
        for(Proiezione p: catalogo_consultabile){
            System.out.println(p);
        }
    }
    
}

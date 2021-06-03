/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionecinema;

/**
 *
 * @author matte
 */
public class Film {
    
    //Attributi
    private String titolo;
    private String genere;
    private String trama;
    private String regista;
    //private Data data_uscita;
    
    //Costruttori
    public Film(String titolo,String genere,String trama,String regista){
        this.titolo=titolo;
        this.genere=genere;
        this.trama=trama;
        this.regista=regista;
    }
    
    //Metodi
    public void setTitolo(String titolo){
        this.titolo=titolo;
    }
    
    public void setGenere(String genere){
        this.genere=genere;
    }
    
    public void setTrama(String trana){
        this.trama=trama;
    }
    
    public void setRegista(String regista){
        this.regista=regista;
    }
    
    public String getTitolo(){
        return titolo;
    }
    
    public String getGenere(){
        return genere;
    }
    
    public String getTrama(){
        return trama;
    }
    
    public String getRegista(){
        return regista;
    }
    
    public String toString(){
        return "Il film "+titolo+" è identificato come "+genere+" ed è stato girato dal regista "+regista+". "+"Questo film parla di: "+trama;    }
    
}

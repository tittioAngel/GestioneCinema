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
    private String regista;
    private int durata;
    private int anno;
    private String nazione;
    private String distribuzione;
    private String trama;
    
    //Costruttori
    public Film(String titolo, String genere, String regista, int durata, int anno, String nazione, String distribuzione, String trama) {
        this.titolo = titolo;
        this.genere = genere;
        this.regista = regista;
        this.durata = durata;
        this.anno = anno;
        this.nazione = nazione;
        this.distribuzione = distribuzione;
        this.trama = trama;
    }
    
    //Metodi
    public String getTitolo(){
        return titolo;
    }
    
    public String getGenere(){
        return genere;
    }
    
    public void setTitolo(String titolo){
        this.titolo=titolo;
    }
    
    public String getTrama(){
        return trama;
    }
    
    public void setGenere(String genere){
        this.genere=genere;
    }
    
    public void setTrama(String trana){
        this.trama=trama;
    }
    
    public String getRegista(){
        return regista;
    }
    
    public void setRegista(String regista){
        this.regista=regista;
    }

    public String getNazione() {
        return nazione;
    }

    public void setNazione(String nazione) {
        this.nazione = nazione;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public String getDistribuzione() {
        return distribuzione;
    }

    public void setDistribuzione(String distribuzione) {
        this.distribuzione = distribuzione;
    }

    @Override
    public String toString() {
        return "Film{" + "titolo=" + titolo + ", genere=" + genere + ", regista=" + regista + ", durata=" + durata + ", anno=" + anno + ", nazione=" + nazione + ", distribuzione=" + distribuzione + ", trama=" + trama + '}';
    }
    
    
}

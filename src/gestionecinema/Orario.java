/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionecinema;

/**
 * Identifica l'orario in c'è una proiezione 
 * @author matte
 */

public class Orario {
    
    //Attributi
    private int ora;
    private int minuto;
    
    //Costruttri
    /**
     * 
     * @param ora int 
     * @param minuto int
     */
    public Orario(int ora,int minuto){
        this.ora=ora;
        this.minuto=minuto;
    }
    
    //Metodi
    public int getOra(){
        return ora;
    }
    
    public void setOra(int ora){
        this.ora=ora;
    }
    
    public int getMinuto(){
        return minuto;
    }
    
    public void setMinuto(int minuto){
        this.minuto=minuto;
    }

    @Override
    public String toString() {
        String min="";
        if(this.equals(null)){
            return null;
        }else{
            if(minuto==0)  min="00";
            else    min=""+minuto;
            return ora + ":" + min;  
        }
            
        
    }

}

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
public class Orario {
    
    //Attributi
    private int ora;
    private int minuto;
    
    //Costruttri
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
        return "Orario{" + "ora=" + ora + ", minuto=" + minuto + '}';
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionecinema;

/**
 * Identifica per ogni film la sala in cui viene proiettato e il corrispondente orario
 * @author matte
 */

public class Proiezione {
    
    private Film film_p;
    private Sala sala_p;
    private Orario orario_p;
    

    public Proiezione() {
    }
    
    /**
     * 
     * @param film_p Film
     * @param orario_p Orario 
     * @param sala_p Sala
     */    
    public Proiezione(Film film_p, Orario orario_p, Sala sala_p){
        this.film_p=film_p;
        this.orario_p=orario_p;
        this.sala_p=sala_p;
    }
    
    
    public Film getFilm_p() {
        return film_p;
    }

    public void setFilm_p(Film film_p) {
        this.film_p = film_p;
    }

    public Orario getOrario_p() {
        return orario_p;
    }

    public void setOrario_p(Orario orario_p) {
        this.orario_p = orario_p;
    }

    public Sala getSala_p() {
        return sala_p;
    }

    public void setSala_p(Sala sala_p) {
        this.sala_p = sala_p;
    }
    
    

    @Override
    public String toString() {
        return film_p + "," + sala_p + "," + orario_p;
    }
    
    
}

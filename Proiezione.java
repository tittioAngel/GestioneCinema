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
public class Proiezione {
    
    //Attributi
    private Film film_p;
    private Data data_p;
    private Orario orario_p;
    private Sala sala_p;
    
    //Costruttore
    public Proiezione(Film film_p, Data data_p, Orario orario_p, Sala sala_p){
        this.film_p=film_p;
        this.data_p=data_p;
        this.orario_p=orario_p;
        this.sala_p=sala_p;
    }
    
    //Metodi
    
    public Film getFilm_p() {
        return film_p;
    }

    public void setFilm_p(Film film_p) {
        this.film_p = film_p;
    }

    public Data getData_p() {
        return data_p;
    }

    public void setData_p(Data data_p) {
        this.data_p = data_p;
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
    
    
}

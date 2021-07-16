/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionecinema;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class GestioneCinema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        Catalogo c = new Catalogo();
        c.riempiCatalogo();
        
        File in = new File("src\\gestionecinema\\storico_biglietti.txt");
        Scanner input = new Scanner(in);
        
        while(input.hasNextLine()){
            String letta = input.nextLine();
            String[] riga = letta.split(",");
            int numSala = Integer.parseInt(riga[0]);
            String[] orario = riga[1].split(":");
            int ora = Integer.parseInt(orario[0]);
            int min = Integer.parseInt(orario[1]);
            int fila = Integer.parseInt(riga[2]);
            int sedile = Integer.parseInt(riga[3]);
            
            Orario orario_p = new Orario(ora,min);
            Posto posto = new Posto(sedile,fila);
            c.proiezioneScelta(orario_p,numSala).getSala_p().occupaPosto(posto);
            
            
        }
        
        Interfaccia i=new Interfaccia();
        i.setVisible(true);
       
    }
    
}

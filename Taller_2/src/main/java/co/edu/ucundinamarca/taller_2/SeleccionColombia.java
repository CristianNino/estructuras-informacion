/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.taller_2;
import static co.edu.ucundinamarca.taller_2.Semana.log;
import java.util.LinkedList;

public class SeleccionColombia {
    
    private LinkedList Jugadores = new LinkedList();

    public LinkedList getJugadores() {
        return Jugadores;
    }

    public void setJugadores(LinkedList Jugadores) {
        this.Jugadores = Jugadores;
    }

    public void  agregarJugadores(String nombre){
        Jugadores.add(nombre);   
    }
    
    public void  mostrarJugadores (){
        for (Object n : Jugadores){
            log.info("los jugadores que representan a la seleccion colombia son: " + n);
            
        }
    }
    
    public void  contieneJugador(String nombreJugador){
        
         for (Object n : Jugadores){
             if (n == nombreJugador){
                 log.info("el nombre del jugador si esta en la seleccion ");
             }
             else{
                 log.info("nombre del jugador no es correcto o no pertenece a la seleccion");
             }
        
            
        }
    }
            
    
    
}

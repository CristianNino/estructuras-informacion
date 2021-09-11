
package co.edu.ucundinamarca.taller_2;

import java.util.*;
import org.apache.log4j.Logger;

public class MainSeleccion {
    static Logger log = Logger.getLogger(Mainpersona.class.getName());
    
    
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        String nombre;
        String nomjugador;
        
        SeleccionColombia d = new SeleccionColombia();
        
        log.info( "inserte un nombre al jugador ");
        nombre = a.next();
        d.agregarJugadores(nombre);
        log.info( "inserte un nombre al jugador ");
        nombre = a.next();
        d.agregarJugadores(nombre);
        log.info( "inserte un nombre al jugador ");
        nombre = a.next();
        d.agregarJugadores(nombre);
                
         log.info( "los jugadores en la eleccion son: ");       
        d.mostrarJugadores();
        

        
        log.info( "digite el nombre del jugador a quien desea buscar ");
        nomjugador = a.next();
        d.contieneJugador(nomjugador);
}
}

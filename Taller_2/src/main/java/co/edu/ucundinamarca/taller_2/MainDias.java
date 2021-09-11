
package co.edu.ucundinamarca.taller_2;

import java.util.*;
import org.apache.log4j.Logger;

public class MainDias {
    
    static Logger log = Logger.getLogger(Mainpersona.class.getName());
    
    
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        int dia;
        
        Semana d = new Semana();
        
        log.info( "los dias de la semana se han cargado: ");
        d.CargarDias();
                
         log.info( "los dias de la semana son: ");       
        d.MostrarDias();
        

        d.cuantosDias();
        
        log.info( "seleccone el dia que quiere buscar: ");
        dia = a.nextInt();
        d.obtenerDia(dia);
}
    
}

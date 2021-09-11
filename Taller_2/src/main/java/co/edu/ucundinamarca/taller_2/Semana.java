
package co.edu.ucundinamarca.taller_2;
import java.util.*;
import org.apache.log4j.Logger;

public class Semana {
    static Logger log = Logger.getLogger(Mainpersona.class.getName());
    
private LinkedList D_semana = new LinkedList();

    public LinkedList getD_semana() {
        return D_semana;
    }

    public void setD_semana(LinkedList D_semana) {
        this.D_semana = D_semana;
    }

    public void CargarDias(){        
        D_semana.add("Lunes");
        D_semana.add("Martes");
        D_semana.add("Mercoles");
        D_semana.add("Jueves");
        D_semana.add("Viernes");
        D_semana.add("sabado");
        D_semana.add("domingo");
    }
    public void MostrarDias(){
        for (Object n : D_semana){
            log.info("dia de la semana: " + n);
            
        }
    }
    
    public void  cuantosDias (){
        log.info("el tamaño de elementos que hay en la  lista son: " + D_semana.size());
    }
    
    public void  obtenerDia(int numDia){
        log.info("el elemnto en la posicion " + numDia + " tiene el dia: " + D_semana.get(numDia - 1));
    }
    
  

 
    
}


package co.edu.ucundinamarca.taller_7;
import org.apache.log4j.Logger;
public class Principal {
    
    static Logger log = Logger.getLogger(Principal.class.getName());
    
    public static void pila(){
        PilaLista pila = new PilaLista();   
        
        pila.insertar(0);
        pila.insertar(1);
        pila.insertar(2);
        pila.insertar(3);
        pila.insertar(4);
        pila.insertar(5);
        pila.insertar(6);
        
        log.info(" " + pila.quitar());
        log.info(" " + pila.quitar());
        log.info(" " + pila.quitar());
        log.info(" " + pila.quitar());
        log.info(" " + pila.quitar());
        log.info(" " + pila.quitar());
        log.info(" " + pila.quitar());   
    }
    
    public static void cola(){
        ColaLista cola = new ColaLista();
        
        cola.insertar(0);
        cola.insertar(1);
        cola.insertar(2);
        cola.insertar(3);
        cola.insertar(4);
        cola.insertar(5);
        cola.insertar(6);
        
        log.info(" " + cola.quitar());
        log.info(" " + cola.quitar());
        log.info(" " + cola.quitar());
        log.info(" " + cola.quitar());
        log.info(" " + cola.quitar());
        log.info(" " + cola.quitar());
    }
    
    public static void main (String [] args){
        cola();
    }
}


package co.edu.ucundinamarca.taller4;

import java.util.*;
import org.apache.log4j.Logger;

public class ListaDoble implements Listable{
    static Logger log = Logger.getLogger(ListaSimple.class.getName());
    static Scanner a = new Scanner(System.in);
    
    @Override
    public void Agregar() {
        Nodo fin = new Nodo();
        Object element1; 
        Object element2; 
        log.info("digite el valor final al nodo");
        element1 = a.next();
        fin.setElemento(element1);
        fin.ObtenerSiguiente(element1);
        Nodo inicial = new Nodo();
        log.info("digite el valor inicial al nodo");
        element2 = a.next();
        inicial.setElemento(element2);
    }

    @Override
    public void Avanzar() {
        Nodo inicio = new Nodo();
        
        inicio.ObtenerSiguiente();
    }

    @Override
    public void Contiene() {
        Nodo inicio = new Nodo();
        
       inicio.ObtenerElemento();
 
    }

    @Override
    public void Iterador() {
        
    }

    @Override
    public void Eliminar() {
        
    }

    @Override
    public void PrimerElemento() {
       Nodo inicio = new Nodo();
       log.info("el primer elemeto es: ");
       inicio.ObtenerElemento(); 
    }

    @Override
    public void Sustituir() {
       Object sus;
       Nodo inicio = new Nodo();
       log.info("digite el elemento que desea sustituir");
       sus = a.next();
       inicio.setElemento(sus);
    }

    @Override
    public void Vaciar() {
        Nodo inicio = new Nodo();
             
       inicio.setElemento(null);
       inicio.setSiguiente(null);
    
    }
    
    
    
}

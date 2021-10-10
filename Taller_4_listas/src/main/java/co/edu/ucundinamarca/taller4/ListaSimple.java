
package co.edu.ucundinamarca.taller4;

import static co.edu.ucundinamarca.taller4.Dulces.imprimirIterando;
import java.util.*;
import static junit.framework.TestCase.assertEquals;
import org.apache.log4j.Logger;
import org.junit.Test;


public class ListaSimple implements Listable{
    static Logger log = Logger.getLogger(ListaSimple.class.getName());
    static Scanner a = new Scanner(System.in);
    
    public void Avanzar() {
        Nodo inicio = new Nodo();
        
        inicio.ObtenerSiguiente();
    }
   
    public void Contiene() {
       Nodo inicio = new Nodo();
        
       inicio.ObtenerElemento();
    }

   

   
    public void PrimerElemento() {
        Nodo inicio = new Nodo();
            
       inicio.ObtenerElemento(); 
    }

   
    public void Sustituir() {
       
       Object sus;
       Nodo inicio = new Nodo();
       log.info("digite el elemento que desea sustituir");
       sus = a.next();
       inicio.setElemento(sus);
    }

   
    public void Vaciar() {
        Nodo inicio = new Nodo();
             
       inicio.setElemento(null);
       inicio.setSiguiente(null);
    
    }
public void Eliminar(){
    /*Object elimina;
       Nodo inicio = new Nodo();
       log.info("digite el elemento que desea eliminar");
       elimina = a.next();
       
       for(int i = 0; i < Nodo.leght; i = i + 1){           
          if (Nodo(i) == elimina){
              inicio.setElemento(null);
          }else{
              log.info("elemento incorrecto o no se encuentra en el nodo");
          }
       }*/
       }



 
    public void Iterador() {
            }

   
    public void Agregar() {
        Nodo inicio = new Nodo();
        Object element; 
        log.info("digite el valor al nodo");
        element = a.next();
        
        inicio.setElemento(element);
    }

    
    @Test
    public void estaVacia(){
        Nodo inicio = new Nodo();
        Object valoresperado = null;
        Object valor = inicio.ObtenerElemento();
        assertEquals(valoresperado, valor);}
}

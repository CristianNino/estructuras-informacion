
package co.edu.ucundinamarca.tallern;

import java.util.Scanner;
import org.apache.log4j.Logger;

public class MainArbol {
    static Logger log = Logger.getLogger(MainArbol.class.getName());
    static Scanner a = new Scanner(System.in);
    
    public static void main(String[] args){
        Arbol arbol = new Arbol();
        
        Nodo nodo = arbol.AgregarRaiz("a");
        arbol.raiz.MostrarValor();
        
        arbol.Agregar(nodo,"b","a");
        arbol.Agregar(nodo,"c","a");
        arbol.Agregar(nodo,"d","a");
        
        arbol.Agregar(nodo,"e","c");
        arbol.Agregar(nodo,"f","c");
        
        arbol.Agregar(nodo,"g","f");
        
        log.info("Musestra los valores en recorrido PreOrden");
        arbol.MostrarPreOrden(nodo);
        log.info(" ");
        log.info("Musestra los valores en recorrido InOrden");
        arbol.MostrarInOrden(nodo);
        log.info(" ");
        log.info("Musestra los valores en recorrido PorNiveles");
        arbol.MostrarPorNiveles(nodo);
        log.info(" ");
    }
}

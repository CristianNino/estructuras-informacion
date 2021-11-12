
package co.edu.ucundinamarca.tallern;

import java.util.Scanner;
import org.apache.log4j.Logger;

public class MainArbol {
    static Logger log = Logger.getLogger(MainArbol.class.getName());
    static Scanner a = new Scanner(System.in);
    
    public static void main(String[] args){
        Arbol arbol = new Arbol();
        
        Nodo nodo = arbol.AgregarRaiz("a");
        
    }
}

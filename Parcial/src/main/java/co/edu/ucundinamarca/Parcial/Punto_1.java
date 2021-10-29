
package co.edu.ucundinamarca.Parcial;

import org.apache.log4j.Logger;
import javax.swing.JOptionPane;
import java.util.*;

public class Punto_1 {
    static Logger log = Logger.getLogger(Punto_1.class.getName());
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        log.info("Por favor ingrese el tamaño de la lista:"); 
        int n = a.nextInt();
        int lista [] = new int [n];
        int mayor = 0;        
        
       for (int i = 0; i < lista.length; i = i + 1) {
            log.info("Ingrese dato "+(i+1)+": ");
            lista [i] = a.nextInt();
        }
       log. info("Los datos de la lista son: ");
       for (int i = 0; i < lista.length; i = i + 1) {
           log.info(lista[i]);
       }
        mayor = lista[0];
        
        for(int i = 0; i < lista.length ; i = i + 1){
            if(lista [i] >= mayor) {
                mayor = lista[i];
            }
        }
     
        log.info("El mayor valor es: "+ mayor);
        
        
    }
}

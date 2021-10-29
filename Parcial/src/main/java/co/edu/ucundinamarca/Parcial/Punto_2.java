
package co.edu.ucundinamarca.Parcial;

import org.apache.log4j.Logger;
import javax.swing.JOptionPane;
import java.util.*;

public class Punto_2 {
    
    static Logger log = Logger.getLogger(Punto_2.class.getName());
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        log.info("Por favor ingrese el tamaño de la lista:"); 
        int n = a.nextInt();
        int lista [] = new int [n];
        int contador[] = new int [100];
        int numero;      
        
       for (int i = 0; i < lista.length; i = i + 1) {
            log.info("Ingrese dato "+(i+1)+": ");
            lista [i] = a.nextInt();
        }
       
       log. info("Los datos de la lista son: ");
       for (int i = 0; i < lista.length; i = i + 1) {
           log.info(lista[i]);
       }
       
       for(int x = 0; x < lista.length; x = x +1){
            contador[lista[x]] += 1;
       }
       for(int y = 0; y < lista.length; y = y + 1){
           log.info("El dato " + lista[y] + "se repite "+ contador[y] + "veces");
       }
    }
}

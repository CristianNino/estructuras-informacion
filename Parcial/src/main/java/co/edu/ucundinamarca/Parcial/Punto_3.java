
package co.edu.ucundinamarca.Parcial;

import java.util.*;
import org.apache.log4j.Logger;
import javax.swing.JOptionPane;

public class Punto_3 {
     public static String Dat[];
     static Logger log = Logger.getLogger(Punto_3.class.getName());
    public static void main(String[] args) {
        
    
        Scanner Datos=new Scanner(System.in);
         ArrayList listas=new ArrayList(); 
         
        int limite;
        String buscar;
        int elem;
        int resp;
        
        log.info("Ingrese el numero de soldados que hay: ");
        limite=Datos.nextInt();
        Dat=new String[limite];
       
        AlmacenarElementosArrayList(Dat, listas, Datos);
     
        log.info("los soldados son: ");
        MostrarElementosArrayList(listas);
        
        log.info("-- Inicia el juego -- ");
        
         elem = (int)(Math.random() * Dat.length);
        EliminarElementoArrayList(listas, elem);
    
        log.info("los soldados restantes son: ");
        MostrarElementosArrayList(listas);   
        
        elem = (int)(Math.random() * (Dat.length - 1));
        EliminarElementoArrayList(listas, elem);
    
        log.info("los soldados restantes son: ");
        MostrarElementosArrayList(listas); 
        
}
    public static void AlmacenarElementosArrayList(String Array[],ArrayList list,Scanner sc){
        for(int i=0;i<Array.length;i++){
            log.info("Ingrese el Nombre ["+i+"] --> ");
            Array[i]=sc.next();
            list.add(Array[i]);
        }
    }
    /// Método para Mostrar los Elementos del ArrayLits
    public static void MostrarElementosArrayList(ArrayList list){
       list.forEach((lista)->{
           log.info("* "+lista);
       });
    }

    /// Método para eliminar elemento de un ArrayList
    public static void EliminarElementoArrayList(ArrayList list,int elemento){
        list.remove(elemento);
    }
}


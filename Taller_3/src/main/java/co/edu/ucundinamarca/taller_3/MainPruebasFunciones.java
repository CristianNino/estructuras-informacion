
package co.edu.ucundinamarca.taller_3;

import java.util.*;
import org.apache.log4j.Logger;

public class MainPruebasFunciones {
    static Logger log = Logger.getLogger(Main.class.getName());
    static Scanner a = new Scanner(System.in);
    
    public static void main(String[] args) {
        
       log.info("Ingrese un numero para hallar su factorial");
       int num = a.nextInt();
        
       Funciones x = new Funciones (num);
        
       x.Factorial(num);
       x.FactorialRec(num);
       
       log.info("digite la base de la potencia");
        int base = a.nextInt();
           
       log.info("digite el exponente de la potencia");
       int exponente = a.nextInt();
       
       x.potencia(base, exponente);
        

        
        
       
 
    
    
}
}

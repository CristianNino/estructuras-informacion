
package co.edu.ucundinamarca.taller_2;

import java.util.Scanner;
import org.apache.log4j.Logger;

/**
 * Clase Principal
 * @author handresortiz
 */
public class Mainpersona {

    static Logger log = Logger.getLogger(Mainpersona.class.getName());

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        String nombre1;
        int edad1;
        int altura1;
        int identificacion1;
        String nombre2;
        int edad2;
        int altura2;
        int identificacion2;
        
        
        
        log.info(" informacion de la persona 1");
        
        log.info(" digite el nombre de la persona 1");
        nombre1 = a.next();
        log.info(" digite la edad de la persona 1");
        edad1 = a.nextInt();
        log.info(" digite la altura de la persona 1 en cm");
        altura1 = a.nextInt();
        log.info(" digite la identificacion de la persona 1");
        identificacion1 = a.nextInt();
        
        log.info(" informacion de la persona 2");

        log.info(" digite el nombre de la persona 2");
        nombre2 = a.next();
        log.info(" digite la edad de la persona 2");
        edad2 = a.nextInt();
        log.info(" digite la altura de la persona 2 en cm");
        altura2 = a.nextInt();
        log.info(" digite la identificacion de la persona 2");
        identificacion2 = a.nextInt();
        
        
       persona persona1 = new persona(nombre1, edad1, altura1, identificacion1);
       persona persona2 = new persona(nombre2, edad2, altura2, identificacion2);
       
       if (persona1.equals(persona2)) {
            System.out.println("******* los objetos a comparar son iguales *********");
        } else {
            System.out.println("******* los objetos a comparar son distintos *********");
        }
    }

}

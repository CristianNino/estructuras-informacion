
package co.edu.ucundinamarca.taller_2;

import java.util.Scanner;
import org.apache.log4j.Logger;

public class MainAnimal {
    
    static Logger log = Logger.getLogger(Mainpersona.class.getName());

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        String nombre1;
        int patas1;
        String especie1;
        int edad1;
        int identificacion1;
        String nombre2;
        int patas2;
        String especie2;
        int edad2;
        int identificacion2;
 
        
        
        
        log.info(" informacion del animal 1");
        
        log.info(" digite el nombre del animal 1");
        nombre1 = a.next();
        log.info(" digite el numero de patas del animal 1");
        patas1 = a.nextInt();
        log.info(" digite la especie del animal 1");
        especie1 = a.next();
        log.info(" digite la edad del animal 1");
        edad1 = a.nextInt();
        log.info(" digite la identificacion de la persona 1");
        identificacion1 = a.nextInt();
        
        log.info(" informacion del animal 2");
        
        log.info(" digite el nombre del animal 2");
        nombre2 = a.next();
        log.info(" digite el numero de patas del animal 2");
        patas2 = a.nextInt();
        log.info(" digite la especie del animal 2");
        especie2 = a.next();
        log.info(" digite la edad del animal 2");
        edad2 = a.nextInt();
        log.info(" digite la identificacion de la persona 2");
        identificacion2 = a.nextInt();
        

        
        
       Animal animal1 = new Animal(nombre1, patas1, especie1, edad1, identificacion1);
       Animal animal2 = new Animal(nombre2, patas2, especie2, edad2, identificacion2);
       
       if (animal1.equals(animal2)) {
            System.out.println("******* los objetos a comparar son iguales *********");
        } else {
            System.out.println("******* los objetos a comparar son diferentes *********");
        }
    }
    
}

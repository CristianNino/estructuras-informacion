
package video;

import java.util.*;
import org.apache.log4j.Logger;

public class PrincipalPunto2 {
    static Logger log = Logger.getLogger(PrincipalPunto2.class.getName());  
    public static void main (String[] args){
      Scanner a = new Scanner(System.in);
      
      ListaPunto2 lista1 = new ListaPunto2();
      int opcion = 0;
      
      do{
          log.info("--- Ingrese una opcion ---");
          log.info("1. Ingresar un Nodo");
          log.info("2. Mostrar la lista");
          log.info("3. Buscar en la lista");
          log.info("4. Modificar");
          log.info("5. salir");
          opcion = a.nextInt();
          
          switch(opcion){
              case 1:
               log.info("1. Ingresar un Nodo");
               int dato = a.nextInt();
               
               lista1.Ingresar(dato);
               break;
               
              case 2:
                  log.info("2. Mostrar la lista");
                  lista1.Mostrar();
                  break;  
              case 3:
                  log.info("3. Buscar en la lista");
                  log.info("Ingrese un dato a buscar");
                  int dato3 = a.nextInt();
                  lista1.Buscar(dato3);
                  break;
              case 4:
                  log.info("4. Modificar");
                  log.info("Ingrese un dato a modificar");
                  int dato4 = a.nextInt();
                  lista1.Modificar(dato4);
              case 5:
                  log.info("5. salir");
                  log.info("Proceso funalizado");
          }
      }while(opcion != 5);
      
    }
}

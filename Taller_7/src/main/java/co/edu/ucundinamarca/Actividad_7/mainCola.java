
package co.edu.ucundinamarca.Actividad_7;

import java.util.Scanner;
import org.apache.log4j.Logger;

public class mainCola {
       static Logger log = Logger.getLogger(mainCola.class.getName());  
    public static void main (String[] args){
      Scanner a = new Scanner(System.in);
      
      int opcion = 0;
      String nodo_informacionLibro;
      int nodo_informacionIde;
      
      Cola turnos = new Cola();
      do{
          log.info("--- Ingrese una opcion ---");
          log.info("1. Ingresar datos");
          log.info("2. Mostrar la lista");
          log.info("3. Quitar");
          log.info("4. salir");
          opcion = a.nextInt();
          
          switch(opcion){
              case 1:
                  log.info("1. Ingresar datos");
               log.info("1. Ingrese la identificacion de la persona");
               nodo_informacionIde = a.nextInt();
               log.info("1. Ingrese el nombre del libro a alquilar");
               nodo_informacionLibro = a.next();
               turnos.InsertarIde(nodo_informacionIde);
               turnos.InsertarLibro(nodo_informacionLibro);
               break;
               
              case 2:
                  log.info("2. Mostrar la lista");
                  turnos.MostrarContenidoIde();
                  turnos.MostrarContenidoLibro();
                  break;  
              case 3:
                  log.info("3. Quitar");
                  log.info("se extrajo la persona con identificacion: " + turnos.ExtraerIde());

                  log.info("se extrajo el libro con nombre: " + turnos.Extraerlibro());
                  break;
              case 4:
                  log.info("5. salir");
                  log.info("Proceso funalizado");
          }
      }while(opcion != 4);
      
    }
    
}

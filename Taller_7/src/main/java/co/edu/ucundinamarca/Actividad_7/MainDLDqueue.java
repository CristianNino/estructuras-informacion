
package co.edu.ucundinamarca.Actividad_7;
import java.util.*;
import org.apache.log4j.Logger;
public class MainDLDqueue {
    static Logger log = Logger.getLogger(MainDLDqueue.class.getName());  
   public static void main(String args[]) {
       Scanner a = new Scanner(System.in);
       
       int opcion = 0;
       Object dato;
       DLDqueue deque = new DLDqueue();
    
    do{
          log.info("--- Ingrese una opcion ---");
          log.info("1. Insertar un objeto en la cabeza");
          log.info("2. Inserta un objeto en la cola");
          log.info("3. Extrae un objeto de la cabeza");
          log.info("4. Extrae un objeto de la cola");
          log.info("5. Devolver el número de objetos almacenados");
          log.info("6. Mostrar ");
          log.info("7. salir");
          
          opcion = a.nextInt();
          
          switch(opcion){
              case 1:
                  log.info("1. Insertar un objeto en la cabeza");
               log.info("Digite el objeto que desea agregar");
                dato = a.nextInt();
                deque.InsertarPrimer(dato);
               break;
              case 2:
                  log.info("2. Insertar un objeto en la cola");
               log.info("Digite el objeto que desea agregar");
                dato = a.nextInt();
                deque.InsertarUltimo(dato);
               break;  
              case 3:
                  log.info("3. Extrae un objeto de la cabeza");
                  deque.removeFirst();
                  break;
              case 4:
                  log.info("3. Extrae un objeto de la cola");
                  deque.removeLast();
                  break;
              case 5:
                  log.info("Devolver el número de objetos almacenados");
                  log.info("el tamaño atual de la pila es: " + deque.size());
                  break;
              case 6:
                  log.info("6. Mostrar ");
                  log.info(" " + deque.Mostrar());
                  break;
              case 7:
                  log.info("7. salir");
                  log.info("Proceso finalizado");
                  break;
          }
      }while(opcion != 7);
}
}

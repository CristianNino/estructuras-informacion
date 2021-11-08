
package co.edu.ucundinamarca.Actividad_7;
import java.util.*;
import org.apache.log4j.Logger;
public class MainPila {
    static Logger log = Logger.getLogger(MainPila.class.getName());  
   public static void main(String args[]) {
       Scanner a = new Scanner(System.in);
       
       int opcion = 0;
       Object dato;
       Pila stack = new Pila();
    
    do{
          log.info("--- Ingrese una opcion ---");
          log.info("1. Insertar un objeto en la pila (push).");
          log.info("2. Recuperar un objeto de la pila (pop)");
          log.info("3. Obtener el objeto de la cima (top) de la pila");
          log.info("4. hay algún objeto almacenado en la pila.");
          log.info("5. Devolver el número de objetos almacenados en la pila");
          log.info("6. Mostrar los datos de la pila (Apartado 1)");
          log.info("7. salir");
          
          opcion = a.nextInt();
          
          switch(opcion){
              case 1:
                  log.info("1. Insertar un objeto en la pila (push).");
               log.info("Digite el objetos que desea agregar");
                dato = a.nextInt();
                stack.push(dato);
               break;
               
              case 2:
                  log.info("2. Recuperar un objeto de la pila (pop)");
                  stack.pop();
                  break;  
              case 3:
                  log.info("3. Obtener el objeto de la cima (top) de la pila");
                  log.info("El objeto que esta en la cima es: " + stack.Fin());
                  stack.Fin();
                  break;
              case 4:
                  log.info("4. hay algún objeto almacenado en la pila.");
                  if(stack.size() == 0){
                      log.info("no hay objetos almacenados en la pila");
                  }else{
                      log.info("Si hay objetos almacenados en la pila");
                  }
                  break;
              case 5:
                  log.info("5. Devolver el número de objetos almacenados en la pila");
                  log.info("el taaño atual de la pila es: " + stack.size());
                  break;
              case 6:
                  log.info("6. salir");
                  log.info("Proceso finalizado");
                  break;
          }
      }while(opcion != 6);
}
}

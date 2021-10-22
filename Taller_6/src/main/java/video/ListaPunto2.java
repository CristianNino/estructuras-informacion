
package video;
import java.util.*;
import org.apache.log4j.Logger;

public class ListaPunto2 {
   nodo primero;
   nodo ultimo;
   int dato;
   
   static Logger log = Logger.getLogger(ListaPunto2.class.getName());
   static Scanner a = new Scanner(System.in);
   public ListaPunto2(){
       primero = null;
       ultimo = null;
   }
   
   public void Ingresar(int x){
       nodo nuevo = new nodo();
       nuevo.dato1 = x;
       
       if(primero == null){
           primero = nuevo;
           primero.siguiente = primero;
           primero.anterior = ultimo;
           ultimo = nuevo;
       }else{
           ultimo.siguiente = nuevo;
           nuevo.siguiente = primero;
           ultimo = nuevo;
           primero.anterior = ultimo;
       }
   }
   
   public void Mostrar(){
       nodo actual = new nodo();
       actual = primero;
       do{
          log.info(actual.dato1);
          actual = actual.siguiente;
       }while(actual != primero);
   }
   
   public void Buscar(int x){
       nodo actual = new nodo();
       actual = ultimo;
       
       boolean encontrado = false;
       
       
       do{
           if(actual.dato1 == x){
               encontrado = true;
               dato = actual.dato1;
           }
           actual = actual.anterior;
       }while(actual != ultimo);
       
       if( encontrado = true){
           log.info("Nodo encontrado ");
           log.info(dato);
       }else{
           log.info("Nodo no encontrado");
       }
   }
   
   public void Modificar(int x){
       nodo actual = new nodo();
        actual = primero;
        
        do{
            if(actual.dato1 == x){
                log.info("Ingrese un nuevo valor");
                actual.dato1 = a.nextInt();
            }
            actual = actual.siguiente;  
        }while(actual != ultimo);
 
   }
}

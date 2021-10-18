
package Laboratorio;

/**
 *
 * @author Sergio
 */
public class listasCD {
    nodo primero;
    nodo ultimo;

    public listasCD(){
       primero = null;
       ultimo = null;

}
    public void IngresaNodo(String x){
     nodo nuevo = new nodo();
     nuevo.dato = x;
     if (primero==null){
     
     primero=nuevo;
     primero.siguiente=primero;
     nuevo.anterior=ultimo;
     ultimo = nuevo;
     }else{
         ultimo.siguiente=nuevo;
         nuevo.siguiente=primero;
         nuevo.anterior=ultimo;
         ultimo.anterior=ultimo;
    
    
    
     }
    
    }
    public void desplegar(){
      nodo actual = new nodo();
      actual = primero;
      do{
          System.out.println(actual.dato);
          actual = actual.siguiente;
      
      }while(actual!=primero);
    
    
    
    
    }
}
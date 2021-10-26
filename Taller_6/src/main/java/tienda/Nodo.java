
package tienda;

public class Nodo {
    String dato;
    Nodo siguiente;
    Nodo anterior;

public Nodo(String d){
        dato = d;
        siguiente = this;
    }
}

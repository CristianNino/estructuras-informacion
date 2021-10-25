
package tienda;

import javax.swing.JOptionPane;
import java.util.*;
import org.apache.log4j.Logger;

public class Tienda_D {
    
    Nodo ultimo;
    
    public Tienda_D(){
        ultimo = null;
    }
    public boolean estaVacia(){
        return ultimo == null;
    }
    
    public Tienda_D insetar(String elemento){
        Nodo nuevo = new Nodo(elemento);
        if(ultimo!= null){
            nuevo.siguiente = ultimo.siguiente;
            ultimo.siguiente = nuevo;
        }
        ultimo=nuevo;
        return this;  
    }
    
    public void Mostrarlista(){
        Nodo auxiliar = ultimo.siguiente;
        String cadena = "";
        do{
                cadena = cadena + "[" + auxiliar.dato + "] ->";  
                auxiliar = auxiliar.siguiente;
        }while(auxiliar != ultimo.siguiente);
        JOptionPane.showMessageDialog(null, cadena, "Mostrando los dulces de la tienda ",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public boolean eliminar (String elemento){
        Nodo actual;
        boolean encontrado = false;
        actual = ultimo;
        
        while(actual.siguiente != ultimo && !encontrado){
            encontrado = (actual.siguiente.dato == elemento);
            if(!encontrado){
                actual = actual.siguiente;
            }
        }
        encontrado = (actual.siguiente.dato == elemento);
        if(encontrado){
            Nodo auxiliar = actual.siguiente;
            if(ultimo == ultimo.siguiente){
                ultimo = null;
            }else{
                if(auxiliar == ultimo){
                    ultimo = actual;
                }
                actual.siguiente = auxiliar.siguiente;
            }
            auxiliar = null;
        }
        return (encontrado == true);
    }
}

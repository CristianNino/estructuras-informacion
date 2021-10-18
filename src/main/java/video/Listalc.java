
package video;

import javax.swing.JOptionPane;

public class Listalc {
  
    Nodolc ultimo;
    
    public Listalc(){
        ultimo = null;
    }
    
    public boolean estaVacia(){
        return ultimo == null;
    }
    
    public Listalc insetar(int elemento){
        Nodolc nuevo = new Nodolc(elemento);
        if(ultimo!= null){
            nuevo.siguiente = ultimo.siguiente;
            ultimo.siguiente = nuevo;
        }
        ultimo=nuevo;
        return this;  
    }
    
    public void Mostrarlista(){
        Nodolc auxiliar = ultimo.siguiente;
        String cadena = "";
        do{
                cadena = cadena + "[" + auxiliar.dato + "] ->";  
                auxiliar = auxiliar.siguiente;
        }while(auxiliar != ultimo.siguiente);
        JOptionPane.showMessageDialog(null, cadena, "Mostrando ListA Circular",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public boolean eliminar (int elemento){
        Nodolc actual;
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
            Nodolc auxiliar = actual.siguiente;
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

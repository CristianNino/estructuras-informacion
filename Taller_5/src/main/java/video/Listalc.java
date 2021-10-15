
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
}

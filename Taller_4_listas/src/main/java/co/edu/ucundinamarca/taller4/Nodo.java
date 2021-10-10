/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.taller4;

public class Nodo {

    static int leght;
    
    public Nodo Siguiente;
    public Object Elemento;

    public Nodo() {
        setSiguiente(null);
        setElemento(null);
    }
    
    public Nodo(String ele){
        setSiguiente(null);
        setElemento(ele);
    }
    
    public Nodo(String ele, Nodo n){
        setSiguiente(n);
        setElemento(ele);
    }
    
    public Object ObtenerElemento(){
        return Elemento;
    }
    
    public Nodo ObtenerSiguiente(){
        return Siguiente;
    }
        

    public Nodo getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.Siguiente = siguiente;
    }

    public Object getElemento() {
        return Elemento;
    }

    public void setElemento(Object Elemento) {
        this.Elemento = Elemento;
    }

    void ObtenerSiguiente(Object element1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
        
}

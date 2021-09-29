
package co.edu.ucundinamarca.taller4;

public class Lista {
    
    private Nodo cabeza = null;
    private int longitud = 0;
    
    private class Nodo {
        public Libro libro;
        public Nodo siguiente = null; 
        
        public Nodo(Libro libro){
            this.libro = libro;
        }
    }
    
    public void insertarPrincipio (Libro libro){
        Nodo nodo = new Nodo(libro);
        nodo.siguiente = cabeza;
        cabeza = nodo;
        longitud = longitud + 1;
    }
    
    public void insertarFinal (Libro libro){
        Nodo nodo = new Nodo (libro);
        Nodo puntero = cabeza;
        while(puntero.siguiente != null){
            puntero = puntero.siguiente; 
        }
        puntero.siguiente = nodo;   
        longitud = longitud + 1;
    }
    
    public void insertarDespues (int n, Libro libro){
        Nodo nodo = new Nodo (libro);
        if(cabeza == null){
            cabeza = nodo;
        }else{
            Nodo puntero = cabeza;
            int contador = 0;
            while(contador < n &&puntero.siguiente != null){
                puntero = puntero.siguiente;
                contador = contador + 1;
            }
            nodo.siguiente = puntero.siguiente; 
            puntero.siguiente = nodo;
        }
        longitud = longitud + 1;
    }
    
    public Libro obtener(int n){
        if(cabeza == null){
            return null;
        }else{
            Nodo puntero = cabeza;
            int contador = 0;
            while(contador < n && puntero.siguiente != null){
                puntero = puntero.siguiente;
                contador = contador + 1;
            }
            if(contador != n){
                return null;
            }else{
                return puntero.libro;
            }
            
        }
        
    }
    
    public int contar(){
        return longitud;
    }
    
    public void eliminarPrincipio(){
        if(cabeza != null){
            Nodo primer = cabeza;
            cabeza = cabeza.siguiente;
            primer.siguiente = null;
            longitud = longitud - 1;
        }
    }
    
    public void eliminarUltimo(){
        if(cabeza != null){
            if(cabeza.siguiente == null){
                cabeza = null;
            }else{
                Nodo puntero = cabeza;
                while(puntero.siguiente.siguiente != null){
                    puntero = puntero.siguiente;
                }
                puntero.siguiente = null;
            }
        }
    }
    
    public void eliminarLibro(int n){
        if(cabeza != null){
            if(n == 0){
                Nodo primer = cabeza;
                cabeza = cabeza.siguiente;
                primer.siguiente = null;
                longitud = longitud - 1;
            }else if(n <longitud){
                Nodo puntero = cabeza;
                int contador = 0;
                while(contador < (n-1)){
                    puntero = puntero.siguiente;
                    contador = contador + 1;
                }
                Nodo temp = puntero.siguiente;
                puntero.siguiente = temp.siguiente;
                temp.siguiente = null;
                longitud = longitud - 1;
            }
        }
    }
    
            
}

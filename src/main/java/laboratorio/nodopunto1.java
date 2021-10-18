package laboratorio;

public class nodopunto1 {
        
    private int valor;
    
    private nodo siguiente;
    
    public void Nodo(){
        this.valor = 0;
        this.siguiente = null;
    }
    
    
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodo siguiente) {
        this.siguiente = siguiente;
    }   
}

package co.edu.ucundinamarca.Actividad_7;

import static java.lang.ProcessBuilder.Redirect.to;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

public class Cola {
    static Logger log = Logger.getLogger(Cola.class.getName());  
    private Nodo inicioCola, finalCola;
    String Cola = "";
    
    public Cola(){
        inicioCola = null;
        finalCola = null;
    }
    
    //Método para saber si la cola esta vacia
    public boolean ColaVacia(){
        if (inicioCola == null) {
            return true;
        } else {
            return false;
        }
    }
    
    //Método para insertar a la cola
    public void InsertarIde(int informacion){
        Nodo nuevo_nodo = new Nodo();
        nuevo_nodo.identificacion = informacion;
        nuevo_nodo.siguiente = null;
        
        if (ColaVacia()) {
            inicioCola = nuevo_nodo;
            finalCola = nuevo_nodo;
        } else {
            finalCola.siguiente = nuevo_nodo;
            finalCola = nuevo_nodo;
        }
    }
    public void InsertarLibro(String libro){
        Nodo nuevo_nodo = new Nodo();
        nuevo_nodo.libro = libro;
        nuevo_nodo.siguiente = null;
        
        if (ColaVacia()) {
            inicioCola = nuevo_nodo;
            finalCola = nuevo_nodo;
        } else {
            finalCola.siguiente = nuevo_nodo;
            finalCola = nuevo_nodo;
        }
    }
    
    //Método para extraer de la cola
    public int ExtraerIde(){
        if (!ColaVacia()) {
            int informacion = inicioCola.identificacion;
            
            if (inicioCola == finalCola) {
                inicioCola = null;
                finalCola = null;
            } else {
                inicioCola = inicioCola.siguiente;
            }
            return informacion;
        } else {
            return Integer.MAX_VALUE;
        }
    }
    public String Extraerlibro(){
        if (!ColaVacia()) {
            String libro = inicioCola.libro;
            
            if (inicioCola == finalCola) {
                inicioCola = null;
                finalCola = null;
            } else {
                inicioCola = inicioCola.siguiente;
            }
            return libro;
        } else{
            return "error";
        }
    }
    
    //Método para mostrar el contenido de la cola
    public void MostrarContenidoIde(){
        Nodo recorrido = inicioCola;
        String ColaInvertida = "";
        
        while(recorrido != null){
            Cola += recorrido.identificacion + " ";
            recorrido = recorrido.siguiente;
        }
        
        String cadena [] = Cola.split(" ");
        
        
        for (int i = cadena.length - 1; i >= 0; i--) {
            ColaInvertida += " " +cadena[i];                    
        }
        
        log.info(ColaInvertida);
        Cola = "";
    }
    public void MostrarContenidoLibro(){
        Nodo recorrido = inicioCola;
        String ColaInvertida = "";
        
        while(recorrido != null){
            Cola += recorrido.libro + " ";
            recorrido = recorrido.siguiente;
        }
        
        String cadena [] = Cola.split(" ");
        
        
        for (int i = cadena.length - 1; i >= 0; i--) {
            ColaInvertida += " " +cadena[i];                    
        }
        
        log.info(ColaInvertida);
        Cola = "";
    }
}

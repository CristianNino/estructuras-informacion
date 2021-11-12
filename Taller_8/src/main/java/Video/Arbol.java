
package Video;
import org.apache.log4j.Logger;
public class Arbol {
    static Logger log = Logger.getLogger(Arbol.class.getName());
    
    Nodo raiz;
    
    public Arbol(){
        raiz = null;
    }
    
    public void insertar(int ind, Object fruta){
        Nodo n = new Nodo(ind);
        n.contenido = fruta;
        
        if(raiz == null){
                raiz = n;
        }else{
            Nodo aux = raiz;
            while(aux != null){
                n.padre = aux;
                if(n.llave >= aux.llave){
                    aux = aux.derecha;
                }else{
                    aux = aux.izquierda;
                }
            }
        }
        if(n.llave < n.padre.llave){
            n.padre.izquierda = n;
        }else{
            n.padre.derecha = n;
        }
    }
    
    public void Recorrer(Nodo n){
        if(n != null){
            Recorrer(n.izquierda);
            log.info("Indice "+ n.llave +"fruta" + n.contenido);
            Recorrer(n.derecha);
        }else{
            log.info("no exixte una raiz al arbol");
        }
    }
    
    
   private class Nodo{
       public Nodo padre;
       public Nodo izquierda;
       public Nodo derecha;
       public int llave;
       public Object contenido;
       
       public Nodo(int indice){
           llave = indice;
           derecha = null;
           izquierda = null;
           padre = null;
           contenido = null;
       }
   } 
}

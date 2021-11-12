
package Video;

public class main_video {
    public static void main(String[] args){
        
        Arbol arbol = new Arbol();
        
        arbol.insertar(3, "naranja");
        arbol.insertar(1, "manzana");
        arbol.insertar(5, "uva");
        arbol.insertar(2, "sandia");
        arbol.insertar(4, "pera");
        
        arbol.Recorrer(arbol.raiz);
    }
}


package co.edu.ucundinamarca.tallern;

import java.util.*;
import org.apache.log4j.Logger;

public class Arbol {
    static Logger log = Logger.getLogger(Arbol.class.getName());
     Scanner a = new Scanner(System.in);
     
     Nodo raiz;
     
     public Nodo AgregarRaiz(String datos){
         raiz = new Nodo(datos);
         return raiz;
     }
     public void Mostrar(Nodo nodo){
         for(int z = 0; z < nodo.numerohijos; z = z + 1){
             nodo.hijo[z].MostrarValor();
             Mostrar(nodo.hijo[z]);
         }
     }
     public void Agregar(Nodo nodo, String datos, String padre){
         Nodo nuevo = new Nodo(datos);
         
         if(nodo.ObtenerDato().equals(padre)){
             nodo.Aumentar(nuevo);
         }else{
             for(int y = 0; y < nodo.numerohijos; y = y + 1){
                 if(nodo.hijo[y].ObtenerDato().equals(padre)){
                     nodo.hijo[y].Aumentar(nuevo);
                 }else{
                     Agregar(nodo.hijo[y], datos, padre);
                 }
             }
         }
     }
}

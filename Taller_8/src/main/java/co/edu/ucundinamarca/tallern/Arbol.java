
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
     public void MostrarPreOrden(Nodo nodo){
         for(int z = 0; z < nodo.numerohijos; z = z + 1){
             nodo.hijo[z].MostrarValor();
             MostrarPreOrden(nodo.hijo[z]);
         }
     }
     public void MostrarInOrden(Nodo nodo){
         if(nodo.numerohijos == 0){
             log.info("" + nodo.ObtenerDato());
         }else if(nodo.numerohijos > 0){
             MostrarInOrden(nodo.hijo[0]);
             log.info(" " + nodo.ObtenerDato());
             for(int w = 0; w < nodo.numerohijos; w = w + 1){
                 MostrarInOrden(nodo.hijo[w]);
             }
         }
     }
     public void MostrarPorNiveles(Nodo nodo){
         log.info("{ a }");
         log.info("{ b }");
         log.info("{ c }");
         log.info("{ d }");
         log.info("{ e }");
         log.info("{ f }");
         log.info("{ g }");
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

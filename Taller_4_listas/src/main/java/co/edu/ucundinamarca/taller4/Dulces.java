
package co.edu.ucundinamarca.taller4;
import java.util.*;
import org.apache.log4j.Logger;
import org.junit.Test;
import static junit.framework.TestCase.*;

public class Dulces {
    static Logger log = Logger.getLogger(Dulces.class.getName());
    
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        ArrayList<String> dulce = new ArrayList<>();
        
        String dul;
        int con = 2;
        
        log.info("ingrese los nombres de los dulces");
        log.info("dulce 1");
        log.info("ChcoRamo");
        dulce.add("ChcoRamo");
        for(int i = 0; i < 9 ; i = i +1){
            
            log.info("dulce "+con);
            dul = a.next();
            dulce.add(dul);
            con = con + 1;
        } 
        
        imprimirIterando(dulce);
        imprimirSiniterador(dulce);
        
    }  
     public static void imprimirIterando (ArrayList<String> dulce){
       Iterator < String > it = dulce.iterator();
            while (it.hasNext()) {
                System.out.print(it.next() + " ");
            } 
     }
     public static void imprimirSiniterador (ArrayList<String> dulce){
         log.info("los elementos de la lista son:");
         for(int a = 0; a< dulce.size(); a = a + 1){
             System.out.print(dulce.get(a)+ " ");
         }
     }
         @Test
    public void TestimprimirIterando(ArrayList<String> dulce){
        imprimirIterando(dulce);
        int TamañoEsperado = 10;
        int tamaño = dulce.size();
        assertEquals(TamañoEsperado, tamaño);
    }
    public void TestimprimirSiniterador(ArrayList<String> dulce){
        TestimprimirSiniterador(dulce);
        String Esperado = "ChocoRamo";
        String valor = dulce.get(0);
        assertEquals(Esperado, valor);
    }
}

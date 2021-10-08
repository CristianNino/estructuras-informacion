
package co.edu.ucundinamarca.taller4;
import java.util.*;
import org.apache.log4j.Logger;

public class Dulces {
    static Logger log = Logger.getLogger(Main.class.getName());
    
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        ArrayList<String> dulce = new ArrayList<>();
        
        String dul;
        
        log.info("ingrese los nombres de los dulces");
        log.info("dulce 1");
        dulce.add("ChcoRamo");
        for(int i = 0; i < 9 ; i = i +1){
            int con = 2;
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
                System.out.println(it.next());
            } 
     }
     public static void imprimirSiniterador (ArrayList<String> dulce){
         
         for(int a = 0; a< dulce.size(); a = a + 1){
             log.info("los elementos de la lista son:");
             System.out.print(dulce.get(a)+ " ");
         }
     }
}

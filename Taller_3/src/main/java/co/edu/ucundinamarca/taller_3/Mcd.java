
package co.edu.ucundinamarca.taller_3;
import org.apache.log4j.Logger;

public class Mcd {
    
    static Logger log = Logger.getLogger(Mcd.class.getName());
    
    public static int mcd (int a, int b){
        return mcd(b, a%b);
    }
    public static void main (String args[]){
        
        int a = 96;
        int b = 36; 
         
        log.info("mcd("+ a +" , "+ b +")= " + mcd(a,b));
    }
    
}

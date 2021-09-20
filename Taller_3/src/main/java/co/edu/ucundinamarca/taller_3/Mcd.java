
package co.edu.ucundinamarca.taller_3;
import org.apache.log4j.Logger;

public class Mcd {
    static Logger log = Logger.getLogger(Mcd.class.getName());
    
    /*  ejercicio presentado en punto 2
    public static int mcd (int a, int b){
        return mcd(b, a%b);
    }
    public static void main (String args[]){
        
        int a = 96;
        int b = 36; 
         
        log.info("mcd("+ a +" , "+ b +")= " + mcd(a,b));
    }*/
    public static void main (String args[]){
        int a = 96;
        int b = 36;
        int r;
        
        log.info("Inicio Mcd: (" +a+ " , " + b + ")");
        if(a<b){
            a = 36;
            b = 96;
            log.info("Inicio Mcd: (" +a+ " , " + b + ")");
        }
        while(b !=0){
            r = a % b;
            a = b;
            b = r;
            log.info("Mcd: (" +a+ " , " + b + ")");
        }
        log.info("el maximo comun divisor es: " + a); 
        log.info("Fin Mcd: (" +a+ " , " + b + ")");
    }
}
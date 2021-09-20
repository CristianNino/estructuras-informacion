package co.edu.ucundinamarca.taller_3;

import org.apache.log4j.Logger;

public class Sucesion {
    static Logger log = Logger.getLogger(Sucesion.class.getName());
    
    int n;
    int contador = 0;
    
    public void Recursivo(double n){
        double resultado = 0;
        double resultadof = 0;
        while(n != 0){
            resultado = 0.91 * (n-1) + 0.1 * (n-2);
            resultadof = resultadof + resultado;
            n = n - 1;
        }
        log.info("el resultado del valor es " +resultadof);      
    }
    
    public void sucesion(){
        contador = 1;
        
        
        
        log.info("el valor final del contador es: "+ contador);
    }

    public Sucesion(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    
    
}

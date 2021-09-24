/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.taller_4;
import java.util.*;
import org.apache.log4j.Logger;

public class Funciones {
    static Logger log = Logger.getLogger(Funciones.class.getName());
    static Scanner a = new Scanner(System.in);
    

    
    public int Factorial(int  numero){
        int factorial = 1;
        for(int i = numero; i>0; i = i - 1){
            factorial = factorial*i;
        }
        log.info("el factorial de " + numero + " es " + factorial); 
        return factorial;
    }
    
    public double FactorialRec(int numero){
        double aux = 1;
        for(int i = 2; i<=numero; i = i + 1){
            aux *= i;
        }
        log.info("el factorial de " + numero + " es " + aux);
        return aux;
    }
    
    public void potencia(int  base,  int  exponente){           
           log.info("es valor establecido es: "+ base +" elevado a la "+ exponente);
           log.info("Su resultado es: " + Math.pow(base, exponente));
           
       
        
    }


    
}

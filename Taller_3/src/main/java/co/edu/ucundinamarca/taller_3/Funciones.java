/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.taller_3;
import java.util.*;
import org.apache.log4j.Logger;

public class Funciones {
    static Logger log = Logger.getLogger(Funciones.class.getName());
    static Scanner a = new Scanner(System.in);
    
    int numero;
    
    public void Factorial(int  numero){
        double aux = 1;
        for(int i = 2; i<=numero; i = i + 1){
            aux *= i;
        }
        log.info("el factorial de " + numero + " es " + aux);
    }
    
    public void FactorialRec(int numero){
        int i = numero;
        
       for(int x = 1; x <= i; x = x+1){
           System.out.print( x + " * ");
           
       }
    }
    public void potencia(int  base,  int  exponente){           
           log.info("es valor establecido es: "+ base +" elevado a la "+ exponente);
           log.info("Su resultado es: " + Math.pow(base, exponente));
           
       
        
    }

    public Funciones(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}

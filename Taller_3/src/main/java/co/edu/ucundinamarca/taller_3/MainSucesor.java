/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.taller_3;

import java.util.Scanner;
import org.apache.log4j.Logger;

public class MainSucesor {
    static Logger log = Logger.getLogger(MainSucesor.class.getName());
    static Scanner a = new Scanner(System.in);
    
    public static void main(String[] args) {
         
        log.info("ingrese un numero para operar");
        int numero = a.nextInt();
        
        Sucesion x = new Sucesion(numero);
        
        x.Recursivo(numero);
        
    }
}

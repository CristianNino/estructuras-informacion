
package co.edu.ucundinamarca.tallern;
import java.util.*;
import java.util.logging.Logger;

public class MainLambdas {
    static Logger log = Logger.getLogger(MainLambdas.class.getName());
    public static void main(String args []){
        Scanner a = new Scanner(System.in);   
        ExpresionesLambda lambda;
        lambda = new ExpresionesLambda() {
            @Override
            public void Media(int tamaño) {
                float media1;
                int suma = 0;
                int elementos = 0;
                log.info("digite un numero");
                int valor = a.nextInt();
                for(int i = 1; i < tamaño; i = i+1){
                    suma = suma + valor;
                    log.info("digite un numero");
                    valor = a.nextInt();
                    elementos = elementos + 1;
                }
                if(tamaño == 0){
                    log.info("error");
                }else{
                    media1 = (float) suma/elementos;
                    log.info("la media de los valores digitado son: " + media1);
                }
            }
            
            public void factorial(int valor) {
                int fac = 1;
                
                int num = valor;
                while(valor != 0){
                    fac *= valor;
                    valor = valor - 1;
                }
                log.info("el Factorial del numero " + num + " es: "+ fac);
            }
            @Override
            public void Par(int valor1) {
              if(valor1 %2 == 0 ){
                  log.info("el numero "+ valor1 + " es par");
              }  else{
                  log.info("el numero "+ valor1  +" no es par");
              }
            }
            @Override
            public void Mayor(int tamaño1) {
                int arreglo[] = new int[tamaño1];
                int valor;
                int mayor = 0;
                for(int i = 0; i < tamaño1; i = i + 1){
                    log.info("ingrese valores");
                    valor = a.nextInt();
                    arreglo[i] = valor;
                }
                for(int j = 0; j < tamaño1; j = j + 1){
                    if(mayor <= arreglo[j]){
                        mayor = arreglo[j];
                    }
                }
                log.info("El valor mayor es: " + mayor);
            }
            @Override
            public void Menor(int tamaño2) {
                int arreglo[] = new int[tamaño2];
                int valor;
                int menor = 10;
                for(int i = 0; i < tamaño2; i = i + 1){
                    log.info("ingrese valores");
                    valor = a.nextInt();
                    arreglo[i] = valor;
                }
                for(int j = 0; j < tamaño2; j = j + 1){
                    if(menor >= arreglo[j]){
                        menor = arreglo[j];
                    }
                }
                log.info("El valor menor es: " + menor);
            }
             @Override
            public void MasSeRepite(int tamaño3) {
                
            }
        };
        
        log.info("digite el tamaño del arreglo para hallar su promedio");
        int tamaño = a.nextInt();
        lambda.Media(tamaño);
        log.info(" ---------------------------------------------------------------------");
        log.info("digite un valor para el factorial");
        int v = a.nextInt();
        lambda.factorial(v);
        log.info(" ---------------------------------------------------------------------");
        log.info("digite el tamaño del arreglo para hallar el valor mayor");
        int valor1 = a.nextInt();
        lambda.Par(valor1);
        log.info(" ---------------------------------------------------------------------");
        log.info("digite el tamaño del arreglo para hallar el valor mayor");
        int tamaño1 = a.nextInt();
        lambda.Mayor(tamaño1);
        log.info(" ---------------------------------------------------------------------");
        log.info("digite el tamaño del arreglo para hallar el valor menor");
        int tamaño2 = a.nextInt();
        lambda.Menor(tamaño2);
        log.info(" ---------------------------------------------------------------------");
        log.info("digite el tamaño del arreglo para hallar el valor que mas se repite");
        int tamaño3 = a.nextInt();
        lambda.Menor(tamaño3);
    }
}

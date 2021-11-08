
package co.edu.ucundinamarca.Actividad_7;
import java.io.*;
public class Apartado1_prueba {
      public static void main(String args[]) {

    FileReader f = null; 
    BufferedReader reader = null; 
    String line = null; 
    Pila stack = new Pila(); 

    if (args.length < 1) {
      System.err.println("Please invoke the program like this:");
      System.err.println("\tLinkedStack file");
    }


    try {
      f = new FileReader(args[0]);
      reader = new BufferedReader(f);
      while ((line = reader.readLine()) != null)
        stack.push(line);
    } catch (Exception e) {
      System.err.println("File not found " + args[0]);
      return;
    }


    while ((line = (String) stack.pop()) != null) {
      System.out.println(line);
    }
  }
    
}

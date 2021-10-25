
package tienda;

import javax.swing.JOptionPane;
import java.util.*;
import org.apache.log4j.Logger;

public class MainTienda {
    
    static Logger log = Logger.getLogger(MainTienda.class.getName());  
    public static void main (String[] args){
      Scanner a = new Scanner(System.in);
      
      Tienda_D dulce = new Tienda_D();
      int opcion = 0;
      String dul = "";
      boolean eliminado = false;
        
        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un dulce a la tienda \n"
                        + "2. Eliminar un dulce de la tienda \n"
                        + "3. Mostrar todos los dulces que hay en la tienda \n"
                        + "4. Salir"
                        + "¿que desea hacer?", "--- TIENDA DE DULCES ---", JOptionPane.INFORMATION_MESSAGE));
                switch (opcion){
                    
                    case 1:
                        dul = (JOptionPane.showInputDialog(null," Ingrese el dulce a agregar ", " Agegando dulce a la tienda ", JOptionPane.INFORMATION_MESSAGE));
                        dulce.insetar(dul);
                        break;
                        
                    case 2:
                        if(!dulce.estaVacia()){
                        dul = (JOptionPane.showInputDialog(null," Ingrese el nombre del dulce a eliminar", " Eliminando un dulce de la tienda ", JOptionPane.INFORMATION_MESSAGE));
                        eliminado = dulce.eliminar(dul);
                        if(eliminado){
                          JOptionPane.showMessageDialog(null, "el dulce eliminado es: " + dul , "eliminando dulces" , JOptionPane.INFORMATION_MESSAGE);  
                        }else{
                           JOptionPane.showMessageDialog(null, "el dulce "+ dul +" no esta en la lista", "elemento no encontrado" , JOptionPane.INFORMATION_MESSAGE);    
                        }}else{
                          JOptionPane.showMessageDialog(null, "aun no hay dulces", "lista vacia", JOptionPane.INFORMATION_MESSAGE);  
                        }
                        break;
                    case 3:
                        if(!dulce.estaVacia()){
                            dulce.Mostrarlista();
                        }else{
                            JOptionPane.showMessageDialog(null, "aun no hay nodos", "lista vacia", JOptionPane.INFORMATION_MESSAGE);                            
                        }
                        break;
                    case 4: 
                        JOptionPane.showMessageDialog(null, "Aplicacion Finalizada", "Terminado", JOptionPane.INFORMATION_MESSAGE);
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(null, "La Opcion No Esta En El Menu", "Incorrecto", JOptionPane.INFORMATION_MESSAGE);
                        
                }
                    
            }catch (NumberFormatException n){
                JOptionPane.showMessageDialog(null, "error" + n.getMessage());
            }
        }while(opcion != 4);

    }
}

package video;

import javax.swing.JOptionPane;

public class Main_lc {
    
    public static void main (String[] args){
        Listalc listita = new Listalc();
        int opcion = 0;
        int elemento;
        boolean eliminado = false;
        
        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un nodo a la lista circular \n"
                        + "2. Eliminar un nodo de l lista circular \n"
                        + "3. Mostrar los datos de la lista circular \n"
                        + "4. Salir"
                        + "¿que desea hacer?", "--- Menu De Opciones ---", JOptionPane.INFORMATION_MESSAGE));
                switch (opcion){
                    
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null," Ingrese Elemento Del Nodo", " Agegando nodo la lista circular", JOptionPane.INFORMATION_MESSAGE));
                        listita.insetar(elemento);
                        break;
                        
                    case 2:
                        if(!listita.estaVacia()){
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null," Ingrese Elemento Del Nodova eliminar", " Eliminando nodo la lista circular", JOptionPane.INFORMATION_MESSAGE));
                        eliminado = listita.eliminar(elemento);
                        if(eliminado){
                          JOptionPane.showMessageDialog(null, "el elemento eliminado es: " + elemento, "eiminando nodos" , JOptionPane.INFORMATION_MESSAGE);  
                        }else{
                           JOptionPane.showMessageDialog(null, "el elemento "+elemento+" no esta en la lista", "elemento no encontrado" , JOptionPane.INFORMATION_MESSAGE);    
                        }}else{
                          JOptionPane.showMessageDialog(null, "aun no hay nodos", "lista vacia", JOptionPane.INFORMATION_MESSAGE);  
                        }
                        break;
                    case 3:
                        if(!listita.estaVacia()){
                            listita.Mostrarlista();
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

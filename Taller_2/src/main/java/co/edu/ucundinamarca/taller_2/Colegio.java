
package co.edu.ucundinamarca.taller_2;
import java.util.*;
import org.apache.log4j.Logger;


public class Colegio {
    static Logger log = Logger.getLogger(Mainpersona.class.getName());
    Scanner a = new Scanner(System.in);

    private LinkedList Nacionalidad = new LinkedList();

    public LinkedList getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(LinkedList Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }
    
    public void agregarAlumno(String nacionalidad){
        Nacionalidad.add(nacionalidad);
    }
    
    public void mostrarTodosAlumno(){
        for (Object n : Nacionalidad){
            log.info("las nacionalidades de los estudiantes son: " + n);
            
        }
    }
    
    public void cuantosAlumnos(){
        log.info("el tamaño de elementos que hay en la lista son: " + Nacionalidad.size());
    }
    
    public void borrarAlumnos(){
        log.info("la lista de estudiantes ha sido borrada");
        Nacionalidad.clear();
    }

}

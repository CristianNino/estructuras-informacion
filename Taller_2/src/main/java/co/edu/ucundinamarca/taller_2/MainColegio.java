
package co.edu.ucundinamarca.taller_2;
import java.util.*;
import java.util.Map.Entry;
import org.apache.log4j.Logger;

public class MainColegio {
    static Logger log = Logger.getLogger(MainColegio.class.getName());
    
    
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
 
        String nacion;
        
        Colegio d = new Colegio();
        
        log.info( "inserte la nacionalidad del estudiante 1 (MAYUSCULAS) ");
        nacion = a.next();
        d.agregarAlumno(nacion);
        log.info( "inserte la nacionalidad del estudiante 2 (MAYUSCULAS) ");
        nacion = a.next();
        d.agregarAlumno(nacion);
        log.info( "inserte la nacionalidad del estudiante 3 (MAYUSCULAS) ");
        nacion = a.next();
        d.agregarAlumno(nacion);
        
        
        
        log.info( "las nacionalidades de los estudiantes son: ");
        d.mostrarTodosAlumno();
        
        d.cuantosAlumnos();
        
        log.info( "se ha terminado el año escolar, los alumnos se han borrado: ");
        d.borrarAlumnos();
        
        d.cuantosAlumnos();

        


}
}

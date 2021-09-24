
package co.edu.ucundinamarca.taller_4;
import org.junit.Test;
import static junit.framework.TestCase.*;

public class MainFuncionesTest {
    @Test
    public void TestFactorial (){
       Funciones f = new Funciones();
       int res = f.Factorial(5);
       assertEquals(120, res);
   }
  public void TestFactorialRec (){
       Funciones f = new Funciones();
       double res1;
        res1 = f.FactorialRec(5);
       assertEquals(120.0, res1);
       
   }
}

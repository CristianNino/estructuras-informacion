
package co.edu.ucundinamarca.tallern;
import org.apache.log4j.Logger;

public class Nodo {
    static Logger log = Logger.getLogger(Nodo.class.getName());
    String dato;
    int numerohijos;
    Nodo hijo[];
    Nodo hijoT[];
    public Nodo(String datos){
        dato = datos;
        this.numerohijos = 0;
    }
    public void TenerHijos(){
        hijoT = new Nodo[numerohijos + 1];
        for(int x = 0; x < this.numerohijos; x = x + 1){
            hijoT[x] = hijo[x];
        }
    }
    public void Aumentar(Nodo nodo){
        TenerHijos();
        hijoT[this.numerohijos] = nodo;
        hijo = hijoT;
        this.numerohijos++;
    }
    public String ObtenerDato(){
        return dato;
    }
    public void MostarDato(String datos){
        dato = datos;
    }
    public void MostrarValor(){
        log.info("{ "+dato+" }");
    }
}

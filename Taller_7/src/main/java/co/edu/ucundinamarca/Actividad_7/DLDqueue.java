
package co.edu.ucundinamarca.Actividad_7;
public class DLDqueue {
    DNode head, tail;
  int tamaño;

  public DLDqueue() {
    head = new DNode();
    tail = new DNode();
    head.setNext(tail);
    tail.setPrev(head);
    tamaño = 0;
  }

  public void InsertarPrimer(Object obj) {
    DNode h = head;
    DNode node = new DNode();
    node.setVal(obj);
    node.setNext(h);
    h.setPrev(node);
    head = node;
    if (tamaño == 0)
      tail = node;
    tamaño = tamaño + 1;

  }

  public void InsertarUltimo(Object obj) {
    DNode t = tail;
    DNode node = new DNode();
    node.setVal(obj);
    node.setPrev(t);
    t.setNext(node);
    tail = node;
    if (tamaño == 0)
      head = node;
    tamaño = tamaño + 1;
  }

  public Object removeFirst() {
    if (head == null)
      return null;
    Object val = head.getVal();
    head = head.getNext();
    tamaño = tamaño - 1;
    return val;
  }

  public Object removeLast() {
    if (tail == null)
      return null;
    Object val = tail.getVal();
    tail = tail.getPrev();
    tamaño = tamaño - 1;
    return val;
  }

  public int size() {
    return tamaño;
  }

  public String Mostrar() {
    String s = "Cabeza [";
    DNode aux = head;
    for (int i = 0; i < tamaño; i++) {
      s += aux.getVal();
      if (aux == tail) {
        break;
      }
      s += "-";
      aux = aux.getNext();
    }
    return s + "] Cola";
  } 
    
}

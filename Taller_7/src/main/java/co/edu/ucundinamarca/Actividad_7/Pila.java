
package co.edu.ucundinamarca.Actividad_7;

public class Pila {
    class Node {
    Object elemento;
    Node Next;

    public Node(Object o) {
      elemento = o;
      Next = null;
    }
  }

  Node fin;
  int tamaño;

  public Pila() {
    fin = null;
    tamaño = 0;
  }

  public void push(Object o) {
    Node new_node = new Node(o);
    if (fin == null)
      fin = new_node;
    else {
      new_node.Next = fin;
      fin = new_node;
    }
    tamaño = tamaño + 1;
  }

  public Object pop() {
    if (fin == null)
      return null;
    Object o = fin.elemento;
    fin = fin.Next;
    tamaño = tamaño - 1;
    return o;
  }// Gets the object from the stack

  public boolean isEmpty() {
    return (tamaño == 0);
  }

  public int size() {
    return tamaño;
  }

  public Object Fin() {

    if (fin == null)
      return null;
    else
      return fin.elemento;
  }
}

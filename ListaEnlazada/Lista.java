public class Lista <E> {
    //Atributos
    private Node<E> firts;
    private Node<E> last;
    private int longitud;
    
    //Metodo constructor
    public Lista () {
     firts = null;
    }
    public Lista (E[] datos) {
        for (E dato :datos) {
            agregar(dato);
        }
    }

    //Metodos

    public boolean estaVacia() {
        return  (firts == null)? true:false;
    }

    public void agregar (E dato) {
        Node <E> nodo = new Node <E>(dato);
        if (last == null) {
         firts = nodo;
        } else {
            last.setNext(nodo);         }
        last = nodo;
        longitud++;
    }

    public E obtener(int indice ) {
        if (indice >= 0 && indice < longitud) {
            Node <E> nodo = firts ;
            for (int i = 0; i < longitud && i != indice; i++) {
                nodo = nodo.getNext();
            }
            return nodo.getData();
        }
        return null;
    }
    
    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String toString() {
        return firts.toString();
    }
}


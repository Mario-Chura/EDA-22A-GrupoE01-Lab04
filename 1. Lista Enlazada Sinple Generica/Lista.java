public class Lista <T> {
    //Atributos
    private Nodo<T> raiz;
    private Nodo<T> ultimo;
    private int longitud;
    
    //Metodo constructor
	public Lista () {
		raiz = null;
	}
	public Lista (T[] datos) {
		for (T dato :datos) {
			agregar(dato);
		}
	}

    //Metodos

	public boolean estaVacia() {
		return (raiz == null)? true:false;
	}

    public void agregar (T dato) {
		Nodo <T> nodo = new Nodo <T>(dato);
		if (ultimo == null) {
			raiz = nodo;
		} else {
			ultimo.sig = nodo;
		}
		ultimo = nodo;
		longitud++;
	}

    public T obtener(int indice ) {
		if (indice >= 0 && indice < longitud) {
			Nodo <T> nodo = raiz ;
			for (int i = 0; i < longitud && i != indice; i++) {
				nodo = nodo.sig;
			}
			return nodo.dato;
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
		return raiz.toString();
	}
}

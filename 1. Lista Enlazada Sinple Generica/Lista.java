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
}

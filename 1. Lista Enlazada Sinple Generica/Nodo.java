
public class Nodo <T>{
    //Atributos
	T dato;
	Nodo <T> sig;

    //Metodo constructor
	public Nodo (T dato) {
		this.dato = dato;
	}

	//Metodo toString
	public String toString() {
		return "Nodo{" + "dato="+dato+", sig="+sig+"}";
	}
}

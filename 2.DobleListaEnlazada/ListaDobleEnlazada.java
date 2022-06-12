public class ListaDobleEnlazada <E extends Comparable<E>>{

	//Atributos
	private Node <E> raiz;
	private Node <E> ultimo;
	public int dimension;
	
	//Metodo constructor
	public ListaDobleEnlazada(){
		raiz = null;
		ultimo = null;
		dimension = 0;
	}
  
  }

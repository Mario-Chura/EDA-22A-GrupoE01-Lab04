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
	
	// Metodos
	public void add(E x){
		Node <E> aux = new Node(x);
		if(isEmpty())
			this.raiz = aux;
		else{
			this.ultimo.setNext(aux);
			aux.setPrevious(this.ultimo);
		}
		this.ultimo = aux;
		dimension++;
	}

	public Node<E> get(int indice) {
		if(indice >= dimension)
			return null;
		Node <E> aux = raiz;
		for(int i=0;i<indice;i++)
			aux = aux.getNext();
		return aux;
	}
	public void remove(int indice) {
		if(indice<dimension) {
			if(indice==0){
				raiz=raiz.getNext();
				raiz.setPrevious(null);
			}
			else {
				Node<E> anterior=this.get(indice).getPrevious();
				anterior.setNext(this.get(indice).getNext());
				if(anterior.getNext() != null)
					anterior.getNext().setPrevious(anterior);
			}
			dimension--;
		}
	}
	
	public boolean isEmpty(){
		return this.raiz == null;
	}
	
	public String toString(){
		String str = "";
		for(int i = 0; i < dimension; i++){
			str += this.get(i).getData() + " ";
		}
		return str;
	}
  
  }

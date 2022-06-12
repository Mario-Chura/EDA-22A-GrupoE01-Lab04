public class Node <E> {
	//Atributos
	private E data ;
	private Node <E> nextNode ;
	private Node <E> previousNode ;
	
	//Constructores de node
	Node () {
		this.data = null ;
		this.nextNode = null ;
		this.previousNode = null ;
	}
	
	Node (E data , Node <E> nextNode , Node <E> previousNode){
		this.data = data ;
		this.nextNode = nextNode ;
		this.previousNode = previousNode ;
	}
	
	Node (E data , Node <E> nextNode) {
		this.data = data ;
		this.nextNode = nextNode ;
		this.previousNode = null ;
	}
	
	Node (E data) {
		this.data = data ;
		this.nextNode = null ;
		this.previousNode = null ;
	}
	
	//Metodos de node
	public void setNext(Node <E> x){
		this.nextNode = x;
	}
	
	public Node <E> getPrevious(){
		return this.previousNode;
	}
	
	public Node <E> getNext(){
		return this.nextNode;
	}
	
	public E getData(){
		return data;
	}
	
	public void setPrevious(Node <E> x){
		this.previousNode = x;
	}
  }

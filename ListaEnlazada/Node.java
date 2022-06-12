public class Node<E> {
    private E data ; //dato generico 
    private Node<E> next; //referencia a un nodo, clase parametrizada
    
    //constructores
    public Node(E data, Node<E> next){ //recibe un nodo y el sgte
        this.data = data;
        this.next = next;
    }
    public Node(E data){ //recibe un nodo y al sgte null
        this(data,null); //invoca al primer constructor
    }
    //getter y setter
    public E getData(){
        return this.data;
    }
    public void setData(E data){
        this.data = data;
    }
    public Node<E> getNext(){
        return this.next;
    }
    public void setNext(Node<E> next){
        this.next = next;
    }
    public String toString(){
        return this.data.toString();
    } 
}


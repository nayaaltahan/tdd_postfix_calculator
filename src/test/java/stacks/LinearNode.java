package stacks;

// represents a node in a link
public class LinearNode<T> {
	//
	private T element;
	private LinearNode<T> next;

//
	public LinearNode() {
		next = null;
		element = null;
	}

// we create a node that stores the given element
	public LinearNode(T element) {
		next = null;
		this.element = element;
	}

public LinearNode<T> getNext(){
	return next;
}

public void  setNext(LinearNode<T> node){
	next=node;

}
public T getElement() {
	return element;
}
public void setElement(T elem) {
	element=elem;
}
}
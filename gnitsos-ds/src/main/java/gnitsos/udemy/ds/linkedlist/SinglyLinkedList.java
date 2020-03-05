package gnitsos.udemy.ds.linkedlist;

public class SinglyLinkedList<T> {
	private Node<T> first;
	
	private Node<T> last;

	private int size;
	
	void add(Node<T> node) {
		if(size == 0 ) {
			size++;
			 first = last = node;
			return;
		}
		size++;
		last.setNextNode(node);
		last = node;
	}
	
	public int length() {
		return size;
	}
	
	public Node<T >getHead() {
		return first;
	}
}

package gnitsos.udemy.ds.linkedlist.circular;

public class CircularLinkedList<T> {
	private Node<T> first;

	private Node<T> last;

	private int size;

	public void insertLast(Node<T> node) {
		size++;
		if (isEmpty()) {
			first = last = node;
			return;
		}
		last.setNextNode(node);
		last = node;
	}
	
	public void insertFirst(Node<T> node) {
		size++;
		if (isEmpty()) {
			first = last = node;
			return;
		}
		node.setNextNode(first);
		first = node;
	}

	public int length() {
		return size;
	}

	public Node<T> getFirst() {
		return first;
	}

	public Node<T> getLast() {
		return last;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public Node<T> removeFirst() throws EmptyListException{
		if(isEmpty()) {
			throw new EmptyListException("Can not get head out of an empty list");
		}
		if(first.getNextNode() == null) {
			last = null;
		}
		size--;
		Node<T> exHead = first;
		first = first.getNextNode();
		return exHead;
	}
}

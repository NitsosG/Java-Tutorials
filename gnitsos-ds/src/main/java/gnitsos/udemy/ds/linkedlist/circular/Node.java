package gnitsos.udemy.ds.linkedlist.circular;

public class Node<T> {
	private Node<T> next = null;
	private T data;

	public Node(T data) {
		this.data = data;
	}

	public void setNextNode(Node<T> node) {
		next = node;
	}

	public Node<T> getNextNode() {
		return next;
	}

	public T getData() {
		return data;
	}
}

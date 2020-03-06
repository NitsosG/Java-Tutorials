package gnitsos.udemy.ds.list.linked.circular;

import gnitsos.udemy.ds.list.EmptyListException;

public class CircularLinkedList<T> {
	private Node<T> firstNode;

	private Node<T> lastNode;

	private int size;

	public void insertLast(T data) {
		size++;
		Node<T> node = new Node<>(data);
		if (isEmpty()) {
			firstNode = lastNode = node;
			return;
		}
		lastNode.nextNode = node;
		lastNode = node;
	}

	public void insertFirst(T data) {
		size++;
		Node<T> node = new Node<>(data, firstNode);
		if (isEmpty()) {
			lastNode = node;
		}
		firstNode = node;
	}

	public int length() {
		return size;
	}

	public T getFirst() {
		return firstNode.data;
	}

	public T getLast() {
		return lastNode.data;
	}

	public boolean isEmpty() {
		return firstNode == null;
	}

	public T removeFirst() throws EmptyListException {
		if (isEmpty()) {
			throw new EmptyListException("Can not get head out of an empty list");
		}
		if (firstNode.nextNode == null) {
			lastNode = null;
		}
		size--;
		T head = firstNode.data;
		firstNode = firstNode.nextNode;
		return head;
	}
}

class Node<T> {
	Node<T> nextNode;
	T data;

	public Node(T data) {
		this.data = data;
	}

	public Node(T data, Node<T> next) {
		this.data = data;
		this.nextNode = next;
	}
}

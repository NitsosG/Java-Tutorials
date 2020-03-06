package gnitsos.udemy.ds.list.linked.doubly;

import java.util.NoSuchElementException;

public class DoublyLinkedList<T> {

	Node<T> firstNode;
	Node<T> lastNode;
	private int size;

	public void insertLast(T data) {
		Node<T> node = new Node<>(data, null, null);
		if (isEmpty()) {
			firstNode = node;
		}
		lastNode = node;
		size++;
	}

	public boolean isEmpty() {
		return firstNode == null;
	}

	public int length() {
		return size;
	}

	public void insertFirst(T data) {
		Node<T> node = new Node<>(data, null, null);
		if (isEmpty()) {
			lastNode = node;
		}
		firstNode = node;
		size++;
	}
	
	public T getFirst() {
		return firstNode.data;
	}
	
	public T getLast() {
		return lastNode.data;
	}
	
	public T get(int index) {
		if(index <0)
			throw new ArrayIndexOutOfBoundsException();
		if(index > size)
			throw new ArrayIndexOutOfBoundsException();
		int counter = 0;
		Node<T> currentNode = firstNode;
		while(counter <= index) {
			currentNode = currentNode.nextNode;
			counter++;
		}
		return currentNode.data;
		
	}
	
	public void insertAfter(T targetData, T data) {
		Node<T> targetNode = findNode(targetData);
		Node<T> newNode = new Node<>(data, targetNode.nextNode, targetNode);
		if(targetNode.hasNextNode())
			targetNode.nextNode.pastNode = newNode;
		targetNode.nextNode = newNode;
	}
	
	
	private Node<T> findNode(T data){
		Node<T> currentNode = firstNode;
		while(currentNode != null && !currentNode.data.equals(data) ) 
			currentNode = currentNode.nextNode;
		
		if(currentNode == null)
			throw new NoSuchElementException();
		
		return currentNode;
	}
}

class Node<T> {
	Node<T> nextNode;
	Node<T> pastNode;
	T data;

	public Node(T data, Node<T> nextNode, Node<T> pastNode) {
		this.data = data;
		this.nextNode = nextNode;
		this.pastNode = pastNode;
	}
	
	boolean hasNextNode() {
		return nextNode != null;
	}
}
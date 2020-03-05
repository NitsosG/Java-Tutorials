package gnitsos.udemy.ds.linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SinglyLinkedListTest {
	@Test
	public void sizeTest() {
		SinglyLinkedList<String> list = new SinglyLinkedList<>();
		list.add(new Node<String>("Giwrgos"));
		list.add(new Node<String>("Fanis"));
		list.add(new Node<String>("Eleni"));
		list.add(new Node<String>("Dimitris"));
		assertEquals(4, list.length());
	}
	
	@Test
	public void getHeadTest() {
		SinglyLinkedList<String> list = new SinglyLinkedList<>();
		list.add(new Node<String>("Giwrgos"));
		list.add(new Node<String>("Fanis"));
		list.add(new Node<String>("Eleni"));
		assertEquals("Giwrgos", list.getHead().getData());
	}
}

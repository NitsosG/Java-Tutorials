package gnitsos.udemy.ds.linkedlist.circular;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import gnitsos.udemy.ds.linkedlist.circular.CircularLinkedList;
import gnitsos.udemy.ds.linkedlist.circular.EmptyListException;
import gnitsos.udemy.ds.linkedlist.circular.Node;

public class CircularLinkedListTest {

	private CircularLinkedList<String> list;

	@BeforeEach
	public void init() {
		list = new CircularLinkedList<>();
		list.insertLast(new Node<String>("Giwrgos"));
		list.insertLast(new Node<String>("Fanis"));
		list.insertLast(new Node<String>("Eleni"));
		list.insertLast(new Node<String>("Dimitris"));
	}

	@Test
	public void sizeTest() {
		assertEquals(4, list.length());
	}

	@Test
	public void getHeadTest() {
		assertEquals("Giwrgos", list.getFirst().getData());
	}

	@Test
	public void getLastTest() {
		assertEquals("Dimitris", list.getLast().getData());
	}

	@Test
	public void removeHead() throws Exception{
		assertEquals("Giwrgos", list.removeFirst().getData());
		assertEquals(3, list.length());
		
		assertEquals("Fanis", list.removeFirst().getData());
		assertEquals(2, list.length());
		
		assertEquals("Eleni", list.removeFirst().getData());
		assertEquals(1, list.length());
		
		assertEquals("Dimitris", list.removeFirst().getData());
		assertEquals(0, list.length());
		
		Assertions.assertThrows(EmptyListException.class,()-> list.removeFirst());
	}
	
	@Test
	public void insertLastTest() throws Exception{
		CircularLinkedList<String> testList = new CircularLinkedList<>();
		
		testList.insertLast(new Node<String>("Apple"));
		assertEquals("Apple", testList.getFirst().getData());
		assertEquals(1, testList.length());
		
		testList.insertLast(new Node<String>("Banana"));
		assertEquals("Apple", testList.getFirst().getData());
		assertEquals(2, testList.length());
	}
	
	@Test
	public void insertFirstTest() throws Exception{
		CircularLinkedList<String> testList = new CircularLinkedList<>();
		
		testList.insertFirst(new Node<String>("Apple"));
		assertEquals("Apple", testList.getFirst().getData());
		assertEquals(1, testList.length());
		
		testList.insertFirst(new Node<String>("Banana"));
		assertEquals("Banana", testList.getFirst().getData());
		assertEquals("Apple", testList.getLast().getData());
		assertEquals(2, testList.length());
	}
}

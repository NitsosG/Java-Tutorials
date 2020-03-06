package gnitsos.udemy.ds.linkedlist.circular;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import gnitsos.udemy.ds.list.EmptyListException;
import gnitsos.udemy.ds.list.linked.circular.CircularLinkedList;

public class CircularLinkedListTest {

	private CircularLinkedList<String> list;

	@BeforeEach
	public void init() {
		list = new CircularLinkedList<>();
		list.insertLast("Giwrgos");
		list.insertLast("Fanis");
		list.insertLast("Eleni");
		list.insertLast("Dimitris");
	}

	@Test
	public void sizeTest() {
		assertEquals(4, list.length());
	}

	@Test
	public void getHeadTest() {
		assertEquals("Giwrgos", list.getFirst());
	}

	@Test
	public void getLastTest() {
		assertEquals("Dimitris", list.getLast());
	}

	@Test
	public void removeHead() throws Exception{
		assertEquals("Giwrgos", list.removeFirst());
		assertEquals(3, list.length());
		
		assertEquals("Fanis", list.removeFirst());
		assertEquals(2, list.length());
		
		assertEquals("Eleni", list.removeFirst());
		assertEquals(1, list.length());
		
		assertEquals("Dimitris", list.removeFirst());
		assertEquals(0, list.length());
		
		Assertions.assertThrows(EmptyListException.class,()-> list.removeFirst());
	}
	
	@Test
	public void insertLastTest() throws Exception{
		CircularLinkedList<String> testList = new CircularLinkedList<>();
		
		testList.insertLast("Apple");
		assertEquals("Apple", testList.getFirst());
		assertEquals(1, testList.length());
		
		testList.insertLast("Banana");
		assertEquals("Apple", testList.getFirst());
		assertEquals(2, testList.length());
	}
	
	@Test
	public void insertFirstTest() throws Exception{
		CircularLinkedList<String> testList = new CircularLinkedList<>();
		
		testList.insertFirst("Apple");
		assertEquals("Apple", testList.getFirst());
		assertEquals(1, testList.length());
		
		testList.insertFirst("Banana");
		assertEquals("Banana", testList.getFirst());
		assertEquals("Apple", testList.getLast());
		assertEquals(2, testList.length());
	}
}

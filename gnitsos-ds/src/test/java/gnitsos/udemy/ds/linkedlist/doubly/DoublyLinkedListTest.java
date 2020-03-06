package gnitsos.udemy.ds.linkedlist.doubly;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import gnitsos.udemy.ds.list.linked.doubly.DoublyLinkedList;

public class DoublyLinkedListTest {
	
	DoublyLinkedList<Integer> list;
	
	@BeforeEach
	public void init() {
		list = new DoublyLinkedList<Integer>();
		list.insertLast(1);
		list.insertLast(2);
		list.insertLast(3);
	}
	
	@Test
	public void testEmpty() {
		assertEquals(false, list.isEmpty());
	}
	
	
	@Test
	public void testLength() {
		assertEquals(3, list.length());
	}
	
	@Test
	public void testInsertLast() {
		assertEquals(3, list.getLast());
		
		list.insertLast(4);
		assertEquals(4, list.getLast());
	}
	
	@Test
	public void testInsertFirst() {
		assertEquals(1, list.getFirst());
		
		list.insertFirst(0);
		assertEquals(0, list.getFirst());
		assertEquals(4, list.length());
	}
	
	@Test
	public void testInsertAfter() {
		list.insertAfter(1, 15);
		assertEquals(15 ,list.get(2));
	}
}

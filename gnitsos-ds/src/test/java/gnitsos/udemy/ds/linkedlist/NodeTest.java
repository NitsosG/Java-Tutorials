package gnitsos.udemy.ds.linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NodeTest {

	@Test
	void test() {
		Node<Integer> node = new Node<>(5);
		node.setNextNode(new Node<Integer>(10));
		assertEquals(10, node.getNextNode().getData());
	}

}
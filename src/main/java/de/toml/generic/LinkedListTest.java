package de.toml.generic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

    @Test
    void testAddToEmptyList() {
        LinkedList list = new LinkedList();
        Assertions.assertNull(list.getHead());
        list.add(1);
        Assertions.assertNotNull(list.getHead());
        Assertions.assertNotNull(list.getHead().getValue());
        Assertions.assertNull(list.getHead().getNextNode());
    }

    @Test
    void testAddMoreThenOneValue() {
        LinkedList list = new LinkedList();
        Assertions.assertNull(list.getHead());
        for (int i = 0; i < 20; i++) {
            list.add(i);
        }

        ListNode current = list.getHead();
        int size = (current != null ? 0 : 1);
        while (current.getNextNode() != null) {
            current = current.getNextNode();
            size++;
        }
        list.printTree();

        Assertions.assertEquals(19, size);
    }

}

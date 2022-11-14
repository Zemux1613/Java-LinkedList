package de.toml.generic;

import de.toml.IntLinkedList;
import de.toml.IntListNode;

import java.util.StringJoiner;

public class LinkedList {
    private Class type;
    private ListNode firstNode;

    public <T> LinkedList add(final T value) {
        if (firstNode == null) {
            type = value.getClass();
            firstNode = new ListNode(value, null);
        } else {
            if (type != null) {
                if (value.getClass() != type) {
                    throw new IllegalArgumentException("Illegal type! The list is an " + type.getSimpleName() + " list.");
                }
            }
            ListNode currentNode = this.firstNode;
            while (currentNode.getNextNode() != null) {
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(new ListNode(value, null));
        }
        return this;
    }

    public void printTree() {
        if (firstNode == null) {
            System.out.println("Empty list");
        } else {
            StringJoiner values = new StringJoiner(",");
            ListNode currentNode = this.firstNode;
            while (currentNode.getNextNode() != null) {
                values.add(currentNode.getValue() + "");
                currentNode = currentNode.getNextNode();
            }
            values.add(currentNode.getValue() + "");
            System.out.println("List values: " + values);
        }
    }

    public ListNode getHead() {
        return firstNode;
    }

    public <T> LinkedList addAtStart(final T value) {
        this.type = value.getClass();
        this.firstNode = new ListNode(value, this.firstNode);
        return this;
    }
}

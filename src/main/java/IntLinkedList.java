import lombok.NoArgsConstructor;

import java.util.StringJoiner;

public class IntLinkedList {

    private IntListNode firstNode;

    public IntLinkedList add(final int value) {
        if (firstNode == null) {
            firstNode = new IntListNode(value, null);
        } else {
            IntListNode currentNode = this.firstNode;
            while (currentNode.getNextNode() != null) {
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(new IntListNode(value, null));
        }
        return this;
    }

    public void printTree() {
        if (firstNode == null) {
            System.out.println("Empty list");
        } else {
            StringJoiner values = new StringJoiner(",");
            IntListNode currentNode = this.firstNode;
            while (currentNode.getNextNode() != null) {
                values.add(currentNode.getValue() + "");
                currentNode = currentNode.getNextNode();
            }
            values.add(currentNode.getValue() + "");
            System.out.println("List values: " + values);
        }
    }

    public IntListNode getHead() {
        return firstNode;
    }

    public IntLinkedList addAtStart(final int value) {
        this.firstNode = new IntListNode(value, this.firstNode);
        return this;
    }

    public IntLinkedList addRange(final int beginValue, final int endValue) {
        for (int i = beginValue; i <= endValue; i++) {
            add(i);
        }
        return this;
    }

    public IntLinkedList addRangeAtStart(final int beginValue, final int endValue) {
        for (int i = beginValue; i <= endValue; i++) {
            addAtStart(i);
        }
        return this;
    }
}

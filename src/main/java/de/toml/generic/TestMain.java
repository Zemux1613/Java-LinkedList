package de.toml.generic;

public class TestMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for (int i = 100; i > 0; i--) {
            list.addAtStart(i).printTree();
        }
        list.printTree();
    }
}

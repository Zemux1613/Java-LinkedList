package de.toml.generic;

public class TestMain {
    public static void main(String[] args) {
        /*
        BWL = Ethik :check:
         */
        LinkedList list = new LinkedList();
        for (int i = 100; i > 0; i--) {
            list.addAtStart(i);
        }
        while (list.getIterator().hasNext()) {
            System.out.println(list.getIterator().next().getValue().toString());
        }
        list.printTree();
    }
}

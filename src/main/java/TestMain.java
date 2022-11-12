public class TestMain {
    public static void main(String[] args) {
        final IntLinkedList linkedList = new IntLinkedList();

        System.out.println("Add 1");
        linkedList.add(1).printTree();
        System.out.println("Add 2 and 3");
        linkedList.add(2).add(3).printTree();

        System.out.println("addAtStart: ");
        linkedList.addAtStart(9).printTree();

        System.out.println("Add range 0..10");
        linkedList.addRange(0, 10).printTree();

        System.out.println("addRangeAtStart: ");
        linkedList.addRangeAtStart(0, 10).printTree();

        System.out.println("normal print: ");
        linkedList.printTree();
    }
}

package LinkedList.CircularSinglyLinkedList;

public class MainCSLL {
    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();

        csll.createCSLL(4);
        System.out.println(csll.head.value);

        csll.insertCSLL(6, 0);
        csll.insertCSLL(10, 4);
        csll.insertCSLL(11, 2);

        csll.traverseCSLL();
    }
}

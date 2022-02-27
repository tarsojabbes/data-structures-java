package LinkedList;

public class MainSLL {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

        sll.createSinglyLinkedList(5);
        System.out.println(sll.head.value);

        sll.insertInLinkedList(10, 0);
        System.out.println(sll.head.value);

        sll.insertInLinkedList(6, 1);
        System.out.println(sll.head.next.value);

        sll.insertInLinkedList(4, 3);
        System.out.println(sll.tail.value);

        sll.traverseSinglyLinkedList();
    }
}

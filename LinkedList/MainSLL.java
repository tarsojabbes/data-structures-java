package LinkedList;

public class MainSLL {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.createSinglyLinkedList(5);

        System.out.println(sll.head.value);
    }
}

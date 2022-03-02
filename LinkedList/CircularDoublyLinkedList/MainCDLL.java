package LinkedList.CircularDoublyLinkedList;

public class MainCDLL {
    public static void main(String[] args) {
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.createCDLL(1);
        System.out.println(cdll.head.value);

        cdll.insertCDLL(2, 0);
        cdll.insertCDLL(3, 2);
        cdll.insertCDLL(4, 3);

        cdll.traverseCDLL();
        cdll.reverseTraversalCDLL();

        cdll.searchCDLL(3);
        cdll.searchCDLL(10);

        cdll.deleteNodeCDLL(3);
        cdll.traverseCDLL();

        cdll.deleteCDLL();
        cdll.traverseCDLL();
    }
}

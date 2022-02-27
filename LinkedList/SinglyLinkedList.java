package LinkedList;

public class SinglyLinkedList {
    public NodeSLL head;
    public NodeSLL tail;
    public int size;

    public NodeSLL createSinglyLinkedList(int nodeValue) {
        head = new NodeSLL();
        NodeSLL node = new NodeSLL();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;

        return head;
    }

}

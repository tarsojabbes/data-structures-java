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

    public void insertInLinkedList(int nodeValue, int location) {
        NodeSLL node = new NodeSLL();
        node.value = nodeValue;

        if (head == null) {
            createSinglyLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            NodeSLL tempNode = head;
            int index = 0;

            while (index < location  - 1){
                tempNode = tempNode.next;
                index++;
            }

            NodeSLL nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }

        size++;
    }

    public void traverseSinglyLinkedList() {
        if (head == null) {
            System.out.println("SLL does not exists");
        } else {
            NodeSLL tempNode = head;

            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);

                if (i != size - 1) {
                    System.out.print(" -> ");
                }

                tempNode = tempNode.next;
            }
        }

        System.out.println("\n");
    }
}

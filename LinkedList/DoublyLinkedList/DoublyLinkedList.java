package LinkedList.DoublyLinkedList;

public class DoublyLinkedList {
    public NodeDLL head;
    public NodeDLL tail;
    public int size;

    public NodeDLL createDLL(int nodeValue) {
        head = new NodeDLL();
        NodeDLL node = new NodeDLL();
        node.value = nodeValue;
        node.next = null;
        node.previous = null;

        head = node;
        tail = node;
        size = 1;

        return head;
    }

    public void insertDLL(int nodeValue, int location) {
        NodeDLL node = new NodeDLL();
        node.value = nodeValue;

        if (head == null){
            createDLL(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            node.previous = null;

            head.previous = node;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            node.previous = tail;
            tail = node;
        } else {
            NodeDLL tempNode = head;
            int index = 0;

            while (index < location - 1){
                tempNode = tempNode.next;
                index++;
            }

            node.previous = tempNode;
            node.next = tempNode.next;
            tempNode.next = node;
            node.next.previous = node;
        }
        size++;
    }

    public void traverseDLL(){
        if (head != null) {
            NodeDLL tempNode = head;
            for (int i = 0; i < size; i++){
                System.out.print(tempNode.value);
                if (i != size - 1){
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        } else {
            System.out.println("The DLL does not exist");
        }
        System.out.print("\n");
    }

    public void reverseTraversalDLL() {
        if (head != null) {
            NodeDLL tempNode = tail;
            for (int i = 0; i < size; i++){
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" <- ");
                }
                tempNode = tempNode.previous;
            }
        } else {
            System.out.println("The DLL does not exist");
        }
        System.out.print("\n");
    }
}

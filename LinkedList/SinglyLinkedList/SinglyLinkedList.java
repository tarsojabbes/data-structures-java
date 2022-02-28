package LinkedList.SinglyLinkedList;

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
            System.out.println("SLL does not exist");
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

    public boolean searchNode(int nodeValue) {
        if (head != null){
            NodeSLL tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.print("Found the node at location: " + i + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            } 
        }
        System.out.print("Node not found"); 
        return false;
        
    }

    public void deletionOfNode(int location) {
        if (head == null) {
            System.out.println("The SLL doesn't exist");
            return;
        } else if (location == 0) {
            head = head.next;
            size--;

            if (size == 0) {
                tail = null;
            }
        } else if (location >= size){
            NodeSLL tempNode = head;

            for (int i = 0; i < size - 1; i++){
                tempNode = tempNode.next;
            }

            if (tempNode == head) {
                tail = head = null;
                size--;
                return;
            }

            tempNode.next = null;
            tail = tempNode;
            size--;
        } else {
            NodeSLL tempNode = head;
            for (int i = 0; i < location - 1; i++){
                tempNode = tempNode.next;
            }

            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    public void deleteSinglyLinkedList() {
        head = null;
        tail = null;
        System.out.println("The SLL deleted successfully");
    }
}

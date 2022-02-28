package LinkedList.CircularSinglyLinkedList;

public class CircularSinglyLinkedList {
    public NodeCSLL head;
    public NodeCSLL tail;
    public int size;

    public NodeCSLL createCSLL(int nodeValue) {
        head = new NodeCSLL();
        NodeCSLL node = new NodeCSLL();
        node.value = nodeValue;
        node.next = node;

        head = node;
        tail = node;
        size = 1;

        return head;
    }

    public void insertCSLL(int nodeValue, int location) {
        NodeCSLL node = new NodeCSLL();
        node.value = nodeValue;

        if (head == null) {
            createCSLL(nodeValue);
        } else if (location == 0) {
            node.next = head;
            head = node;
            tail.next = head;
        } else if (location >= size){
            tail.next = node;
            tail = node;
            tail.next = head;
        } else {
            NodeCSLL tempNode = head;

            int index = 0;
            while (index < location - 1){
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;
    }

    public void traverseCSLL(){
        if (head != null) {
            NodeCSLL tempNode = head;
            for (int i = 0; i < size; i++){
                System.out.print(tempNode.value);
                if (i != size - 1){
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        } else {
            System.out.println("\n CSLL does not exist");
        }
    }

    public boolean searchCSLL(int nodeValue) {
        if (head != null) {
            NodeCSLL tempNode = head;

            for (int i = 0; i < size; i++){
                if (tempNode.value == nodeValue){
                    System.out.println("Found node at location: " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found");
        return false;
    }

    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("The CSLL does not exist");
            return;
        } else if (location == 0){
            head = head.next;
            tail.next = head;
            size--;

            if (size == 0){
                tail = null;
                head.next= null;
                head = null;
            }
        } else if (location >= size) {
            NodeCSLL tempNode = head;
            for (int i = 0; i < size - 1; i++){
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                head.next = null;
                tail = head = null;
                return;
            }
            tempNode.next = head;
            tail = tempNode;
            size--;
        } else {
            NodeCSLL tempNode = head;
            for (int i = 0; i < location - 1; i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    public void deleteCSLL(){
        if (head == null) {
            System.out.println("CSLL does not exist");
        } else {
            head = null;
            tail.next = null;
            tail = null;
            System.out.println("CSLL has been deleted");
        }
    }
}

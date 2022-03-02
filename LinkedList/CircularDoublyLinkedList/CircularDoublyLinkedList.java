package LinkedList.CircularDoublyLinkedList;

public class CircularDoublyLinkedList {
    public NodeCDLL head;
    public NodeCDLL tail;
    public int size;

    public NodeCDLL createCDLL(int nodeValue){
        head = new NodeCDLL();
        NodeCDLL node = new NodeCDLL();

        node.value = nodeValue;
        head = node;
        tail = node;

        node.next = node;
        node.previous = node;
        size = 1;
        return head;
    }

    public void insertCDLL(int nodeValue, int location){
        NodeCDLL node = new NodeCDLL();
        node.value = nodeValue;

        if (head == null) {
            createCDLL(nodeValue);
            return;
        } else if (location == 0){
            node.next = head;
            node.previous = tail;
            head.previous = node;
            tail.next = node;
            head = node;
        } else if (location >= size) {
            node.next = head;
            node.previous = tail;
            head.previous = node;
            tail.next = node;
            tail = node;
        } else {
            NodeCDLL tempNode = head;
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

    public void traverseCDLL(){
        if (head != null) {
            NodeCDLL tempNode = head;
            for (int i = 0; i < size; i++){
                System.out.print(tempNode.value);
                if (i != size - 1){
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        } else {
            System.out.println("The CDLL does not exist");
        }
        System.out.print("\n");
    }

    public void reverseTraversalCDLL(){
        if (head != null) {
            NodeCDLL tempNode = tail;
            for (int i = 0; i < size; i++){
                System.out.print(tempNode.value);
                if (i != size - 1){
                    System.out.print(" <- ");
                }
                tempNode = tempNode.previous;
            }
        } else {
            System.out.println("The CDLL does not exist");
        }
        System.out.print("\n");
    }

    public boolean searchCDLL(int nodeValue){
        if (head != null){
            NodeCDLL tempNode = head;
            for (int i = 0; i < size; i++){
                if (tempNode.value == nodeValue){
                    System.out.println("Node found at location: "+ i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found");
        return false;
    }

    public void deleteNodeCDLL(int location){
        if (head == null){
            System.out.println("The CDLL does not exist");
            return;
        } else if (location == 0) {
            if (size == 1) {
                head.previous = null;
                head.next = null;
                tail.previous = null;
                tail.next = null;
                size = 0;
                return;
            } else {
                head = head.next;
                head.previous = tail;
                tail.next = head;
                size--;
            }
        } else if (location >= size) {
            if (size == 1) {
                head.previous = null;
                head.next = null;
                tail.previous = null;
                tail.next = null;
                size = 0;
                return;
            } else {
                tail = tail.previous;
                tail.next = head;
                head.previous = tail;
                size--;
            }
        } else {
            NodeCDLL tempNode = head;
            for (int i = 0; i < location - 1; i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.previous = tempNode;
            size--;
        }
    }

    public void deleteCDLL(){
        NodeCDLL tempNode = head;
        for (int i = 0; i < size; i++) {
            tempNode.previous = null;
            tempNode = tempNode.next;
        }
        head = null;
        tail = null;
        System.out.println("TheCDLL has been successfully deleted");
    }
    
}

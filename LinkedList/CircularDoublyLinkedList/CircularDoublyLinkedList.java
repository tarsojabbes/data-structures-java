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
    
}

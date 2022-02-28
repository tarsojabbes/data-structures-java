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
}

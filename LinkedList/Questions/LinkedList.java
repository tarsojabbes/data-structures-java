package LinkedList.Questions;

public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    public void create(int value){
        head = new Node();
        Node node = new Node();
        node.value = value;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
    }

    public void insert(int value, int location){
        Node node = new Node();
        node.value = value;
        if (location == 0){
            node.next = head;
            head = node;
        } else if (location >= size){
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = new Node();
            tempNode = head;
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

    public boolean searchNode(int value){
        Node tempNode = head;
        for (int i = 0; i < size; i++){
            if (tempNode.value == value){
                return true;
            }
            tempNode = tempNode.next;
        }
        return false;
    }

    public void deleteNode(int location){
        if (location == 0){
            head = head.next;
            size--;

            if (size == 0){
                tail = null;
            }
        } else if (location >= size){
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++){
                tempNode = tempNode.next;
            }

            if (tempNode == head){
                tail = head = null;
                size--;
            }

            tempNode.next = null;
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            for (int i =0; i < location -1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    public void traversal(){
        Node tempNode = head;

        for (int i = 0; i < size; i++){
            if (tempNode.next != null){
                System.out.print(tempNode.value + "->");
            } else {
                System.out.print(tempNode.value);
            }
            tempNode = tempNode.next;
        }
    }


}

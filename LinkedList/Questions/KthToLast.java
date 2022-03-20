package LinkedList.Questions;

public class KthToLast {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.create(1);
        linkedList.insert(2, 1);
        linkedList.insert(3, 2);
        linkedList.insert(4, 3);
        linkedList.insert(5, 2);
        linkedList.insert(4, 1);
        linkedList.insert(3, 1);

        kthToLast(linkedList, 2);
    }

    public static void kthToLast(LinkedList linkedlist, int location){
        Node tempNode = linkedlist.head;

        for (int i = 0; i < linkedlist.size - location; i++){
            tempNode = tempNode.next;
        }
        System.out.println(tempNode.value);
    }
}


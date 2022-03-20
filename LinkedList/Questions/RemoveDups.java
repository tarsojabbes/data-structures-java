package LinkedList.Questions;

import java.util.HashSet;

public class RemoveDups {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.create(1);
        linkedList.insert(2, 1);
        linkedList.insert(3, 2);
        linkedList.insert(4, 3);
        linkedList.insert(5, 2);
        linkedList.insert(4, 1);
        linkedList.insert(3, 1);

        removeDups(linkedList);


        linkedList.traversal();
    }

    public static void removeDups (LinkedList linkedList){
        HashSet<Integer> hashSet = new HashSet<>();
        Node tempNode = linkedList.head;
        for (int i = 0; i < linkedList.size; i++){
            if (!hashSet.contains(tempNode.value)){
                hashSet.add(tempNode.value);
            }
            tempNode = tempNode.next;
        }
        System.out.println(hashSet);
    }
}

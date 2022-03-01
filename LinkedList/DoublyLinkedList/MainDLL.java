package LinkedList.DoublyLinkedList;

public class MainDLL {
 public static void main(String[] args) {
     DoublyLinkedList dll = new DoublyLinkedList();
     
     dll.createDLL(1);
     System.out.println(dll.head.value);

     dll.insertDLL(5, 0);
     dll.insertDLL(10, 3);
     dll.insertDLL(2, 2);

     dll.traverseDLL();

     dll.reverseTraversalDLL();

 }   
}

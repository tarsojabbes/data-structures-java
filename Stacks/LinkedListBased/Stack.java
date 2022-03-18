package Stacks.LinkedListBased;

import LinkedList.SinglyLinkedList.SinglyLinkedList;

public class Stack {
    SinglyLinkedList linkedlist;

    public Stack() {
        this.linkedlist = new SinglyLinkedList();
    }

    public void push(int value){
        linkedlist.insertInLinkedList(value, 0);
        System.out.println("Inserted "+value+" in stack");
    }

    public boolean isEmpty() {
        if (linkedlist.head == null){
            return true;
        }
        return false;
    }

    public void pop() {
        int result = -1;
        if (isEmpty()){
            System.out.println("The stack is empty");
            return;
        } else {
            result = linkedlist.head.value;
            linkedlist.deletionOfNode(0);
            System.out.println(result);
        }
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        } else {
            return linkedlist.head.value;
        }
    }

    public void delete() {
        linkedlist.head = null;
        System.out.println("The stack was successfully deleted");
    }

}

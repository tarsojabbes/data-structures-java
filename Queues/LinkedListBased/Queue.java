package Queues.LinkedListBased;

import LinkedList.SinglyLinkedList.SinglyLinkedList;

public class Queue {
    SinglyLinkedList list;

    public Queue(){
        this.list = new SinglyLinkedList();
    }

    public boolean isEmpty(){
        if (list.head == null){
            return true;
        }
        return false;
    }

    public void enqueue(int value){
        list.insertInLinkedList(value, list.size);
    }

    public int dequeue(){
        if (isEmpty()){
            return -1;
        } else {
            int value = list.head.value;
            list.deletionOfNode(0);
            return value;
        }
    }

    public int peek(){
        if (isEmpty()){
            return -1;
        } else {
            return list.head.value;
        }
    }

    public void delete(){
        list.head = null;
        list.tail = null;
    }


}

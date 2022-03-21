package Queues.ArrayBased.CircularQueues;
     
public class Main {
    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(3);
        System.out.println(circularQueue.isEmpty());
        System.out.println(circularQueue.isFull());

        circularQueue.enqueue(1);
        circularQueue.enqueue(2);
        circularQueue.enqueue(3);
        circularQueue.enqueue(4);

        System.out.println(circularQueue.dequeue());

        System.out.println(circularQueue.peek());

        circularQueue.delete();

    }
}
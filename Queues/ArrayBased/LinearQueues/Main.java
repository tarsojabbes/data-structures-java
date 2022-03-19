package Queues.ArrayBased.LinearQueues;

public class Main {
    public static void main(String[] args) {
        LinearQueue queue = new LinearQueue(4);

        System.out.println(queue.isFull());

        System.out.println(queue.isEmpty());

        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);

        System.out.println(queue.dequeue());
        queue.dequeue();

        System.out.println(queue.peek());

        queue.delete();

    }
}

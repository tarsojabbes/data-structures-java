package Queues.LinkedListBased;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        System.out.println(queue.isEmpty());

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue());

        System.out.println(queue.peek());

        queue.delete();
    }
}

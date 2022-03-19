package Queues.ArrayBased.LinearQueues;

public class LinearQueue {
    int[] arr;
    int topOfQueue;
    int beginningfOfQueue;

    public LinearQueue(int size){
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningfOfQueue = -1;
    }

    public boolean isFull(){
        if (topOfQueue == arr.length -1){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if (beginningfOfQueue == -1 || beginningfOfQueue == arr.length){
            return true;
        }
        return false;
    }

    public void enqueue(int value){
        if (isFull()){
            System.out.println("Full queue");
        } else if (isEmpty()){
            beginningfOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
        } else {
            topOfQueue++;
            arr[topOfQueue] = value;
        }
    }

    public int dequeue(){
        if (isEmpty()){
            System.out.println("Empty queue");
            return -1;
        } else {
            int result = arr[beginningfOfQueue];
            beginningfOfQueue++;
            if (beginningfOfQueue > topOfQueue) {
                beginningfOfQueue = -1;
                topOfQueue = -1;
            }
            return result;
        }
    }

    public int peek(){
        if (!isEmpty()){
            return arr[beginningfOfQueue];
        } else {
            System.out.println("Empty queue");
            return -1;
        }
    }

    public void delete(){
        arr = null;
    }




}

package Queues.ArrayBased.CircularQueues;

public class CircularQueue {
    int[] arr;
    int top;
    int beginning;
    int size;

    public CircularQueue(int size){
        this.arr = new int[size];
        this.size = size;
        this.top = -1;
        this.beginning = -1;
    }

    public boolean isEmpty(){
        if (top == -1){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if (top + 1 == beginning){
            return true;
        } else if (beginning == 0 && top + 1 == size){
            return true;
        }
        return false;
    }

    public void enqueue(int value){
        if (isFull()){
            System.out.println("Full queue");
        } else if (isEmpty()){
            beginning = 0;
            top++;
            arr[top] = value;
        } else {
            if (top + 1 == size) {
                top = 0;
            } else {
                top++;
            }
            arr[top] = value;
        }
    }

    public int dequeue(){
        if (isEmpty()){
            return -1;
        } else {
            int result = arr[beginning];
            arr[beginning] = Integer.MIN_VALUE;
            if (beginning == top){
                beginning = -1;
                top = -1;
            } else if (beginning == size - 1){
                beginning = Integer.MIN_VALUE;
            } else {
                beginning++;
            }
            return result;
        }
    }

    public int peek(){
        if (isEmpty()){
            return -1;
        } else {
            return arr[beginning];
        }
    }

    public void delete(){
        arr = null;
    }


}

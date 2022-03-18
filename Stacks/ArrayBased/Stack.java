package Stacks.ArrayBased;

public class Stack {
    int[] arr;
    int topOfStack;

    public Stack(int size) {
        this.arr= new int[size];
        this.topOfStack = -1;
        System.out.println("The stack is created with size of "+size);
    }

    public boolean isEmpty() {
        if (topOfStack == -1) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (topOfStack == arr.length - 1){
            return true;
        }
        return false;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("The stack is full");
        } else {
            arr[topOfStack+1] = value;
            topOfStack++;
            System.out.println("The value is successfully inserted");
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return;
        } else {
            int topStack = arr[topOfStack];
            topOfStack--;
            System.out.println(topStack);
        }
    }

    public int peek() {
        if (isEmpty()){
            System.out.println("The stack is empty");
            return -1;
        }
        return arr[topOfStack];
    }

    public void delete(){
        arr = null;
        System.out.println("Stack deleted successfully");
    }


}

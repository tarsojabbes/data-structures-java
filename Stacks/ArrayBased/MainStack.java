package Stacks.ArrayBased;

public class MainStack {
    public static void main(String[] args) {
        // Creation of the stack
        Stack newStack = new Stack(4);

        // Checking if either it's empty or not
        boolean result = newStack.isEmpty();
        System.out.println(result);

        // Checking if either it's full or not
        boolean isfull = newStack.isFull();
        System.out.println(isfull);

        // Inserting values into the stack
        newStack.push(3);
        newStack.push(5);
        newStack.push(10);
        newStack.push(2);
        newStack.push(4); // Will not be added once the stack is full

        // Deleting values from the top of the stack
        for (int i = 0; i < 5; i++) {
            newStack.pop();
        }

        // Testing the peek method
        System.out.println(newStack.peek());
        newStack.push(3);
        System.out.println(newStack.peek());

        // Deleting all the stack
        newStack.delete();

    }
}

package Stacks.LinkedListBased;

public class MainStack {
    public static void main(String[] args) {
        // Creating a Linked List based Stack
        Stack newStack = new Stack();
        
        // Pushing elements into the stack
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);

        // isEmpty method
        boolean result = newStack.isEmpty();
        System.out.println(result);

        // Testing pop method
        newStack.pop();

        // Peek method
        System.out.println(newStack.peek());

        newStack.delete();
    }
}

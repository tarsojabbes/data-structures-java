package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        Integer sequence = fibonacci(8);
        System.out.println(sequence);

    }
    // Recursive flow
    // 5 = 3 + 2 -> fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)

    public static int fibonacci(int n) {
        if (n < 0){
            return -1;
        }
        if (n == 0 || n == 1){
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}

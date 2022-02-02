package Recursion;

public class Factorial {
    public static void main(String[] args) {
        Integer result = factorial(5);
        System.out.println(result);
    }

    private static int factorial(int i) {
        if (i < 1) {
            return -1;
        }
        if (i==0 || i == 1){
            return 1;
        } else {
            return i * factorial(i-1);
        }
        
    }
}

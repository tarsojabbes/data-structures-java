package Recursion.Questions;

public class Power {
    public static void main(String[] args) {
        Integer result = power(5,3);
        System.out.println(result);
    }

    public static int power(int i, int j) {
        if (j == 0) {
            return 1;
        } else {
            return i * power(i, j - 1);
        }
        
    }
}

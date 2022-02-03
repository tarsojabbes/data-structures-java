package Recursion.Questions;

public class SumOfDigits {
    public static void main(String[] args) {
        Integer result = sumOfDigits(115);
        System.out.println(result);
    }

    public static int sumOfDigits(int i) {
        if (i < 1) {
            return 0; 
        } else {
            return (i%10)+ sumOfDigits(i/10);
        }
        
    }
}

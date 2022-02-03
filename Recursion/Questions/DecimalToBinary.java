package Recursion.Questions;

public class DecimalToBinary {
    public static void main(String[] args) {
        String binary = decimalToBinary(10);
        System.out.println(binary);
    }

    public static String decimalToBinary(int i) {
        if (i < 1) {
            return "";
        } else {
            return decimalToBinary(i/2) + Integer.toString(i%2);
        }
        
    }
}

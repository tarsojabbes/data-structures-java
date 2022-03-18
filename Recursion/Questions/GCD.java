package Recursion.Questions;

public class GCD {
    public static void main(String[] args) {
        Integer result = gcd(18,48);
        System.out.println(result);
    }

    // To find the GCD we need the implement the Euclidian Algorithm
    // gcd(48,18) -> 48/18 = 2 and remains 12
    // gcd(18, 12) -> 18/12 = 1 and remains 6
    // gcd(12, 6) -> 12/6 = 0 -> Our GCD is 6

    public static int gcd(int i, int j) {
        if (j == 0) {
            return i;
        } else {
            return gcd(j, i%j);
        }
    }
}

package Recursion;
public class BasicRecursion {
    public static void main(String[] args) {
        basicRecursion(5);
    }

    private static void basicRecursion(int i) {
        if (i<1){
            System.out.println("N is less then 1");
        } else {
            basicRecursion(i-1);
            System.out.println(i);
        }
    }
}

package Arrays.Questions;

import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        int[] array_a = {1,2,3,4,5};
        int[] array_b = {5,1,2,3,6};
        boolean result = permutation(array_a, array_b);
        System.out.println(result);
    }

    public static Boolean permutation(int[] array_a, int[] array_b){
        if (array_a.length == array_b.length) {
            Arrays.sort(array_a);
            Arrays.sort(array_b);
            return Arrays.equals(array_a, array_b);
        } else {
            return false;
        }
    }
}

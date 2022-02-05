package Arrays;

import java.util.Arrays;

public class BasicArray {
    public static void main(String[] args) {
        int[] intArray; // Declaring
        intArray = new int[3]; // Instantiating
        intArray[0] = 1; // Initializing
        intArray[1] = 2;
        intArray[2] = 3;

        System.out.println(Arrays.toString(intArray));

        String sArray[] = {"a", "b", "c", "s"};
        System.out.println(Arrays.toString(sArray));

        SingleDimensionArray sda = new SingleDimensionArray(3);
        sda.insert(0, 4);
        sda.insert(1, 15);
        sda.insert(2, 3);

        sda.traverseArray();
        System.out.println("");
        sda.searchInArray(15);
        sda.delete(2);
        sda.traverseArray();


    }
}

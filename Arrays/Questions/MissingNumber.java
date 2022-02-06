package Arrays.Questions;

public class MissingNumber {
    public static void main(String[] args) {
        int intArray[] = {1,2,3,4,5,6,8,9,10};
        missingNumber(intArray);
    }

    public static void missingNumber(int[] intArray) {
        int array[] = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < intArray.length; i++) {
            if (array[i] == intArray[i]){
                continue;
            } else {
                System.out.println(array[i]);
                break;
            }
        }
    }
}

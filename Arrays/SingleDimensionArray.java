package Arrays;

public class SingleDimensionArray {
    int arr[] = null;

    public SingleDimensionArray(int size) {
        arr = new int[size];

        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int value){
        try {
            if (arr[location] == Integer.MIN_VALUE){
                arr[location] = value;
                System.out.println("Successfully inserted");
            } else {
                System.out.println("This cell is occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array!");
        }
        
    }

    public void traverseArray(){
        try {
            for (int x : arr){
                System.out.print(x + " ");
            }
        } catch (Exception e){
            System.out.println("Array no longer exists");
        }
        
    }

    public void searchInArray(int value){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == value){
                System.out.println("Value is found at the index of " + i);
                return;
            }
        }
        System.out.println(value + " were not found");
    }

    public void delete(int index){
        try {
            arr[index] = Integer.MIN_VALUE;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Couldn't delete");
        }
    }
}

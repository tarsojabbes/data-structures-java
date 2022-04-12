package Trees.BinaryHeap;

public class BinaryHeap {
    int arr[];
    int size;

    public BinaryHeap(int size) {
        this.arr = new int[size+1];
        this.size = 0;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public Integer peek() {
        if (isEmpty()) {
            return null;
        }
        return arr[1];
    }

    public int size() {
        return size;
    }

    public void levelOrder() {
        for (int i = 1; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
}

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
        for (int i = 1; i <= size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    public void heapfyBottomToTop(int index, String heapType) {
        int parent = index/2;
        if (index <= 1) {
            return;
        } 
        if (heapType == "Min") {
            if (arr[index] < arr[parent]) {
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
            }
        } else if (heapType == "Max") {
            if (arr[index] > arr[parent]) {
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
            }
        }

        heapfyBottomToTop(parent, heapType);
    }

    public void insert(int value, String heapType) {
        arr[size + 1] = value;
        size++;
        heapfyBottomToTop(size, heapType);
    }


    public void heapfyTopToBottom(int index, String heapType) {
        int left = index*2;
        int right = index*2 + 1;
        int swapChild = 0;

        if (size < left) {
            return;
        }

        if (heapType == "Max") {
            if (size == left) {
                if (arr[index] < arr[left]) {
                    int temp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = temp;
                }
                return;
            } else {
                if (arr[left] > arr[right]) {
                    swapChild = left;
                } else {
                    swapChild = right;
                }
                if (arr[index] < swapChild) {
                    int temp = arr[index];
                    arr[index] = arr[swapChild];
                    arr[swapChild] = temp;
                }
            }
        } else if (heapType == "Min") {
            if (size == left) {
                if (arr[index] > arr[left]) {
                    int temp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = temp;
                }
                return;
            } else {
                if (arr[left] < arr[right]) {
                    swapChild = left;
                } else {
                    swapChild = right;
                }
                if (arr[index] > swapChild) {
                    int temp = arr[index];
                    arr[index] = arr[swapChild];
                    arr[swapChild] = temp;
                }
            }
        }
        heapfyTopToBottom(swapChild, heapType);

    }

    public Integer extractHead(String heapType) {
        if (isEmpty()) {
            return null;
        } else {
            int extractedValue = arr[1];
            arr[1] = arr[size];
            size--;
            heapfyTopToBottom(1, heapType);
            return extractedValue;
        }
    }

    public void deleteBinaryHeap() {
        arr = null;
    }

    
}

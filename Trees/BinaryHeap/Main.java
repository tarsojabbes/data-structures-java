package Trees.BinaryHeap;

public class Main {
    public static void main(String[] args) {
        BinaryHeap bh = new BinaryHeap(5);

        System.out.println(bh.peek());
        System.out.println(bh.size());
        bh.levelOrder();
    }
}
package Trees.BinaryHeap;

public class Main {
    public static void main(String[] args) {
        BinaryHeap bh = new BinaryHeap(5);

        System.out.println(bh.peek());
        System.out.println(bh.size());
        bh.levelOrder();

        bh.insert(10, "Min");
        bh.insert(5, "Min");
        bh.insert(15, "Min");
        bh.insert(1, "Min");
        bh.levelOrder();

        System.out.println(bh.extractHead("Min"));
        bh.levelOrder();

        bh.deleteBinaryHeap();

    }
}
package Trees.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(10);
        bst.insert(15);
        bst.insert(3);
        bst.insert(40);
        bst.insert(7);
        bst.insert(6);
        bst.insert(25);
        bst.insert(1);

        bst.preOrder(bst.root);
        System.out.print("\n");
        bst.inOrder(bst.root);
        System.out.print("\n");
        bst.postOrder(bst.root);
        System.out.print("\n");
        bst.levelOrder();

        bst.search(bst.root, 10);
        bst.search(bst.root, 100);

        bst.deleteNode(bst.root, 1);
        bst.deleteNode(bst.root, 6);
        bst.deleteNode(bst.root, 100);
        bst.levelOrder();

        bst.deleteBST();
    }
}

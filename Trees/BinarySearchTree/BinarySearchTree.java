package Trees.BinarySearchTree;

public class BinarySearchTree {
    public BinaryNode root;

    public BinarySearchTree() {
        this.root = null;
    }

    private BinaryNode insert(BinaryNode currentNode, int value) {
        if (currentNode == null) {
            BinaryNode node = new BinaryNode();
            node.value = value;
            System.out.println("Value successfully inserted");
            return node;
        } else if (currentNode.value >= value) {
            currentNode.left = insert(currentNode.left, value);
            return currentNode;
        } else {
            currentNode.right = insert(currentNode.right, value);
            return currentNode;
        }
    }

    public void insert(int value) {
        insert(root, value);
    }


}

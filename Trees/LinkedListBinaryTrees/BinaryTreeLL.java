package Trees.LinkedListBinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
    BinaryNode root;

    public BinaryTreeLL() {
        this.root = null;
    }

    public void preOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);

    }

    public void postOrder(BinaryNode node) {
        if (node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    public void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode currentNode = queue.remove();
            System.out.print(currentNode.value + " ");
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }

            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
    }

    public void search(String value) {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()) {
            BinaryNode currentNode = queue.remove();
            if (currentNode.value == value) {
                System.out.println("Value "+value+" found in tree");
                return;
            } else {
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
    
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
        }
        System.out.println("Value not found");
    }

    public void insert(String value) {
        BinaryNode newNode = new BinaryNode();
        newNode.value = value;

        if (root == null) {
            root = newNode;
            System.out.println("Inserted new node at root");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()) {
            BinaryNode currentNode = queue.remove();
            if (currentNode.left == null) {
                currentNode.left = newNode;
                System.out.println("Successfully inserted");
                break;
            } else if (currentNode.right == null) {
                currentNode.right = newNode;
                System.out.println("Successfully inserted");
                break;
            } else {
                queue.add(currentNode.left);
                queue.add(currentNode.right);
            }
        }
    }

    public BinaryNode getDeepestNode(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode presentNode = null;
        while(!queue.isEmpty()){
            presentNode = queue.remove();

            if(presentNode.left != null) {
                queue.add(presentNode.left);
            }

            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
        return presentNode;
    }

    public void deleteDeepestNode(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode previousNode, presentNode = null;
        while(!queue.isEmpty()){
            previousNode = presentNode;
            presentNode = queue.remove();

            if(presentNode.left == null) {
                previousNode.right = null;
                return;
            } else if (presentNode.right == null) {
                presentNode.left = null;
                return;
            }
            queue.add(presentNode.left);
            queue.add(presentNode.right);
        }
    }

    public void deleteNode(String value) {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);

        while(!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();

            if (presentNode.value == value) {
                presentNode.value = getDeepestNode().value;
                deleteDeepestNode();
                System.out.println("Node deleted successfully");
                return;
            } else {
                if (presentNode.left != null) {
                    queue.add(presentNode.left);
                }
                if (presentNode.right != null) {
                    queue.add(presentNode.right);
                }
            }
        }
        System.out.println("The node doesn't exist");
    }

    public void deleteBinaryTree(){
        root = null;
        System.out.println("BT deleted successfully");
    }
}

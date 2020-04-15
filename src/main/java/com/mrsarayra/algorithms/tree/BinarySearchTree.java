package com.mrsarayra.algorithms.tree;

/***
 * All nodes of left subtree are less than root node
 * All nodes of right subtree are more than root node
 * Both subtrees of each node are also BSTs i.e. they have the above two properties
 */
public class BinarySearchTree extends AbstractTree<Integer> {

    public BinarySearchTree() {
    }


    public BinarySearchTree(Integer data) {
        super(data);
    }


    public void insert(Integer value) {
        root = insert(root, value);
    }


    private Node<Integer> insert(Node<Integer> root, Integer value) {
        if (root == null) {
            return createNode(value);
        }
        if (value < root.getData()) {
            root.setLeft(insert(root.getLeft(), value));
        } else if (value > root.getData()) {
            root.setRight(insert(root.getRight(), value));
        }
        return root;
    }


    public boolean containsValue(Integer value) {
        return containsValue(root, value);
    }


    private boolean containsValue(Node<Integer> root, Integer value) {
        if (root == null) {
            return false;
        }
        if (root.getData().equals(value)) {
            return true;
        }
        return value > root.getData() ?
                containsValue(root.getRight(), value) :
                containsValue(root.getLeft(), value);
    }


    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree(8);
        binarySearchTree.insert(1);
        binarySearchTree.insert(2);
        binarySearchTree.insert(6);
        binarySearchTree.insert(7);
        binarySearchTree.insert(10);
        binarySearchTree.insert(14);
        binarySearchTree.insert(4);

        System.out.println("Inorder traversal");
        binarySearchTree.inorderTraversal(binarySearchTree.getRoot());
        System.out.println(binarySearchTree.containsValue(4));
    }

}

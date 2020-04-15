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


    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree(8);
        Node<Integer> root1 = new Node<>(8);
        binarySearchTree.insert(root1, 3);
        binarySearchTree.insert(root1, 1);
        binarySearchTree.insert(root1, 6);
        binarySearchTree.insert(root1, 7);
        binarySearchTree.insert(root1, 10);
        binarySearchTree.insert(root1, 14);
        binarySearchTree.insert(root1, 4);

        System.out.println("Inorder traversal");
        binarySearchTree.inorderTraversal(root1);
//        System.out.println("Preorder traversal");
//        binarySearchTree.preorderTraversal(root1);
//        System.out.println("Postnorder traversal");
//        binarySearchTree.postorderTraversal(root1);
    }

}

package com.mrsarayra.algorithms.tree;

public class BinaryTree<T> extends AbstractTree<T> {

    public BinaryTree() {
    }


    public BinaryTree(T data) {
        super(data);
    }


    public static void main(String[] args) {
        BinaryTree<String> binaryTree = new BinaryTree<>("10");
        Node<String> root = binaryTree.getRoot();
        Node<String> left = binaryTree.insertLeft(root, "5");
        Node<String> right = binaryTree.insertRight(root, "9");

        binaryTree.insertLeft(left, "55");
        binaryTree.insertRight(right, "99");
        binaryTree.insertLeft(right, "999");
        /*      10
         *   5       9
         * 55     999  99   */
        System.out.println("Inorder traversal");
        binaryTree.inorderTraversal(root);
        System.out.println("Preorder traversal");
        binaryTree.preorderTraversal(root);
        System.out.println("Postnorder traversal");
        binaryTree.postorderTraversal(root);
    }

}

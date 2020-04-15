package com.mrsarayra.algorithms.tree;

public abstract class AbstractTree<T> {

    protected Node<T> root;


    public AbstractTree() {
        this.root = new Node<>();
    }


    public AbstractTree(T data) {
        this.root = new Node<>(data);
    }


    public <T> Node<T> createNode(T data) {
        Node<T> node = new Node<>();
        node.setData(data);
        return node;
    }


    public <T> Node<T> insertRight(Node<T> root, T data) {
        root.setRight(createNode(data));
        return root.getRight();
    }


    public <T> Node<T> insertLeft(Node<T> root, T data) {
        root.setLeft(createNode(data));
        return root.getLeft();
    }


    public void inorderTraversal(Node<T> root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.getLeft());
        System.out.println(root.getData());
        inorderTraversal(root.getRight());
    }


    public void preorderTraversal(Node<T> root) {
        if (root == null) {
            return;
        }
        System.out.println(root.getData());
        inorderTraversal(root.getLeft());
        inorderTraversal(root.getRight());
    }


    public void postorderTraversal(Node<T> root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.getLeft());
        inorderTraversal(root.getRight());
        System.out.println(root.getData());
    }


    public Node<T> getRoot() {
        return root;
    }


    public void setRoot(Node<T> root) {
        this.root = root;
    }

}

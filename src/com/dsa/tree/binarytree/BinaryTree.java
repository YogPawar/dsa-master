package com.dsa.tree.binarytree;

public class BinaryTree {

  BinaryTreeNode root;

  public BinaryTree() {
    this.root = null;
  }

  public void preOrder(BinaryTreeNode root) {
    if (root != null) {
      System.out.print(root.data + " ");
      preOrder(root.leftChild);
      preOrder(root.rightChild);
    }
  }

  public void inOrder(BinaryTreeNode root) {
    if (root != null) {
      inOrder(root.leftChild);
      System.out.print(root.data + " ");
      inOrder(root.rightChild);
    }
  }

  public void postOrder(BinaryTreeNode root) {
    if (root != null) {
      postOrder(root.leftChild);
      postOrder(root.rightChild);
      System.out.print(root.data + " ");
    }
  }

  public void insert(BinaryTreeNode root) {

  }
}

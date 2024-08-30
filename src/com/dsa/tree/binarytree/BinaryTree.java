package com.dsa.tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;

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

  public void levelOrder() {
    Queue<BinaryTreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      BinaryTreeNode presentNode = queue.remove();
      System.out.print(presentNode.data + " ");
      if (presentNode.leftChild != null) {
        queue.add(presentNode.leftChild);
      }

      if (presentNode.rightChild != null) {
        queue.add(presentNode.rightChild);
      }
    }
  }

  public String search(String data) {
    Queue<BinaryTreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      BinaryTreeNode presentNode = queue.remove();
      if (presentNode.data.equals(data)) {
        System.out.println("Value found in tree : " + presentNode.data);
        return presentNode.data;
      } else {

        if (presentNode.leftChild != null) {
          queue.add(presentNode.leftChild);
        }
        if (presentNode.rightChild != null) {
          queue.add(presentNode.rightChild);
        }
      }
    }
    return null;
  }

  public void insert(String data) {
    //create new node to add value
    BinaryTreeNode newNode = new BinaryTreeNode();
    newNode.data = data;
    if (root == null) {
      root = newNode;
      System.out.println("Inserted at root.");
      return;
    }
    //traverse the tree and insert at correct location (level order traversal).
    Queue<BinaryTreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      BinaryTreeNode currentNode = queue.remove();
      if (currentNode.leftChild == null) {
        currentNode.leftChild = newNode;
        System.out.println("Inserted at Left child.");
        break;
      } else if (currentNode.rightChild == null) {
        currentNode.rightChild = newNode;
        System.out.println("Inserted at right child.");

        break;
      } else {
        queue.add(currentNode.leftChild);
        queue.add(currentNode.rightChild);
      }
    }
  }

  public BinaryTreeNode getDeepestNode() {
    BinaryTreeNode deepestNode = null;
    Queue<BinaryTreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      deepestNode = queue.remove();
      if (deepestNode.leftChild != null) {
        queue.add(deepestNode.leftChild);
      }
      if (deepestNode.rightChild != null) {
        queue.add(deepestNode.rightChild);
      }
    }
    return deepestNode;
  }

  public void deleteDeepestNode() {
    Queue<BinaryTreeNode> queue = new LinkedList<>();
    queue.add(root);
    BinaryTreeNode previousNode, presentNode = null;
    while (!queue.isEmpty()) {
      previousNode = presentNode;
      presentNode = queue.remove();

      //check the deepest Node and remove the connection with previous node to deepest node.
      if (presentNode.leftChild == null) {
        previousNode.rightChild = null;
        return;
      } else if (presentNode.rightChild == null) {
        previousNode.leftChild = null;
        return;
      } else {
        queue.add(presentNode.leftChild);
        queue.add(presentNode.rightChild);
      }
    }
  }
}

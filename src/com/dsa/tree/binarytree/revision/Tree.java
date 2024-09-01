package com.dsa.tree.binarytree.revision;

import com.dsa.tree.binarytree.BinaryTree;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Tree<T> {

  public int height;
  public TreeNode<T> root;

  public Tree() {
  }

  public Tree(TreeNode root) {
    this.root = root;
  }

  public void insert(T data) {
    TreeNode<T> newnode = new TreeNode<>();
    newnode.data = data;
    if (root == null) {
      root = newnode;
      return;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
      TreeNode currentNode = queue.remove();
      if (currentNode.left == null) {
        currentNode.left = newnode;
      } else if (currentNode.right == null) {
        currentNode.right = newnode;
      } else {
        queue.add(currentNode.left);
        queue.add(currentNode.right);
      }
    }
  }

  public void preOrder() {
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      TreeNode iterator = queue.remove();
      System.out.print(iterator.data + " ");
      if (iterator.left != null) {
        queue.add(iterator.left);
      }
      if (iterator.right != null) {
        queue.add(iterator.right);
      }
    }
  }

  //Traverse the Tree using recursion. Underlying DS is Stack.
  public void rPreOrder() {
    rePreOrder(this.root);

  }

  private void rePreOrder(TreeNode root) {
    if (root != null) {
      System.out.print(root.data + " ");
      rePreOrder(root.left);
      rePreOrder(root.right);
    }
  }

  public void postOrder() {
    if (root == null) {
      return;
    }

    Stack<TreeNode> stackOne = new Stack<>();
    Stack<TreeNode> stackTwo = new Stack<>();
    stackOne.push(root);
    while (!stackOne.isEmpty()) {
      TreeNode iterator = stackOne.pop();
      stackTwo.push(iterator);
      if (iterator.left != null) {
        stackOne.push(iterator.left);
      }
      if (iterator.right != null) {
        stackOne.push(iterator.right);
      }
    }
    while (!stackTwo.isEmpty()) {
      System.out.print(stackTwo.pop().data + "  ");
    }
  }

  public void rPostOrder() {
    rPostOrder(this.root);
  }

  private void rPostOrder(TreeNode<T> root) {
    if (root != null) {
      rPostOrder(root.left);
      rPostOrder(root.right);
      System.out.print(root.data + " ");
    }
  }

  public void rInOrder() {
    rInOrder(this.root);
  }

  private void rInOrder(TreeNode<T> root) {
    if (root != null) {
      rInOrder(root.left);
      System.out.print(root.data + " ");
      rInOrder(root.right);
    }
  }
}


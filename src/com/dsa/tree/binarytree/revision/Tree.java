package com.dsa.tree.binarytree.revision;

import java.util.LinkedList;
import java.util.Queue;
import java.util.spi.AbstractResourceBundleProvider;

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

  public void inOrder() {
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
}


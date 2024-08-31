package com.dsa.tree.binarytree.revision;

public class TreeMain {

  public static void main(String[] args) {
    Tree<Integer> tree = new Tree<>();
    tree.insert(1);
    tree.insert(2);
    tree.insert(3);

    tree.inOrder();
  }


}

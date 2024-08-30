package com.dsa.tree.binarytree;

public class BTMain {

  public static void main(String[] args) {
    BinaryTree binaryTree = new BinaryTree();
    binaryTree.insert("N1");
    binaryTree.insert("N2");
    binaryTree.insert("N3");
    binaryTree.insert("N4");
    binaryTree.insert("N5");
    binaryTree.insert("N6");
    binaryTree.insert("N7");
    binaryTree.insert("N8");
    binaryTree.insert("N9");
    System.out.println("Pre Order : ");
    binaryTree.preOrder(binaryTree.root);
    System.out.println("In Order : ");
    binaryTree.inOrder(binaryTree.root);
    System.out.println("Post Order");
    binaryTree.postOrder(binaryTree.root);

    System.out.println();
    System.out.println("Delete operation : ");
    binaryTree.preOrder(binaryTree.root);
    System.out.println("\nDeepest Node : " + binaryTree.getDeepestNode().data);
    System.out.println();
    binaryTree.deleteDeepestNode();
    System.out.println("After delete");
    binaryTree.preOrder(binaryTree.root);
  }

}

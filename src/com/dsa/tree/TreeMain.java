package com.dsa.tree;

public class TreeMain {

  public static void main(String[] args) {
    TreeNode root = new TreeNode("Drinks");
    TreeNode hot = new TreeNode("Hot");
    TreeNode cold = new TreeNode("Cold");
    TreeNode tea = new TreeNode("Tea");
    TreeNode coffee = new TreeNode("Coffee");
    TreeNode beer = new TreeNode("beer");
    TreeNode wine = new TreeNode("Wine");
    root.addChild(hot);
    root.addChild(cold);
    hot.addChild(tea);
    hot.addChild(coffee);
    cold.addChild(beer);
    cold.addChild(wine);

    System.out.println(root.print(0));


  }

}

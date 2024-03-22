package com.dsa.stack;

public class Main {

  public static void main(String[] args) {
    StackList stack = new StackList();
    System.out.println(stack.isEmpty());
    stack.push(10);
    stack.push(32);
    stack.push(15);
    stack.push(25);
    System.out.println(stack.isEmpty());
    System.out.println(stack.pop());

  }

}

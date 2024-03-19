package com.dsa.stack;

public class Main {

  public static void main(String[] args) {
    Stack stack = new Stack(4);
    stack.push(10);
    stack.push(32);
    stack.push(15);
    stack.push(25);

    stack.printStack();
    System.out.println(stack.peek());

    System.out.println(stack.pop());
    stack.printStack();
  }

}

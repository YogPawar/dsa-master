package com.dsa.stack;

public class Stack {

  int top = -1;
  int[] stack;


  //Initialize the stack with initial size
  public Stack(int size) {
    stack = new int[size];
  }

  public void push(int element) {
    if (isFull()) {
      throw new StackOverflowError();
    } else {
      stack[++top] = element;
    }
  }

  public int pop() {
    if (isEmpty()) {
      System.out.println("Stack is empty");
      return -1;
    } else {
      int topElement = stack[top];
      top--;
      return topElement;
    }
  }

  public void printStack() {
    System.out.print("[ ");
    for (int i : stack) {
      System.out.print(i + " ");
    }
    System.out.print(" ]");
  }

  public boolean isEmpty() {
    return (top == -1);
  }

  public boolean isFull() {
    return (top == stack.length - 1);
  }

  public int peek() {

    return (isEmpty()) ? -1 : stack[top - 1];
  }
}

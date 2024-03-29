package com.dsa.stack.questions;

public class StackMin {

  Node min;
  Node top;

  StackMin() {
    top = null;
    min = null;
  }

  public int min() {
    return min.value;
  }

  public void push(int value) {
    if (min == null) {
      min = new Node(value, min);// value;
    } else if (min.value < value) {
      min = new Node(min.value, min);
    } else {
      min = new Node(value, min);
    }
    top = new Node(value, top);
  }

  public int pop() {
    min = min.next;
    int result = top.value;
    top = top.next;
    return result;
  }
}

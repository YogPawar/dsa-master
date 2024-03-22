package com.dsa.stack;

public class StackList {

  LinkedList linkedList;

  public StackList() {
    linkedList = new LinkedList();
  }

  public void push(int value) {
    linkedList.insert(value, 0);
    System.out.println("Pushed " + value + " into stack");
  }

  public boolean isEmpty() {
    return (linkedList.head == null);
  }

  public int pop() {
    if (isEmpty()) {
      System.out.println("Stack is empty");
      return 0;
    } else {
      int result = linkedList.head.value;
      linkedList.deleteAt(0);
      return result;
    }
  }

}

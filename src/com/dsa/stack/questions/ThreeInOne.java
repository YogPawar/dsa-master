package com.dsa.stack.questions;

public class ThreeInOne {

  private final int numberOfStack = 3;
  private final int stackCapacity;
  private final int[] values;
  private final int[] sizes;

  public ThreeInOne(int stackSize) {
    stackCapacity = stackSize;
    values = new int[stackSize * numberOfStack];
    sizes = new int[numberOfStack];
  }

  public boolean isFull(int stackNum) {
    return sizes[stackNum] == stackCapacity;
  }

  public boolean isEmpty(int stackNum) {
    return sizes[stackNum] == 0;
  }

  private int indextOfTop(int stackNum) {
    int offset = stackNum * stackCapacity;
    int size = sizes[stackNum];
    return offset + size - 1;
  }

  public void push(int stackNum, int value) {
    if (isFull(stackNum)) {
      System.out.println("Stack is Full");
    } else {
      sizes[stackNum]++;
      values[indextOfTop(stackNum)] = value;
    }
  }

  public int pop(int stackNum) {
    if (isEmpty(stackNum)) {
      System.out.println("The Stack is Empty.");
      return -1;
    } else {
      int topIndex = indextOfTop(stackNum);
      int value = values[topIndex];
      values[topIndex] = 0;
      sizes[stackNum]--;
      return value;
    }
  }

  public int peek(int stackNum) {
    if (isEmpty(stackNum)) {
      System.out.println("The stack is empty");
      return -1;
    } else {
      return values[indextOfTop(stackNum)];
    }
  }
}

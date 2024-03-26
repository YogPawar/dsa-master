package com.dsa.stack.questions;

public class ThreeInOne {

  private final int numberOfStack = 3;
  private final int stackCapacity;
  private final int[] value;
  private final int[] sizes;

  public ThreeInOne(int stackSize) {
    stackCapacity = stackSize;
    value = new int[stackSize * numberOfStack];
    sizes = new int[numberOfStack];
  }

}

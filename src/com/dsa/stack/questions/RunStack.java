package com.dsa.stack.questions;

public class RunStack {

  public static void main(String[] args) {
    StackMin stackMin = new StackMin();
    stackMin.push(5);
    System.out.println(stackMin.min());
    stackMin.push(3);
    System.out.println(stackMin.min());
    stackMin.push(10);
    System.out.println(stackMin.min());
    stackMin.pop();
    System.out.println(stackMin.min());
    stackMin.pop();
    System.out.println(stackMin.min());


  }

}

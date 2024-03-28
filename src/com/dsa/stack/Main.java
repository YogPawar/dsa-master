package com.dsa.stack;

import com.dsa.stack.questions.ThreeInOne;

public class Main {

  public static void main(String[] args) {
    ThreeInOne threeInOne = new ThreeInOne(9);
    threeInOne.push(0, 5);
    threeInOne.push(1, 6);
    threeInOne.push(2, 7);

    System.out.println(threeInOne.peek(0));
    System.out.println(threeInOne.peek(1));

  }

}

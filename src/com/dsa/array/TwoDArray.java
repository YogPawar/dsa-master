package com.dsa.array;

import java.util.Arrays;

public class TwoDArray {

  public static void main(String[] args) {
    int[][] twoDArray = new int[2][2];  //--------->O(1)
    twoDArray[0][0] = 11; //--------->O(1)
    twoDArray[0][1] = 22; //--------->O(1)
    twoDArray[1][0] = 12; //--------->O(1)
    twoDArray[1][1] = 13;//--------->O(1)    TC: O(mn)

    System.out.println(Arrays.deepToString(twoDArray));
  }

}

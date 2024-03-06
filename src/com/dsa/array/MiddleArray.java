package com.dsa.array;

import java.util.Arrays;

public class MiddleArray {

  public static void main(String[] args) {
    int[] input = {1, 2, 3, 4, 5, 6};
    System.out.println("Original Array : " + Arrays.toString(input));

    System.out.println("Middle Array : " + Arrays.toString(middleArray(input)));


  }

  /**
   * This method will return the middle of array but not the first and last
   *
   * @param input
   * @return
   */
  public static int[] middleArray(int[] input) {

    if (input.length < 2) {
      return new int[0];
    }
    int index = 1;
    int[] middleArray = new int[input.length - 2];
    while (index < input.length - 1) {
      middleArray[index - 1] = input[index];
      index++;
    }
    return middleArray;
  }
}


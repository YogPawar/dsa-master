package com.dsa.array;

import java.util.Arrays;

public class TwoSum {

  public static void main(String[] args) {
    TwoSum twoSum = new TwoSum();
    System.out.println(Arrays.toString(twoSum.sum(new int[]{2, 7, 3, 6, 9, 2}, 11)));
  }

  private int[] sum(int[] numbers, int target) {
    for (int i = 0; i < numbers.length; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        if (numbers[i] + numbers[j] == target) {
          return new int[]{i, j};
        }
      }
    }
    System.out.println("There is no combination found to achive target");
    return null;
  }
}

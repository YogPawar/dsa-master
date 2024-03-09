package com.dsa.array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

  public static void main(String[] args) {
    TwoSum twoSum = new TwoSum();
    System.out.println(Arrays.toString(twoSum.sumLogN(new int[]{2, 7, 3, 6, 9, 2}, 11)));
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

  private int[] sumLogN(int[] numbers, int target) {
    HashMap<Integer, Integer> hm = new HashMap<>();
    for (int i = 0; i < numbers.length; i++) {
      if (hm.containsKey(target - numbers[i])) {
        return new int[]{hm.get(target - numbers[i]), i};
      } else {
        hm.put(numbers[i], i);
      }
    }
    return new int[]{-1, -1};
  }
}

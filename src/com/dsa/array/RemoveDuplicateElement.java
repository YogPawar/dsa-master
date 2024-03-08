package com.dsa.array;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateElement {

  public static void main(String[] args) {
    RemoveDuplicateElement checkDuplicateElement = new RemoveDuplicateElement();
    int[] numbers = {1, 1, 2, 2, 3, 3, 4, 5};
    System.out.println(Arrays.toString(checkDuplicateElement.duplicateUsingSet(numbers)));
  }

  public int[] duplicateUsingSet(int[] numbers) {
    HashSet<Integer> checkDuplicate = new HashSet<>();
    for (int number : numbers) {
      checkDuplicate.add(number);
    }
    int[] duplicate = new int[checkDuplicate.size()];
    int i = 0;
    for (int numebr : checkDuplicate) {
      duplicate[i] = numebr;
      i++;
    }

    return duplicate;
  }

}

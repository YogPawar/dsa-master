package com.dsa.array;

import java.util.Arrays;
import java.util.HashSet;

public class PrintUniqueElementArray {

  public static void main(String[] args) {
    PrintUniqueElementArray checkDuplicateElement = new PrintUniqueElementArray();
    int[] numbers = {1, 1, 2, 2, 3, 3, 4, 5};
    System.out.println(Arrays.toString(checkDuplicateElement.duplicateUsingSet(numbers)));
    System.out.println(Arrays.toString(checkDuplicateElement.returnUnique(numbers)));

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

  public int[] returnUnique(int[] arrays) {

    //1) Create temp array to accept the unique element
    int[] unique = new int[arrays.length];
    int index = 0;
    //2) iterate the array stating from 0
    for (int i = 0; i < arrays.length; i++) {  //-----------> O(n)
      //flag to check duplicate
      boolean isDuplicate = false;
      //2nd pointer to chec duplicate element
      for (int j = i + 1; j < arrays.length; j++) { //--------------> O(n)
        if (arrays[j] == arrays[i]) {
          isDuplicate = true;
          break;
        }
      }
      if (!isDuplicate) {
        unique[index] = arrays[i];
        index++;
      }
    }
    return Arrays.copyOf(unique, index); //return the array until it is having the element
  }//TC: O(n^2)
}

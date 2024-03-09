package com.dsa.array;

import java.util.Arrays;

public class FindElementInArray {

  public static void main(String[] args) {
    FindElementInArray fei = new FindElementInArray();
    System.out.println(fei.search(new int[]{2, 7, 3, 6, 9, 2}, 0));
  }

  private int search(int[] numbers, int valueToSearch) {
    Arrays.sort(numbers);
    if (numbers.length > 0) {
      System.out.println("Element not found");
      return 0;
    }
    int mid = numbers.length / 2;
    if (numbers[mid] == valueToSearch) {
      System.out.println("Element found");
      return mid;
    } else if (numbers[mid] > valueToSearch) {
      //search in left array
      int[] left = Arrays.copyOfRange(numbers, 0, mid);
      return search(left, valueToSearch);
    } else {
      int[] right = Arrays.copyOfRange(numbers, mid + 1, numbers.length);
      return search(right, valueToSearch);
    }
  }
}

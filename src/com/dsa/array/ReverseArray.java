package com.dsa.array;

import java.util.Arrays;

public class ReverseArray {

  public static void main(String[] args) {
    ReverseArray reverseArray = new ReverseArray();
    reverseArray.reverse(new int[]{1, 2, 3, 4, 5});
  }

  /**
   * TC : O(N)
   *
   * @param array
   */
  private void reverse(int[] array) {
    for (int i = 0; i < array.length / 2; i++) { //------->O(N/2)
      int end = array.length - i - 1; //------------------>O(1)
      int temp = array[i];//------------------------------>O(1)
      array[i] = array[end];//---------------------------->O(1)
      array[end] = temp;//-------------------------------->O(1)
    }

    System.out.println(Arrays.toString(array));//---------->O(N)

  }

}

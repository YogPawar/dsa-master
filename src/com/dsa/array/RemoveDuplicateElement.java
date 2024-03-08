package com.dsa.array;

public class RemoveDuplicateElement {

  public static void main(String[] args) {
    RemoveDuplicateElement removeDuplicateElement = new RemoveDuplicateElement();

    System.out.println(
        removeDuplicateElement.removeDuplicate(new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6}));
  }

  /**
   * Array must be in sorted position
   *
   * @param ints
   * @return
   */
  private int removeDuplicate(int[] ints) {
    if (ints.length == 0) {
      return 0;
    }
    int i = 0;
    for (int j = 1; j < ints.length; j++) {
      if (ints[i] != ints[j]) {
        i++;
        ints[i] = ints[j];
      }
    }
    return i + 1;
  }

}

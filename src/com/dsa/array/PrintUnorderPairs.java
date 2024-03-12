package com.dsa.array;

public class PrintUnorderPairs {

  public static void main(String[] args) {
    PrintUnorderPairs printUnorderPairs = new PrintUnorderPairs();
    printUnorderPairs.printPairs(new int[]{1, 2, 3});
  }

  /**
   * TC :O(N^2)
   *
   * @param ints
   */
  private void printPairs(int[] ints) {
    for (int i = 0; i < ints.length; i++) {  //----------->O(N)
      for (int j = i + 1; j < ints.length; j++) { //-----------> O(n-2),O(n-3).....
        System.out.println(ints[i] + " " + ints[j]);//--------->O(1)
      }
    }
  }

}

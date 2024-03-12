package com.dsa.array;

public class PrintPairs {

  public static void main(String[] args) {
    PrintPairs printPairs = new PrintPairs();
    printPairs.printPairs(new int[]{1, 2, 3, 4, 5});
  }

  /**
   * TC : O(N^2)
   *
   * @param ints
   */
  private void printPairs(int[] ints) {
    for (int i = 0; i < ints.length; i++) { //------------>o(N)
      for (int j = 0; j < ints.length; j++) {//----------->O(N)
        System.out.println(i + " " + j);//---------------->O(1)
      }
    }
  }


}

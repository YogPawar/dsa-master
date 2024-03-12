package com.dsa.array;

public class TimeCoplexities {

  public static void main(String[] args) {
    TimeCoplexities timeCoplexities = new TimeCoplexities();
    timeCoplexities.complexity(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5});
  }

  /**
   * TC : O(ab)
   *
   * @param a
   * @param b
   */
  private void complexity(int[] a, int[] b) {
    for (int i = 0; i < a.length; i++) { //------>O(a)
      for (int j = 0; j < b.length; j++) { //------> O(b)
        if (a[i] > a[j]) {
          System.out.println(a[i]);
        }
      }
    }
  }

  /**
   * O(ab)
   *
   * @param a
   * @param b
   */
  private void complexityFixd(int[] a, int[] b) {
    for (int i = 0; i < a.length; i++) { //------>O(a)
      for (int j = 0; j < 10; j++) { //------> O(b)
        if (a[i] > a[j]) {
          System.out.println(a[i]);
        }
      }
    }

  }
}
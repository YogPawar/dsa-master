package com.dsa.bigo;

public class BigO {

  /*
   This method will run the for loop n time therefore
   time complexity will be O(n)
   */
  public static void bigO(int n) {
    for (int i = 0; i < n; i++) {
      System.out.println(i);
    }
  }

  /**
   * This method will execute the two for loop. so time complexity will be O (n+n) = O(2n) i.e O(n)
   * We can remove the constants.
   *
   * @param n
   */
  public static void bigORemoveConstant(int n) {
    for (int i = 0; i < n; i++) {
      System.out.println(i);
    }

    for (int i = 0; i < n; i++) {
      System.out.println(i);
    }
  }

  public static void main(String[] args) {

  }

  /*
   This method will perform the only one operation
   therefore time complexity will be only O(1) which is best time complexity
   */
  public int multiply(int n) {
    return n * n;
  }

  /**
   * This method having the inner loops therefore it will run the  n*n*n time
   *
   * @param n
   */
  public void bigONSequre(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        for (int k = 0; k < n; k++) {
          System.out.println(i + " " + j + " " + k);
        }
      }
    }
  }

  /**
   * Remove no n-dominant  both loop so TC will be O(n*n + n); so here O(n) is non dominant against
   * O(n2)
   */
  public void removeNonDominant(int n) {
    //TC for this for loop is O(n*n)
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.println(i + " " + j);
      }
    }
    //TC for this loop is O(n)
    for (int k = 0; k < n; k++) {
      System.out.println(k);
    }
  }
}

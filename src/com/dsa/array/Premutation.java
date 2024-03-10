package com.dsa.array;

public class Premutation {

  public static void main(String[] args) {
    Premutation premutation = new Premutation();
    boolean isPrem = premutation.isPremutation(new int[]{1, 2, 3, 4, 5}, new int[]{5, 4, 3, 2, 1});
    System.out.println(isPrem);
  }

  private boolean isPremutation(int[] ints, int[] ints1) {
    if (ints.length != ints1.length) {
      return false;
    }
    int sum1 = 0;
    int sum2 = 0;
    int mul1 = 0;
    int mul2 = 0;

    for (int i = 0; i < ints.length; i++) {
      sum1 += ints[i];
      sum2 += ints1[i];
      mul1 += ints[i];
      mul2 += ints1[i];
    }
    return (sum1 == sum2 && mul1 == mul2);
  }

}

package com.dsa.array;

import java.util.HashSet;

public class DuplicateContains {

  public static void main(String[] args) {
    DuplicateContains contains = new DuplicateContains();
    boolean isDuplicate = contains.isUnique(new int[]{1,1, 2, 3, 4, 5});
    System.out.println(isDuplicate);
  }

  private boolean isUnique(int[] ints) {
    HashSet<Integer> uniqueCheck = new HashSet<>();
    for (int ele : ints) {
      if (!uniqueCheck.add(ele)) {
        return false;
      }
    }
    return true;
  }
}

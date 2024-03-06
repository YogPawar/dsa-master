package com.dsa.array;

public class ArrayCreation {

  public static void main(String[] args) {
    int[] intArray; // declaration
    intArray = new int[5]; //creation instance
    intArray[0] = 1;
    intArray[1] = 2;
    intArray[2] = 3;
    intArray[3] = 4;
    intArray[4] = 5;

    for (int i : intArray) {
      System.out.print(i + " ");
    }

    String[] companies = {"Google", "Apple", "Facebook",
        "Twitter"}; //initialization of array at the time of declaration

    System.out.println();
    for (String s : companies) {
      System.out.print(s + " ");
    }
  }

}

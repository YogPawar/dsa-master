package com.dsa.array;

import java.util.SortedMap;

public class TwoDimensionArray {

  int[][] array;

  public TwoDimensionArray(int numberOfRows, int numberOfColumns) {
    this.array = new int[numberOfRows][numberOfColumns];
    for (int row = 0; row < array.length; row++) {
      for (int col = 0; col < array[0].length; col++) {
        array[row][col] = Integer.MIN_VALUE;
      }

    }
  }

  /**
   * Insert the element into two dimension array TC : O(1), SC : O(1)
   *
   * @param row
   * @param col
   * @param value
   */
  public void insertValueInTheArray(int row, int col, int value) {
    try {
      if (array[row][col] == Integer.MIN_VALUE) {  //----------> O(1)
        array[row][col] = value; //----------> O(1)
        System.out.println("Value inserted successfully"); //----------> O(1)
      } else {
        System.out.println("This cell is already occupied"); //----------> O(1)
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Invalid index");
    }
  } //---------->TC : O(1) SC : O(1)

  /**
   * Fetch element from the TwoD array TC : O(1) SC : O(1)
   *
   * @param row
   * @param col
   */
  public void accessCell(int row, int col) {
    System.out.println("Row : " + row + " Col : " + col); //--------> O(1)
    try {
      System.out.println("Cell value is : " + array[row][col]);  //--------> O(1)
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Index out of bound");  //--------> O(1)

    }
  }

  /**
   * Traverse the twoD array TC : O(MN) SC : O(1)
   */
  public void traverse() {
    for (int i = 0; i < array.length; i++) { //----> O(m)
      System.out.print("[ ");
      for (int j = 0; j < array[0].length; j++) {  //-------------> O(n)
        System.out.print(array[i][j] + " ");  //-------------> O(1)
      }
      System.out.print("]");  //-------------> O(1)
      System.out.println();  //-------------> O(1)
    }
  }

  /**
   * Searching single value from the TwoD array TC : O (MN) SC : O (1)
   *
   * @param value
   */
  public void searchingValue(int value) {
    try {
      for (int row = 0; row < array.length; row++) {  //-----> O(m)
        for (int col = 0; col < array[0].length; col++) { //-----> O(n)
          if (array[row][col] == value) { //-----> O(1)
            System.out.println("Value found at Row : " + row + " Col : " + col); //-----> O(1)
            return;
          }
        }
      }
      System.out.println("No element found"); //-----> O(1)

    } catch (Exception e) {
      System.out.println("Something went wrong"); //-----> O(1)
    }
  }

  /**
   * We are not deleting value but re-assigning to default value TC : O(1) SC : O(1)
   *
   * @param row
   * @param col
   */
  public void deleteValueFromArray(int row, int col) {
    try {
      System.out.println("Successfully deleted : " + array[row][col]); //-----> O(1)
      array[row][col] = Integer.MIN_VALUE; //-----> O(1)
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Invalid index"); //-----> O(1)
    }
  }

}

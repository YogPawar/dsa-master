package com.dsa.array;

import java.nio.channels.ScatteringByteChannel;

public class SingleDimensionArray {

  int[] array;

  //Creating the array and instantiating with default value.
  public SingleDimensionArray(int size) {
    array = new int[size];
    for (int i = 0; i < size; i++) {
      array[i] = Integer.MIN_VALUE;
    }
  }

  public void insert(int index, int valueToBeInsert) {
    try {
      if (array[index] == Integer.MIN_VALUE) {  //--------O(1)
        array[index] = valueToBeInsert; //--------O(1)
        System.out.println("Successfully Inserted"); //--------O(1)
      } else {
        System.out.println("This cell is already occupied"); //--------O(1)
      }
    } catch (ArrayIndexOutOfBoundsException aiobe) {
      System.out.println("Invalid index to access array"); //--------O(1)
    }
  }


  public int get(int i) {
    if (i > array.length) { //-------> O(1)
      System.out.println("Index not found"); //-------> O(1)
      return 0; //-------> O(1)
    } else {
      return array[i];  //-------> O(1)
    }
  }

  public void traverse() {
    System.out.print("Array -> ");
    for (int i : array) { //-----> O(n)
      System.out.print(i + " ");
    }
  }

  public void traversWithLoop() {
    try {
      System.out.println();
      for (int i = 0; i < array.length; i++) {  //------> O(n)
        System.out.print(array[i] + " ");
      }
    } catch (ArrayIndexOutOfBoundsException aio) {
      System.out.println("Index not found"
          + "");
    }
  }


  /**
   * Search for an element in array method will do the linear search. TC : O(n) SC : O(1)
   *
   * @param value
   */
  public void searchInArray(int value) {
    System.out.println();
    for (int i = 0; i < array.length; i++) {  //--------------> O(n)
      if (array[i] == value) { //----------------------------> O(1)
        System.out.println("Value is found at Index : " + i);//--> O(1)
        return;
      }
    }
    System.out.println("Value not found."); //--> O(1)
  }

  /**
   * We are not deleting the value from but reusing with default value therefore TC: O(1) SC: O(1)
   * also not reindexing the array
   */
  public void deleteValue(int valueAtIndex) {
    try {
      array[valueAtIndex] = Integer.MIN_VALUE; //----> O(1)
      System.out.println("The value has been deleted successfully"); //----> O(1)
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("index out of bound"); //----> O(1)
    }
  }
}


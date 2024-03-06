package com.dsa.array;

public class ArrayMain {

  public static void main(String[] args) {
    SingleDimensionArray sda = new SingleDimensionArray(5);

    sda.insert(0, 10);
    sda.insert(1, 20);
    sda.insert(2, 30);
    sda.insert(3, 40);
    sda.insert(4, 50);

    //Accessing the element from the array
    int element = sda.get(23);
    System.out.println(element);

    sda.traverse();

    sda.searchInArray(56);
  }

}

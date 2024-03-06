package com.dsa.array;

import java.util.Arrays;

public class TwoDArrayMain {

  public static void main(String[] args) {
    TwoDimensionArray tda = new TwoDimensionArray(2, 2);
    tda.insertValueInTheArray(0, 0, 10);
    tda.insertValueInTheArray(0, 1, 20);
    tda.insertValueInTheArray(1, 0, 30);
    tda.insertValueInTheArray(1, 1, 40);
    System.out.println(Arrays.deepToString(tda.array));

    tda.accessCell(0, 2);

    tda.traverse();
    tda.searchingValue(10);
    tda.deleteValueFromArray(0, 0);
    tda.traverse();
  }

}

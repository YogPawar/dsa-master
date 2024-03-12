package com.dsa.array;

public class SumAndProduct {

  public static void main(String[] args) {
    SumAndProduct sumAndProduct = new SumAndProduct();
    sumAndProduct.sumProduct(new int[]{1, 2, 3, 4, 5});
  }

  /**
   * TC:O(n)
   *
   * @param numbers
   */
  public void sumProduct(int[] numbers) {

    int sum = 0;  //----------------------------> O(1)
    int product = 1;   //-----------------------> O(1)

    for (int i = 0; i < numbers.length; i++) {//> O(N)
      sum += numbers[i];  //--------------------> O(1)
    }
    System.out.println("Sum : " + sum);  //-----> O(1)

    for (int i = 0; i < numbers.length; i++) {//-> O(N)
      product *= numbers[i];  //-----------------> O(1)
    }
    System.out.println("Numbers : " + product);//> O(1)

  }

}

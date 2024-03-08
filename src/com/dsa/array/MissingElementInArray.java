package com.dsa.array;

public class MissingElementInArray {

  public static void main(String[] args) {
    MissingElementInArray missingElementInArray = new MissingElementInArray();
    int[] numbers = {1, 2, 3, 4, 6};
    System.out.println(missingElementInArray.missingElementOne(numbers));
    System.out.println(missingElementInArray.missingElement(numbers));
  }

  /**
   * TC : O(n)
   *
   * @param numbers
   * @return
   */
  public int missingElementOne(int[] numbers) {
    for (int i = 0; i < numbers.length - 1; i++) { //-----> O(n)
      int nextElement = numbers[i] + 1;
      if (numbers[i + 1] != nextElement) {
        return nextElement;
      }
    }
    return -1;
  }

  public int missingElement(int[] numbers) {
    int n = numbers.length + 1;

    int expectedSum = (n * (n + 1)) / 2;
    int actualSum = 0;
    for (int number : numbers) {
      actualSum += number;
    }
    return expectedSum - actualSum;
  }

}

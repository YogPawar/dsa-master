package com.dsa.array;

import java.util.Arrays;

public class FirstAndSecondHighestScore {

  public static void main(String[] args) {
    FirstAndSecondHighestScore fas = new FirstAndSecondHighestScore();
    int[] scoreBoard = {84, 85, 86, 87, 85, 90, 85, 83, 23, 45, 84, 1, 2, 0};
    int[] scores = fas.firstSecondScore(scoreBoard);
    System.out.println(Arrays.toString(scores));

  }

  public int[] firstSecondScore(int[] scores) {
    int firstHighest = Integer.MIN_VALUE;
    int secondHighest = Integer.MIN_VALUE;
    for (int score : scores) {
      if (score > firstHighest) {
        secondHighest = firstHighest;
        firstHighest = score;
      } else if (score < firstHighest && score > secondHighest) {
        secondHighest = score;
      }
    }
    return new int[]{firstHighest, secondHighest};
  }

}

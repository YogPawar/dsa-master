package com.dsa.array;

import java.util.Scanner;

public class AverageTemprature {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the numbers of days");
    int days = scan.nextInt();

    int[] temps = new int[days];
    //record the temperature and find the average
    int sumOfTemp = 0;
    //Get the temperature for the day
    for (int i = 0; i < days; i++) {
      System.out.println("Enter the Day :" + (i + 1) + " temperature  ");
      int temp = scan.nextInt();
      temps[i] = temp;
      sumOfTemp += temps[i];
    }
    double average = sumOfTemp / days;

    int above = 0;
    for (int i = 0; i < temps.length; i++) {
      if (temps[i] > average) {
        above += 1;
      }
    }
    System.out.println();
    System.out.println("Average temperature : " + average);
    System.out.println("Number of " + above + " days are above temperature");
  }

}

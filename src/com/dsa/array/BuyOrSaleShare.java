package com.dsa.array;

public class BuyOrSaleShare {

  public static void main(String[] args) {
    BuyOrSaleShare buyOrSaleShare = new BuyOrSaleShare();
    int[] shares = {7, 2, 5, 8, 9, 10, 15};

    System.out.println(buyOrSaleShare.maxProfit(shares));
  }

  public int maxProfit(int[] sharePrices) {
    int maxProfit = 0;
    int left = 0;
    for (int right = 1; right < sharePrices.length; right++) {
      if (sharePrices[left] < sharePrices[right]) {
        int currentProfit = sharePrices[right] - sharePrices[left];
        maxProfit = Math.max(maxProfit, currentProfit);
      } else {
        left = right;
      }
    }
    return maxProfit;
  }

}

package com.dsa.array;

import java.util.Arrays;

public class RotedMatrix {

  public static void main(String[] args) {
    RotedMatrix rotedMatrix = new RotedMatrix();
    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    System.out.println(Arrays.deepToString(matrix));
    rotedMatrix.rotedMatrix(matrix);
    System.out.println(Arrays.deepToString(matrix));

  }

  private boolean rotedMatrix(int[][] matrix) {
    if (matrix.length == 0 || matrix.length != matrix[0].length) {
      return false;
    }
    int n = matrix.length;
    for (int layer = 0; layer < n / 2; layer++) {
      int first = layer;
      int last = n - 1 - layer;
      for (int i = first; i < last; i++) {
        int offset = i - first;
        int top = matrix[first][i];
        matrix[first][i] = matrix[last - offset][first];
        matrix[last - offset][first] = matrix[last][last - offset];
        matrix[last][last - offset] = matrix[i][last];
      }
    }
    return true;
  }

}

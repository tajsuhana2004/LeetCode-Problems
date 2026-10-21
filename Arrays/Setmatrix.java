/*
Question number 73: Set a matrix

Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.

  */

public class Setmatrix {

    class Solution {
        public void setZeroes(int[][] matrix) {
            int m = matrix.length, n = matrix[0].length;
            boolean firstRowZero = false, firstColZero = false;

            // check first row
            for (int j = 0; j < n; j++) {
                if (matrix[0][j] == 0)
                    firstRowZero = true;
            }
            // check first col
            for (int i = 0; i < m; i++) {
                if (matrix[i][0] == 0)
                    firstColZero = true;
            }

            // use first row/col as marker
            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    if (matrix[i][j] == 0) {
                        matrix[i][0] = 0;
                        matrix[0][j] = 0;
                    }
                }
            }

            // set zeroes based on marker
            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }

            // first row/col
            if (firstRowZero) {
                for (int j = 0; j < n; j++)
                    matrix[0][j] = 0;
            }
            if (firstColZero) {
                for (int i = 0; i < m; i++)
                    matrix[i][0] = 0;
            }
        }
    }

}

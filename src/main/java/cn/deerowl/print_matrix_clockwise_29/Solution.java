package cn.deerowl.print_matrix_clockwise_29;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        if (matrix==null || matrix.length==0 || matrix[0].length == 0) return result;
        int rows = matrix.length;
        int columns = matrix[0].length;
        for (int i = 0 ; i*2 < rows && i*2<columns ;++i){
            printMatrix(matrix, rows, columns, i, result);
        }
        return result;
    }

    public void printMatrix(int[][] matrix, int rows, int columns, int startIndex, ArrayList<Integer> result) {
        int endRow = rows - startIndex;
        int endColumn = columns - startIndex;

        for (int i = startIndex ; i < endColumn ; i++) {
            result.add(matrix[startIndex][i]);
        }

        if (endRow > startIndex+1) {
            for (int i = startIndex+1 ; i < endRow ; i++ ) {
                result.add(matrix[i][endColumn - 1]);
            }
        }

        if (endRow > startIndex+1 && endColumn > startIndex+1) {
            for (int i = endColumn - 2 ; i>= startIndex ; i--) {
                result.add(matrix[endRow - 1][i]);
            }
        }

        if (endRow > startIndex+2 && endColumn > startIndex+1) {
            for (int i = endRow - 2 ; i> startIndex ; i--) {
                result.add(matrix[i][startIndex]);
            }
        }

    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.printMatrix(new int[][]{
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8},
                {9, 10}
        });
    }
}
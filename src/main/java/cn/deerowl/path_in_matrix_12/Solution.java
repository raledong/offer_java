package cn.deerowl.path_in_matrix_12.README;

public class Solution {

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        if (matrix==null || matrix.length == 0) {return false;}
        int length = matrix.length;
        boolean[] hasVisited = new boolean[length];
        return hasPath(matrix, hasVisited, 0, 0, rows, cols, str, 0);
    }

    public boolean hasPath(char[] matrix, boolean[] hasVisited, int row, int col, int rows, int cols, char[] str, int index){
        if (row<0 || row>=rows || col<0 || col >= cols) return false;
        if (index == str.length) return true;
        int matrixIndex = row * cols + col;
        if (matrix[matrixIndex] != str[index]) return false;
        hasVisited[matrixIndex] = true;
        boolean hasPath = hasPath(matrix, hasVisited, row-1, col, rows, cols, str, index+1)
                || hasPath(matrix, hasVisited, row+1, col, rows, cols, str, index+1)
                || hasPath(matrix, hasVisited, row, col-1, rows, cols, str, index+1)
                || hasPath(matrix, hasVisited, row, col+1, rows, cols, str, index+1);
        hasVisited[matrixIndex] = false;
        return hasPath;
    }

}
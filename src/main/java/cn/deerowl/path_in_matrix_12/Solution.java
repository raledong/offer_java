package cn.deerowl.path_in_matrix_12;

public class Solution {

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        if (matrix==null || matrix.length == 0) {return false;}
        int length = matrix.length;
        boolean[] hasVisited = new boolean[length];
        for (int i = 0 ; i<rows ; i++){
            for (int j = 0 ; j<cols ; j++){
                if (hasPath(matrix, hasVisited, i, j, rows, cols, str, 0)) return true;
            }
        }
        return false;
    }

    public boolean hasPath(char[] matrix, boolean[] hasVisited, int row, int col, int rows, int cols, char[] str, int index){
        if (row<0 || row>=rows || col<0 || col >= cols ) return false;
        int matrixIndex = row * cols + col;
        if (hasVisited[matrixIndex] || matrix[matrixIndex] != str[index]) return false;
        if (index == str.length-1) return true;
        hasVisited[matrixIndex] = true;
        boolean hasPath = hasPath(matrix, hasVisited, row-1, col, rows, cols, str, index+1)
                || hasPath(matrix, hasVisited, row+1, col, rows, cols, str, index+1)
                || hasPath(matrix, hasVisited, row, col-1, rows, cols, str, index+1)
                || hasPath(matrix, hasVisited, row, col+1, rows, cols, str, index+1);
        hasVisited[matrixIndex] = false;
        return hasPath;
    }

}
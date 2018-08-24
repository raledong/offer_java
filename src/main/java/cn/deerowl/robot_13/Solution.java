package cn.deerowl.robot_13;

public class Solution {
    public int movingCount(int threshold, int rows, int cols) {
        if (rows <=0 || cols<=0) return 0;
        boolean[] visited = new boolean[rows * cols];
        return movingCount(threshold, 0, 0, rows, cols, visited);
    }

    public int movingCount(int threshold, int row, int col, int rows, int cols, boolean[] visited) {
        if (row <0 || row >= rows || col<0 || col>=cols || visited[row * cols + col] || !check(row, col, threshold)) return 0;
        visited[row * cols + col] = true;
        return 1 + movingCount(threshold, row+1, col, rows, cols, visited)
                + movingCount(threshold, row-1, col, rows, cols, visited)
                + movingCount(threshold, row, col-1, rows, cols, visited)
                + movingCount(threshold, row, col+1, rows, cols, visited);
    }

    public boolean check(int row, int col, int threshold) {
        int total = 0;
        while(row != 0) {
            total += row % 10;
            row /= 10;
        }

        while (col != 0) {
            total += col % 10;
            col /= 10;
        }
        return total <= threshold;
    }
}
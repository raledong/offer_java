package cn.deerowl.search_in_array_3;

public class SearchInArray {

    /**
     *
     * @param matrix
     * @param num
     * @return
     */
    public boolean search(int[][] matrix, int num){
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length;
        int columns = matrix[0].length;

        int row = 0, column = columns-1;
        while (row < rows && column >= 0) {
            if (num == matrix[row][column]){
                return true;
            }else if (num > matrix[row][column]) {
                row++;
            }else {
                column--;
            }
        }
        return false;
    }
}
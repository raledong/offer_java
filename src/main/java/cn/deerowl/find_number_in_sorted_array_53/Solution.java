package cn.deerowl.find_number_in_sorted_array_53;

public class Solution {

    public int GetNumberOfK(int[] array , int k) {
        if (array==null || array.length == 0 || k<array[0] || k > array[array.length-1]) return 0;
        int first = getFirstIndexOfK(array, k);
        int last = getLastIndexOfK(array, k);
        if (first!= -1 && last!=-1) {
            return last - first + 1;
        } else {
            return 0;
        }
    }

    public int getFirstIndexOfK(int[] array, int k) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (left + right ) / 2;
            if (array[mid] > k) {
                right = mid - 1;
            } else if (array[mid] < k) {
                left = mid + 1;
            } else if (mid == 0 || array[mid-1] != k) {
                return mid;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public int getLastIndexOfK(int[] array, int k) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (left + right ) / 2;
            if (array[mid] > k) {
                right = mid - 1;
            } else if (array[mid] < k) {
                left = mid + 1;
            } else if (mid == array.length-1 || array[mid+1] != k) {
                return mid;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.GetNumberOfK(new int[]{1,2,3,3,3,3,4,5}, 3);
    }
}

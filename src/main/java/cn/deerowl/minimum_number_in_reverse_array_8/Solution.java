package cn.deerowl.minimum_number_in_reverse_array_8;

public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if (array==null || array.length == 0) return 0;
        int left = 0;
        int right = array.length - 1;
        int mid = left;
        while (array[left] >= array[right]){
            if (right - left == 1){
                mid = right;
                break;
            }
            mid = (left + right) / 2;
            if (array[left] == array[mid] && array[mid] == array[right]){
                return findByStep(array, left, right);
            }else if (array[left] <= array[mid]){
                left = mid;
            }else if (array[mid] <= array[right]){
                right = mid;
            }
        }
        return array[mid];
    }

    public int findByStep(int[] array, int left, int right){
        while(left < right){
            if (array[left] > array[left+1]){
                return array[left+1];
            }
            left++;
        }
        return 0;
    }
}
package cn.deerowl.permutation_38;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> result = new ArrayList<>();
        if (str==null || str.length()==0) return result;
        char[] array = str.toCharArray();
        Set<String> set = new TreeSet<>();
        Permutation(array, 0, set);
        result.addAll(set);
        return result;
    }

    public void Permutation(char[] array, int curIndex, Set<String> result) {
        if (curIndex == array.length) {
            result.add(new String(array));
            return;
        } else {
            for (int i = curIndex ; i<array.length ; i++) {
                char tmp = array[curIndex];
                array[curIndex] = array[i];
                array[i] = tmp;

                Permutation(array, curIndex+1, result);

                tmp = array[curIndex];
                array[curIndex] = array[i];
                array[i] = tmp;
            }
        }
    }
}
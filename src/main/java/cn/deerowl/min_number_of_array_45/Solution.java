package cn.deerowl.min_number_of_array_45;

import java.util.ArrayList;
import java.util.Comparator;

public class Solution {

    public String PrintMinNumber(int[] numbers) {
        if (numbers==null ||numbers.length==0) return "";
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0 ; i < numbers.length ; i++) {
            result.add(numbers[i] + "");
        }

        result.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String c1 = o1+o2;
                String c2 = o2+o1;
                return c1.compareTo(c2);
            }
        });
        StringBuilder s = new StringBuilder();
        for (String tmp : result){
            s.append(tmp);
        }
        return s.toString();
    }

}


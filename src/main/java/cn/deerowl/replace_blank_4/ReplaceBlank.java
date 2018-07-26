package cn.deerowl.replace_blank_4;

public class ReplaceBlank {

    public String replace(String input){
        if (input==null || input.length()==0) return input;
        int numberOfSpace = 0;
        char[] inputArray = input.toCharArray();
        for (char c : inputArray){
            if(Character.isSpaceChar(c))numberOfSpace++;
        }
        if (numberOfSpace == 0) return input;

        char[] result = new char[input.length() + numberOfSpace*2];
        int index = result.length - 1;
        for (int i = input.length()-1 ; i>=0 ; i--){
            if (Character.isSpaceChar(inputArray[i])){
                result[index--] = '0';
                result[index--] = '2';
                result[index--] = '%';
            }else {
                result[index--] = inputArray[i];
            }
        }
        return String.valueOf(result);
    }
}
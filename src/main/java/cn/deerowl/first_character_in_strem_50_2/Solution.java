package cn.deerowl.first_character_in_strem_50_2;

public class Solution {

    int[] map;
    public Solution(){
        map = new int[256];
        for (int i = 0 ; i<256 ; i++){
            map[i] = -1;
        }
    }
    int curIndex;
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        if (map[ch] == -1) {
            map[ch] = curIndex;
        } else if (map[ch] > 0) {
            map[ch] = -2;
        }
        curIndex++;
    }

    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        int min = Integer.MAX_VALUE;
        char result = ' ';
        for (int i = 0 ; i<256; i++) {
            if (map[i] >= 0 && map[i] < min) {
                min = map[i];
                result = (char)i;
            }
        }
        return min == Integer.MAX_VALUE ? '#' : result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.Insert('g');
        s.FirstAppearingOnce();
    }
}

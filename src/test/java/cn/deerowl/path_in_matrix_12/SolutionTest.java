package cn.deerowl.path_in_matrix_12;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    private Solution solution = new Solution();
    @Test
    public void test1(){
        char[] matrix = "ABCESFCSADEE".toCharArray();
        char[] str = "SEE".toCharArray();
        Assert.assertTrue(solution.hasPath(matrix, 3, 4, str));
    }

    /**
     *  记住需要标记是否已经访问过了
     */
    @Test
    public void test2(){
        char[] matrix = "ABCESFCSADEE".toCharArray();
        char[] str = "ABCB".toCharArray();
        Assert.assertFalse(solution.hasPath(matrix, 3, 4, str));
    }

    @Test
    public void test3(){
        char[] matrix = "A".toCharArray();
        char[] str = "A".toCharArray();
        Assert.assertTrue(solution.hasPath(matrix, 1, 1, str));
    }
}
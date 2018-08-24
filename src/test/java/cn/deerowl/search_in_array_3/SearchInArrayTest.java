package cn.deerowl.search_in_array_3;

import org.junit.Assert;
import org.junit.Test;

public class SearchInArrayTest {

    SearchInArray searchInArray = new SearchInArray();

    @Test
    public void test_null(){
        boolean result = searchInArray.search(null, 0);
        Assert.assertFalse(result);
    }

    @Test
    public void test_max(){
        int[][] matrix = new int[][]{
                {1,2,3,4},
                {2,3,4,5},
                {3,4,5,6}
        };
        boolean result = searchInArray.search(matrix, 6);
        Assert.assertTrue(result);
    }

    @Test
    public void test_min(){
        int[][] matrix = new int[][]{
                {1,2,3,4},
                {2,3,4,5},
                {3,4,5,6}
        };
        boolean result = searchInArray.search(matrix, 1);
        Assert.assertTrue(result);
    }

    @Test
    public void test_lessThanMin(){
        int[][] matrix = new int[][]{
                {1,2,3,4},
                {2,3,4,5},
                {3,4,5,6}
        };
        boolean result = searchInArray.search(matrix, Integer.MIN_VALUE);
        Assert.assertFalse(result);
    }

    @Test
    public void test_moreThanMax(){
        int[][] matrix = new int[][]{
                {1,2,3,4},
                {2,3,4,5},
                {3,4,5,6}
        };
        boolean result = searchInArray.search(matrix, Integer.MAX_VALUE);
        Assert.assertFalse(result);
    }

    @Test
    public void test_hit(){
        int[][] matrix = new int[][]{
                {1,2,3,4},
                {2,3,4,5},
                {3,4,5,6}
        };
        boolean result = searchInArray.search(matrix, 4);
        Assert.assertTrue(result);
    }
}
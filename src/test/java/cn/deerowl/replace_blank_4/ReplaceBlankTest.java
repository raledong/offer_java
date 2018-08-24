package cn.deerowl.replace_blank_4;

import org.junit.Assert;
import org.junit.Test;

public class ReplaceBlankTest {
    ReplaceBlank replaceBlank = new ReplaceBlank();

    @Test
    public void test_null(){
        String result = replaceBlank.replace(null);
        Assert.assertNull(result);
    }

    @Test
    public void test_empty(){
        String result = replaceBlank.replace("");
        Assert.assertEquals("",result);
    }

    @Test
    public void test_noBlank(){
        String result = replaceBlank.replace("Thereisnoblankinthisword");
        Assert.assertEquals("Thereisnoblankinthisword", result);
    }

    @Test
    public void test_hasBlank(){
        String result = replaceBlank.replace("Hello world");
        Assert.assertEquals("Hello%20world", result);
    }

    @Test
    public void test_hasMultipleBlank(){
        String result = replaceBlank.replace("Hello   world ");
        Assert.assertEquals("Hello%20%20%20world%20", result);
    }
}
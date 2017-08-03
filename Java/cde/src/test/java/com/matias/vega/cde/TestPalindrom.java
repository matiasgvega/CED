package com.matias.vega.cde;




import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPalindrom {

    @Test
    public void testIsPalindrom() {
        Palindrom obj = new Palindrom();

        Assert.assertTrue( obj.isPalindrom("level") );

    }

    @Test
    public void testIsNotPalindrom() {
        Palindrom obj = new Palindrom();

        Assert.assertFalse( obj.isPalindrom("pedo") );

    }
}

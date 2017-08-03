package com.matias.vega.cde;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.matias.vega.cde.RandomEmailGenerator;

public class TestHelloWorld {

    @Test()
    public void testEmailGenerator() {

        RandomEmailGenerator obj = new RandomEmailGenerator();
        String email = obj.generate();

        Assert.assertNotNull(email);
        Assert.assertEquals(email, "feedback@yoursite.com");

    }

}
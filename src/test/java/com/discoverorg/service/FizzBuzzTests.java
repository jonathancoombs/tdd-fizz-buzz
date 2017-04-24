package com.discoverorg.service;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTests {

    @Test
    public void testInputOutput() {
        for (int i = 1; i <= 100; i++) {
            Integer input = i;
            String result = FizzBuzz.playFizzBuzz(input);
            Assert.assertEquals("Testing " + input, input.toString(), result);
        }
    }

}

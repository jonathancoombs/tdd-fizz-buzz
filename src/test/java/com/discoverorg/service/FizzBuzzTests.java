package com.discoverorg.service;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTests {

    @Test
    public void testInputOutput() {
        for (int i = 1; i <= 100; i++) {
            Integer input = i;
            String result = FizzBuzz.playFizzBuzz(input);
            if (!(input % 3 ==0 || input % 5 == 0)) {
                Assert.assertEquals("Testing " + input, input.toString(), result);
            }
        }
    }

    @Test
    public void testFizzBuzzOutput() {
        for (int i = 1; i <= 100; i++) {
            Integer input = i * 3 * 5;
            String result = FizzBuzz.playFizzBuzz(input);
            Assert.assertEquals("Testing " + input, "FizzBuzz", result);
        }
    }
//
//    @Test
//    public void testFizzOutput() {
//        for (int i = 1; i <= 100; i++) {
//            Integer input = i * 3;
//            String result = FizzBuzz.playFizzBuzz(input);
//            if (!(input % 5 == 0)) {
//                Assert.assertEquals("Testing " + input, "Fizz", result);
//            }
//        }
//    }
//
//    @Test
//    public void testBuzzOutput() {
//        for (int i = 1; i <= 100; i++) {
//            Integer input = i * 5;
//            String result = FizzBuzz.playFizzBuzz(input);
//            if (!(input % 3 == 0)) {
//                Assert.assertEquals("Testing " + input, "Buzz", result);
//            }
//        }
//    }

}

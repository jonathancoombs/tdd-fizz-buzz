package com.discoverorg.service;

class FizzBuzz {
//    private static int FIZZ_VALUE = 3;
//    private static int BUZZ_VALUE = 5;
//    private static String FIZZ_OUTPUT = "Fizz";
//    private static String BUZZ_OUTPUT = "Buzz";

    static String playFizzBuzz(Integer input) {
        String output = input.toString();
        if (input % 3 == 0 && input % 5 == 0) {
            output = "FizzBuzz";
        } else if (input % 3 == 0) {
            output = "Fizz";
        } else if (input % 5 == 0) {
            output = "Buzz";
        }
        return output;
//        return null;
    }
}

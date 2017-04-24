package com.discoverorg.service;

class FizzBuzz {
    static final int FIZZ_VALUE = 3;
    static final int BUZZ_VALUE = 5;
    static final String FIZZ_OUTPUT = "Fizzs";
    static final String BUZZ_OUTPUT = "Buzz";

    static String playFizzBuzz(Integer input) {
        String output = input.toString();
        if (input % FIZZ_VALUE == 0 && input % BUZZ_VALUE == 0) {
            output = FIZZ_OUTPUT+BUZZ_OUTPUT;
        } else if (input % FIZZ_VALUE == 0) {
            output = FIZZ_OUTPUT;
        } else if (input % BUZZ_VALUE == 0) {
            output = BUZZ_OUTPUT;
        }
        return output;
    }
}

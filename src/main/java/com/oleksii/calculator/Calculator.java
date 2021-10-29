package com.oleksii.calculator;

import org.springframework.stereotype.Service;

@Service
public class Calculator {

    int multiplication(final int a, final int b) {
        return a * b;
    }

    int sum(final int a, final int b) {
        int result = a + b;
        return result;
    }

}

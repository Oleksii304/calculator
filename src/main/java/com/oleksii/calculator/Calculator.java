package com.oleksii.calculator;

import org.springframework.stereotype.Service;

@Service
public class Calculator {

    int divide(final int a, final int b) {
        return a / b;
    }

    int multiplication(final int a, final int b) {
        return a * b;
    }

    int sum(final int a, final int b) {
        final int result = a + b;
        return result;
    }

}

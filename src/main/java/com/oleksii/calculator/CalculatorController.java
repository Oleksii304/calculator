package com.oleksii.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @Autowired
    private Calculator calculator;

    @RequestMapping("/sum")
    String sum(final @RequestParam("a") Integer a, final @RequestParam("b") Integer b) {
        return String.valueOf(calculator.sum(a, b));
    }
}

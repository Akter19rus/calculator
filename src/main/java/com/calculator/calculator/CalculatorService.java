package com.calculator.calculator;

import org.springframework.web.bind.annotation.RequestParam;

public interface CalculatorService {
    String welcome();

    String plus(int num1, int num2);

    String minus(int num1, int num2);

    String multiply(int num1, int num2);

    String divide(float num1, float num2);
}

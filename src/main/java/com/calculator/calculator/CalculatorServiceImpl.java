package com.calculator.calculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String welcome() {
        return "<b>Добро пожаловать в мини-калькулятор!</b>";
    }

    public String plus(int num1, int num2) {
        return num1 + "+" + num2 + "=" + (num1 + num2);
    }

    public String minus(int num1, int num2) {
        return num1 + "-" + num2 + "=" + (num1 - num2);
    }

    public String multiply(int num1, int num2) {
        return num1 + "*" + num2 + "=" + (num1 * num2);
    }

    public String divide(float num1, float num2) {
        if (num1 != 0 && num2 != 0) {
            return num1 + "/" + num2 + "=" + (num1 / num2);
            }else{
            return  "Нельзя делить на ноль!";
        }
    }
}

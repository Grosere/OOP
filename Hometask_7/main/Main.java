package main;

import log.FileLogger;
import calc.Calculator;
import calc.ComplexNumber;

public class Main {
    public static void main(String[] args) {
        FileLogger logger = new FileLogger("log.txt");

        Calculator calculator = new Calculator();
        ComplexNumber num1 = new ComplexNumber(2, 3);
        ComplexNumber num2 = new ComplexNumber(1, 2);

        ComplexNumber sum = calculator.add(num1, num2);
        ComplexNumber product = calculator.multiply(num1, num2);

        logger.log("Результат сложения: " + sum.getReal() + " + " + sum.getImaginary() + "i");
        logger.log("Результат умножения: " + product.getReal() + " + " + product.getImaginary() + "i");
    }
}

package com.github.pruhmon.calculator;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public int modulo(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot modulo by zero");
        }
        return a % b;
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public int absolute(int a) {
        return Math.abs(a);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Subtraction: " + calc.subtract(10, 5));
        System.out.println("Multiplication: " + calc.multiply(10, 5));
        System.out.println("Division: " + calc.divide(10, 5));
        System.out.println("Modulo: " + calc.modulo(10, 3));
        System.out.println("Power: " + calc.power(2, 3));
        System.out.println("Absolute: " + calc.absolute(-10));
    }
}

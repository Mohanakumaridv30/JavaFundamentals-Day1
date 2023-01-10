package com.bridgelabz.javafundamentals;

public class DemoMethod {
    public int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 15;
        DemoMethod obj = new DemoMethod();
        int result = obj.addNumbers(num1, num2);
        System.out.println("Sum is: " + result);
    }
}
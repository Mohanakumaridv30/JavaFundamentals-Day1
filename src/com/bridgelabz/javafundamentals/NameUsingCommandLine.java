package com.bridgelabz.javafundamentals;

public class NameUsingCommandLine {
    public static void main(String[] args) {
        for(String x: args) {
            System.out.println(x);
        }
    }
}
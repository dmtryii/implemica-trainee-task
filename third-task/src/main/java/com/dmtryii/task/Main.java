package com.dmtryii.task;

public class Main {
    public static void main(String[] args){
        Factorial num = new Factorial();
        System.out.println(num.sumOfDigits(num.factorial(100)));
    }
}

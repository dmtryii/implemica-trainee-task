package com.dmtryii.task;

import java.math.BigInteger;

public class Factorial {
    /**
     * Raise to factorial
     *
     * @param n      number to be raised to factorial
     * @return       factorial of number n
     */
    public BigInteger factorial(int n){
        if(n == 0) // base case
            return BigInteger.ONE;
        else
            return factorial(n-1).multiply(BigInteger.valueOf(n));
    }

    /**
     * Counting the sum of the digits of a number
     *
     * @param n      number to calculate the sum of digits
     * @return       the sum of the digits of the number n
     */
    public int sumOfDigits(BigInteger n){
        int sum = 0;
        String digits = n.toString();

        for (int i = 0; i < digits.length(); i++){
            int digit = (int) (digits.charAt(i) - '0');
            sum = sum + digit;
        }
        return sum;
    }
}

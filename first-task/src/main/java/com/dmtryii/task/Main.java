package com.dmtryii.task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Enter the number of parentheses(N): ");
        Scanner scanner = new Scanner(System.in);

        Parentheses parentheses = new Parentheses();
        System.out.println(parentheses.searchParentheses(scanner.nextInt()));
        System.out.println(parentheses.getResultSize());
    }
}

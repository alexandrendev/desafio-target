package com.alexandre;

import com.alexandre.fibonacci.Fibonacci;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println("Pertence a sequencia: " + fibonacci.fibonacci(11));
        System.out.println("Pertence a sequencia: " + fibonacci.fibonacci(13));
    }
}
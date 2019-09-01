package com.stefanini.app;

import java.util.Scanner;

import com.stefanini.entities.Fibonacci;

public class Principal {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Fibonacci fib = new Fibonacci();
		
		int n = in.nextInt();
		
		System.out.println("------------------- Fibonacci Iterativo -------------------\n");
		fib.fibonacciIterativo(n).forEach(System.out::println);
		
		System.out.println("\n\n------------------- Fibonacci Recursivo -------------------\n");
		fib.fibonacciRecursivo(n).forEach(System.out::println);
	}
}

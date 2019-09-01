package com.stefanini.entities;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	private List<Long> fib = new ArrayList<>();
	private List<Long> fibRec = new ArrayList<>();

	private Long fibonacciRec(Long n) {

		if (n < 2) {
			return n;
		}
		return fibonacciRec(n - 1) + fibonacciRec(n - 2);
	}

	//Complexidade O(n)
	public List<Long> fibonacciIterativo(int n) {

		Long tempoInicio = System.currentTimeMillis();
		fib.add(0, 0L);
		if (n == 1)
			return fib;
		fib.add(1, 1L);

		for (int i = 2; i < n; i++) {

			fib.add(i, fib.get(i - 1) + fib.get(i - 2));
		}
		System.out.println("Tempo de execução: " + (System.currentTimeMillis() - tempoInicio) + "\n");
		return fib;
	}

	// Complexidade O(2^n)
	public List<Long> fibonacciRecursivo(int n) {
		Long tempoInicio1 = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {

			fibRec.add(i, fibonacciRec(Long.valueOf(i)));

		}
		System.out.println("Tempo de execução: " + (System.currentTimeMillis() - tempoInicio1) + "\n");
		return fibRec;
	}
}

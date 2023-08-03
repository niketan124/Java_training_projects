package com.lumen.basic;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 1;
		
		int range = 10;
		int fib;
		
		System.out.print(a+" ");
		System.out.print(b+" ");
		
		for (int i = 0; i < range; i++) {
			
			fib = a+b;
			System.out.print(fib+" ");
			a = b;
			b = fib;
			
		}

	}

}

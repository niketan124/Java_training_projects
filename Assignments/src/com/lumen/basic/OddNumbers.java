package com.lumen.basic;

public class OddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range = 20;
		
		System.out.println("Printing odd numbers");
		
		for (int i = 1; i < range; i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
			
		}

	}

}

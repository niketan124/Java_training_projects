package com.lumen.basic;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 7;
		
		int count=1;
		
		for (int i = 2; i <=number; i++) {
			if(number%i==0) {
				count+=1;
			}
		}
		
		if(count==2) {
			System.out.println(" "+number+" is prime number");
		} else {
			System.out.println(" "+number+" is not prime number");
		}

	}

}

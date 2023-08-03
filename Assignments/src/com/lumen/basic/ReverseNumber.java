package com.lumen.basic;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 123;
		int temp = number;
		int res = 0;
		int temp1;
		for (int i = 0; i < 3; i++) {
			temp1 = temp%10;
			res= res*10+temp1;
			temp = temp/10;
		}
		
		System.out.println("The reverse number is: " +res);
	}

}

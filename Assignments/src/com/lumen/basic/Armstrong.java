package com.lumen.basic;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 371;
		
		String temp = String.valueOf(number);
		
		int numOfDigits = temp.length();
		
		int num = number;
		int sum = 0;
		int temp1;
		
		
		for (int i = 0; i < numOfDigits; i++) {
			temp1 = Math.floorMod(num, 10);
			sum += Math.pow(temp1, numOfDigits);
			num = Math.floorDiv(num, 10);	
		}
		
		if(number==sum) {
			System.out.println("Yes, "+ number+" it's an armstrong number");
		} else {
			System.out.println("No, "+ number+"not an armstrong");
		}

	}

}

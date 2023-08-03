package com.lumen.basic;

public class Greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userArray[] = new int[] {5,6,4,11,1,0};
		
		int greatestElement = userArray[0];
		
		for (int num : userArray) {
			if (num>greatestElement) {
				greatestElement = num;
			}
		}
		
		System.out.println("The greatest element in array is: "+greatestElement);

	}

}

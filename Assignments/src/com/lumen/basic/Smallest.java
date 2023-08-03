package com.lumen.basic;

public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		int userArray[] = new int[] {5,6,4,11,1,0};
		
		int smallestElement=userArray[0];
		
		for (int num : userArray) {
			if (num<smallestElement) {
				smallestElement = num;
			}
		}
		
		System.out.println("The smallest element in array is: "+smallestElement);

	

	}

}

package com.lumen.basic;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userArray[] = new int[] {21,22,8,10,12,3,9,0};
		
		Arrays.sort(userArray);
		
		System.out.println("The second largest number is: "+userArray[userArray.length-2]);

	}

}

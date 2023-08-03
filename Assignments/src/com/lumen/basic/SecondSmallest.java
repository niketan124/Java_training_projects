package com.lumen.basic;

import java.util.Arrays;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userArray[] = new int[] {21,22,8,10,12,3,9,0};
		
		Arrays.sort(userArray);
		int secondSmall = userArray[1];
		
		System.out.println("The second smallest element in arry is: "+secondSmall);

	}

}

package com.lumen.basic;

import java.util.Arrays;

public class SortAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []userArray = new int[] {1,32,41,2,0,122,3};
		
		Arrays.sort(userArray);
		
		for (int num : userArray) {
			System.out.print(num+" ");
		}
	}

}

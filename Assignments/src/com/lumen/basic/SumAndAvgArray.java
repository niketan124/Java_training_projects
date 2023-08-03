package com.lumen.basic;

public class SumAndAvgArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userArray[] = new int[] {21,22,8,10,12,3,9,0};
		
		int sum = 0;
		double avg = 0;
		for (int num : userArray) {
			sum+=num;
		}
		
		avg = (double)sum/userArray.length;
		
		System.out.println("The sum of elements of array is: "+sum);
		System.out.println("The avg of elements of array is: "+ avg);

	}

}

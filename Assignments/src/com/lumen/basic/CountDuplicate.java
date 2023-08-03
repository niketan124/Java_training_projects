package com.lumen.basic;

public class CountDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []userArray = new int[] {1,2,1,1,3,6,1,1,2};
		
		int key = 1;
		int dup = 0;
		
		for (int num : userArray) {
			if(num==key) {
				dup++;
			}
		}
		System.out.println("The key: "+key+" repeated "+dup);

	}

}

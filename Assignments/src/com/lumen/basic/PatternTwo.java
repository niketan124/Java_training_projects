package com.lumen.basic;

public class PatternTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range = 5;
		int temp = 0;
		
		for (int i = 1; i <range; i++) {
			for(int j=0;j<i;j++) {
				temp++;
				System.out.print(temp);
			}
			System.out.print(" ");
		}

	}

}

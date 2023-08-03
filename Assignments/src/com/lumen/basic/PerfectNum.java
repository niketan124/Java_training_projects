package com.lumen.basic;

public class PerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 6;
		int sum=0;
		
		for (int i = 1; i < num; i++) {
			if (num%i==0) {
				sum+=i;
			}
		}
		if(sum==num) {
			System.out.println("Yes "+num+" is a perfect number");
		} else {
			System.out.println("No "+num+" is not a perfect number");
		}

	}

}

package com.lumen.basic;

public class PyramidBottom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range = 5;

		for (int i = 0; i <=range; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" *");
			}
			System.out.println();
			for (int k = 0; k < range-i; k++) {
				System.out.print(" ");
			}
//			System.out.println();
		}

	}

}

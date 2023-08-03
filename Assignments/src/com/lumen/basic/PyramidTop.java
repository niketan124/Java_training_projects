package com.lumen.basic;

public class PyramidTop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range = 5;

		for (int i = 0; i < range; i++) {
			for (int j = 0; j < range-i; j++) {
				System.out.print(" *");
			}
			System.out.println();
			for (int k = 0; k < i + 1; k++) {
				System.out.print(" ");
			}
//			System.out.println();
		}

	}

}

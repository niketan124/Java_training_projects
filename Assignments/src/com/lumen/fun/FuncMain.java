package com.lumen.fun;

public class FuncMain {

	public static void main(String[] args) {
		ShapeFactory sf = new ShapeFactory();
		
		sf.printArea((x,y) -> {
			System.out.println(0.5*x*y);
		}, 10, 20);
		sf.printArea((x,y) -> {
			System.out.println(x*y);
		}, 10, 20);

	}

}
//
//
//class Triangle implements Shape {
//
//	@Override
//	public void calArea(int x, int y) {
//		// TODO Auto-generated method stub
//		System.out.println(0.5*x*y);
//	}
//	
//}
//class Rectangle implements Shape {
//	
//	@Override
//	public void calArea(int x, int y) {
//		// TODO Auto-generated method stub
//		System.out.println(x*y);
//	}
//	
//}

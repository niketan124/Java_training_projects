package com.lumen.fun;

public class ShapeFactory {
	void printArea(Shape shape, int x, int y) {
		System.out.println("Printing Area");
		shape.calArea(x, y);
		System.out.println("Done");
	}

}

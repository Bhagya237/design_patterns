package org.bhagi.design;

public class Main {

	public static void main(String[] args) {
		System.out.println("Factory Design Pattern");
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape1 = shapeFactory.getShape(ShapeType.SQUARE);
		shape1.drawSpahe();
	}

}

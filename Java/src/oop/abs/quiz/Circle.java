package oop.abs.quiz;

public class Circle extends Shape {
	
	int radius;

	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}

}

package oop.abs.quiz;

public class Circle extends Shape {
	
	double r;
	
	public Circle(String name, double r) {
		super(name);
		this.r =r;
	}
	
	@Override
	public double getArea() {
		return r*r*Math.PI;
	}
	
}

package oop.abs.quiz;

public class Rect extends Shape{

	double x;
	double y;
	
	public Rect(String name, double x, double y) {
		super(name);
		this.x = x;
		this.y = y;
	}

	@Override
	public double getArea() {
		return x*y;
	}
	
	

}

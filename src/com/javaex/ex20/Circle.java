package com.javaex.ex20;

public class Circle extends Shape implements Drawable {

	private int radius;

	
	public Circle() {
		super();
	}

	
	public Circle(String fillColor, String lineColor, int radius) {
		super(fillColor, lineColor);
		this.radius = radius;
	}

	
	
	
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	
	
	
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	
	public void draw() {
		System.out.println("[면색:"+fillColor+", 선색:"+lineColor+", 반지름:"+radius+ "] 원을 그렸습니다.");
	}
	
	public double area() {
		return radius*radius*3.14;
	}
	
	
	
	
}

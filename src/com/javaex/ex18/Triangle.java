package com.javaex.ex18;

public class Triangle extends Shape {
	
	private int baseLine;
	private int height;
	
	
	
	
	
	
	public Triangle() {
		super();
	}
	public Triangle(String fillColor, String lineColor, int baseLine, int height) {
		super(fillColor, lineColor);
		this.baseLine = baseLine;
		this.height = height;
	}
	
	
	
	
	
	
	public int getBaseLine() {
		return baseLine;
	}
	public void setBaseLine(int baseLine) {
		this.baseLine = baseLine;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Triangle [baseLine=" + baseLine + ", height=" + height + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	public void draw() {
		System.out.println("[면색:"+fillColor+", 선색:"+lineColor+", 밑변:"+baseLine+", 세로:"+height+ "] 삼각형을 그렸습니다.");
	}
	
	public double area() {
		return (baseLine*height)/2;
	}
	
}

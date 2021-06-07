package com.javaex.ex15;

public class ColorPoint extends Point {
	
	private String color;
	
	public ColorPoint() {
		super();
		System.out.println(" ColorPoint()");
	}
	
	/*
	public ColorPoint (String color) {
		this.color = color;
		System.out.println(" ColorPoint(1)");
	}
	*/
	
	public ColorPoint(int x, int y, String color) {
		
		super(x,y);
		this.color = color;
		System.out.println(" ColorPoint(3)");
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void showInfo() {
		System.out.println("x:"+x+", y:"+y+", color:"+color);
	}
}

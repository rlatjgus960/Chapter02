package com.javaex.ex19;

public class Rectangle extends Shape{

	private int width;
	private int height;
	
	
	
	
	
	public Rectangle() {
		super(); //보통 생략됨
	}


	public Rectangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor); //이렇게 하거나 super(); super.fillColor; super.lineColor; 해도 됨(단, protected인 경우. 아니면 set 붙여서)
		this.width = width;
		this.height = height;
		//System.out.println("Rectangle(4)");
	}


	
	
	
	
	
	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", getFillColor()=" + getFillColor()
				+ ", getLineColor()=" + getLineColor() + "]";
	}


	
	public void draw() {
		System.out.println("[면색:"+fillColor+", 선색:"+lineColor+", 가로:"+width+", 세로:"+height+ "] 사각형을 그렸습니다.");
	}
	
	
	
	//추상클래스를 상속받으려면 추상메소드를 구현해야 함
	public double area() {
		return width*height;
	}
	
	
	
	
	
	
}

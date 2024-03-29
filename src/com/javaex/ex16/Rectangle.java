package com.javaex.ex16;

public class Rectangle {
	
	private String fillColor;
	private String lineColor;
	private int width;
	private int height;
	

	//생성자
	public Rectangle() {
		super();
	}



	public Rectangle(String fillColor, String lineColor, int width, int height) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		this.width = width;
		this.height = height;
	}
	
	//메소드-g/s
	public String getFillColor() {
		return fillColor;
	}



	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}



	public String getLineColor() {
		return lineColor;
	}



	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
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



	//메소드-일반
	@Override
	public String toString() {
		return "Rectangle [fillColor=" + fillColor + ", lineColor=" + lineColor + ", width=" + width + ", height="
				+ height + "]";
	}
	
	
	public void draw() {
		System.out.println("[면색:"+fillColor+", 선색:"+lineColor+", 가로:"+width+", 세로:"+height+ "] 사각형을 그렸습니다.");
	}
	
	
	
	
	

}

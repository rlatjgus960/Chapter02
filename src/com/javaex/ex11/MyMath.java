package com.javaex.ex11;

public class MyMath {
	
	//필드
	private static double pi = 3.14;
	
	//생성자
	
	
	//메소드 게터세터
	
	
	//메소드 일반 //오버로딩 (에다가 static)넣은 꼴
	
	
	public static int plus(int a, int b) {
		int result = a + b; //복잡한 계산식 가정
		return result;
		
	}
	
	public static double plus (double a, double b) {
		double result = a + b;
		return result;
	}
	
	public static double plus (double a, int b) {
		double result = a + b;
		return result;
	}

	
	public static double plus (int a, double b) {
		double result = a + b;
		return result;
	}
	
	public static double circleArea(int radius) {
		double result = pi*radius*radius;
		return result;
		
		
	}
	
}

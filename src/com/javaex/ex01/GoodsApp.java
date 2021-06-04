package com.javaex.ex01;

public class GoodsApp {
	
	//필드
	//private String name; //얘는 이상태면 스태틱 할때 안들어감
	private static String name; //이렇게 해야 들어감
	
	public static void main(String[] args) { //얘가 스태틱이라
		
		Goods camera = new Goods();
		camera.name = "니콘";
		camera.price = 400000;
		System.out.println(camera.name +","+camera.price);
		
		
		Goods computer = new Goods();
		computer.name = "그램";
		computer.price = 1000000;
		System.out.println(computer.name +","+computer.price);
		
		Goods cup = new Goods();
		cup.name = "머그컵";
		cup.price = 2000;
		System.out.println(cup.name +","+cup.price);
		
		System.out.println(name);
		
		System.out.println(circleArea(10));
	}
	
	public static double circleArea(int radius) {
		double result = radius*radius*3.14;
		return result;
	}

}

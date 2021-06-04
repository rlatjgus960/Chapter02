package com.javaex.ex09;

public class GoodsApp {
	
	//static 관련 업무 --> 스태틱 예제
	// count용도로 스태틱 잘 사용하지 않는다 --> *배열 --> 리스트
	public static void main(String[] args) {

		
		
		Goods computer = new Goods("그램", 10000000);
		computer.showinfo();
		
		
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);
		camera.showinfo();
		
		
		Goods cup = new Goods("머그컵",2000);
		cup.showinfo();
		
		
		
	}

}

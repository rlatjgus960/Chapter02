package com.javaex.ex05;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods(); //생성자 호출 --> 만들지 않았는데 기본적으로 있는 디폴트 생성자를 호출한것
		
		camera.setName("니콘");
		camera.setPrice(400000);
		
		camera.showinfo();
		
		//생성자는 한번만 사용할 수 있다 ****이 말의 의미 꼭 체크해볼것
		Goods computer = new Goods("그램", 1000000);
		
		computer.showinfo();
		

	}

}

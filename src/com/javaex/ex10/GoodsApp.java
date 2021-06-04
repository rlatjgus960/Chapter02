package com.javaex.ex10;

public class GoodsApp {

	public static void main(String[] args) {
		
		//int[] intArray = new int[3]; 원랜 이렇게 숫자를 넣은 배열만 해봤었는데 아래같이 굿즈가 들어가는 배열도 할 수 있다
		
		Goods[] goodsArray = new Goods[3]; //Goods라는 주소를 가지고 있는 아파트 따라가면 Goods 있는거ㅓㅓㅓㅓ
		System.out.println(goodsArray.length);
		
		Goods computer = new Goods("그램",1000000);
		Goods camera = new Goods("니콘", 400000);
		
		
		/* 일일히 하나씩 다 입력하기는 빡세다
		computer.showinfo();
		camera.showinfo();
		cup.showinfo();
		*/
		
		goodsArray[0] = computer;
		goodsArray[1] = camera;
		
		
		System.out.println(computer.getName());
		System.out.println(goodsArray[0].getName());
		
		int count=0;
		for (int i = 0; i<goodsArray.length; i++) {
			
			if (goodsArray[i] != null) { //배열에 주소가 있으면 출력 (정상값만 출력하도록 장치)
				count++;
				goodsArray[i].showInfo();
			}
			
		}
		System.out.println(count);
	}

}

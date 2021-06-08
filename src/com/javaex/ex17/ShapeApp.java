package com.javaex.ex17;

public class ShapeApp {

	public static void main(String[] args) {

		//부모클래스 테스트
		/*
		Shape s01 = new Shape("빨강","검정");
		System.out.println(s01.toString());
		s01.draw();
		*/

		//사각형 테스트
		/*
		Rectangle r01 = new Rectangle("빨강", "검정",3,3);
		System.out.println(r01.toString());
		r01.draw();
		*/
		
		
		
		
		//사각형관리
		//배열 만들기
		//사각형만들기
		System.out.println("사각형");
		
		Rectangle[] rArray = new Rectangle[3];
		
		Rectangle r01 = new Rectangle("빨강", "검정",3,3);
		Rectangle r02 = new Rectangle("주황", "검정",4,4);
		Rectangle r03 = new Rectangle("초록", "검정",3,3);
		
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03; //넣는거는 노가다 해야됨
		
		for(int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		
		
		
		
		//원 관리
		System.out.println("원");
		
		
		Circle[] cArray = new Circle[3];
		
		Circle c01 = new Circle("빨강", "검정",3);
		Circle c02 = new Circle("노랑", "검정",4);
		Circle c03 = new Circle("파랑", "검정",5);
		
		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;
		
		
		for (int i=0; i<cArray.length; i++) {
			cArray[i].draw();
		}
		

		//삼각형 관리
		System.out.println("삼각형");
		
		Triangle[] tArray = new Triangle[3];
		
		Triangle t01 = new Triangle("초록", "검정",3,3);
		Triangle t02 = new Triangle("보라", "검정",4,4);
		Triangle t03 = new Triangle("빨강", "검정",5,5);
		
		tArray[0] = t01;
		tArray[1] = t02;
		tArray[2] = t03;
		
		
		for (int i=0; i<tArray.length; i++) {
			tArray[i].draw();
		}
		
		
		//삼각형 테스트
		
	}

}

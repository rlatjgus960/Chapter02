package com.javaex.ex18;

public class ShapeApp {

	public static void main(String[] args) {

		
		//배열을 만든다.
		Shape[] sArray = new Shape[3];
		
		//도형을 만든다
		Shape sr01 = new Rectangle("빨강", "검정", 10, 10);
		Shape sc01 = new Circle("주황", "검정",5);
		Shape st01 = new Triangle("노랑", "검정",30,30);
		
		//Shape ss01 = new Shape("빨강", "빨강");
		//System.out.println(ss01.getWidth());
		
		
		//배열<--도형
		sArray[0] = sr01;
		sArray[1] = sc01;
		sArray[2] = st01;
		
		
		//배열을 이용해서 그리기
		for (int i = 0; i<sArray.length; i++) {
			sArray[i].draw();
			//sArray[i].area(); -> 자식에만 있어서 못사용함, 강제형변환 필요, 일괄적으로 하는데에도 문제가 있음, 오버라이딩 되라고 부모에 area()를 올려주는 방법
			
			//오버라이딩을 이용해서 구현할 수 있다.
			System.out.println("넓이:"+sArray[i].area());
		}
		
		//오버라이딩 부작용
		Shape ss01 = new Shape("검정", "검정");
		System.out.println("Shape 넓이:"+ss01.area()); //-->필요없는문법.. 안나와야되는거. 오버라이딩하느라 생긴 부작용
		
		
		
		//캐스팅
		//Rectangle sr01 = new Rectangle("빨강","검정",10,10);
		System.out.println(((Rectangle)sr01).getWidth());
		
		
		
		//////////////////////////////
		/* 
		//도형(Shape) 배열 만든다
		Shape[] sArray = new Shape[3];
		
		//도형 만든다
		Rectangle r01 = new Rectangle("빨강", "검정", 10,10);
		Circle c01 = new Circle("주황", "검정", 30);
		Triangle t01 = new Triangle("노랑", "검정", 5,5);
		
		//배열 <-- 사각형
		Shape[0] = r01;
		
		//배열 <-- 원
		//배열 <-- 삼각형
		*/
		 
		
	}

}

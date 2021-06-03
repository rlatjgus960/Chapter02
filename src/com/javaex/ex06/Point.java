package com.javaex.ex06;

public class Point {
	
	//필드
	private int x;
	private int y;
	
	//생성자
	public Point() {
		//Point를 힙에 올리는 일
	}
	
	public Point(int x, int y) {
		//Point를 힙에 올리는 일
		this.x = x;
		this.y = y;
	}
	
	public Point(int x) {  
		//Point를 힙에 올리는 일
		this.x = x;
	}
	//파라미터의 자료형이 같아서 아래랑 같은거로 인식됨 (x,y 다른건 상관없음)
	//자료형 두가지 이상일때 순서 다르면 다른 생성자
	
	/* 같은 생성자가 있다.
	public Point(int y) {
		//Point를 힙에 올리는 일
		this.y = y;
	}
	*/
	
	//메소드-게터세터
	
		public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	
	
	//메소드-일반
	
	public void draw() {
		
		System.out.println("점[x="+x+", y="+y+"]을 그렸습니다.");
		
	}
	
	public void draw(boolean flag) {
		
		if (flag==true) {
			System.out.println("점[x="+x+", y="+y+"]을 그렸습니다.");
		}else {
			System.out.println("점[x="+x+", y="+y+"]을 지웠습니다.");
		}
		
		
		
	}
	
}

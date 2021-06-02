package com.javaex.ex02;

public class Goods {

	//필드
	private String name;
	private int price;
	
	//생성자
	
	//메소드-겟터셋터
	public void setName(String name) { //이름 받을거라 스트링
		this.name = name;
		//리턴이 없는 형태
	}
	
	public void setPrice (int price) {
		if(price<0){
			this.price = 0;
		}else {
			this.price = price;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		if(price<0) {
			return 0;
		}else {
			return price;
		}
		
	}
	
	//메소드-일반 
	
	
	public void showinfo() {
		System.out.println("상품이름 : "+name);
		System.out.println("가격 : "+price);
		System.out.println("");
		
	}
}

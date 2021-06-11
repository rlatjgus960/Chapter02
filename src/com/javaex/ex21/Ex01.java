package com.javaex.ex21;

public class Ex01 {

	public static void main(String[] args) {
		// NullPointerException

		Rectangle r01 = new Rectangle("빨강", "검정", 5, 5);

		r01 = null;

		try {

			r01.draw();

		} catch (Exception e) {

			r01 = new Rectangle("검정", "검정", 5, 5);
			r01.draw();
			System.out.println(e.getMessage()); // 프로그램이 정해놓은 메세지 출력

		}

	}

}

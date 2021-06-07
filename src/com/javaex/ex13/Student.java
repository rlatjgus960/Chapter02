package com.javaex.ex13;

public class Student extends Person {  //extends @@ = @@을 부모로 두겠다

	
	//필드
	private String schoolName;
	
	
	
	
	//생성자
	public Student () {
		
	}
	
	public Student(String schoolName) {
		this.schoolName = schoolName;
		
	}

	
	
	
	//메소드-g/s

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	
	//데이터확인
	@Override
	public String toString() {
		return "Student [schoolName= " + schoolName +  "]";
	}
	
	
	public void showInfo() {
		System.out.println("------------------------------");
		System.out.println("이름:" + getName());
		System.out.println("나이:" + getAge());
		System.out.println("학교:" +schoolName);
		System.out.println("------------------------------");
		
	}
	
	
}

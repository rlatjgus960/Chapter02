package com.javaex.ex14;

public class Student extends Person { 

	
	//필드
	private String schoolName;
	
	
	
	
	//생성자
	public Student () {
		super(); //부모 생성자 호출하는.. 생략가능
		System.out.println("Student()");
	}
	
	//부모의 Person(2) 생성자 사용
	/*
	public Student(String name, int age, String schoolName) {
		
		//this.setName(name);
		//this.setAge(age);
		
		
		super(name, age);
		this.schoolName = schoolName;
		System.out.println("Student(3)"); 
		
	}
	*/


	//부모의 Person() 생성자 사용
	public Student(String name, int age, String schoolName) {
		super();
		super.setName(name); //본인한테 있었으면 this. 지금은 부모쪽에 있으니까 super.
		super.setAge(age);
		this.schoolName = schoolName;
		
		System.out.println("Student(3)");
		
	}

	
	
	
	//메소드-g/s
	
	public void setAge(int age) {  //일부러 같은 이름을 넣어서 자식클래스쪽 메소드가 사용되게 함(부모쪽의 메소드를 사용하지 않을 때)
		if(age<0) {
			super.age=0;
		}
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	
	//메소드-일반
	//데이터확인
	@Override
	public String toString() {
		return "Student [schoolName= " + schoolName +  "]";
	}
	
	
	public void showInfo() {
		System.out.println("------------------------------");
		System.out.println("이름:" + name); //super.name --> super. 생략
		System.out.println("나이:" + age);
		System.out.println("학교:" +schoolName);
		System.out.println("------------------------------");
		
	}
	
	
}

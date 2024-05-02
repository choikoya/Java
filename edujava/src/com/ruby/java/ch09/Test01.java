package com.ruby.java.ch09;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new Object();
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		
		Class c = obj1.getClass();
		
		System.out.println(c.getName());
		
	
//		
//		MyObject obj4 = new MyObject();
//		System.out.println(obj4);
		
		MyObject obj4 = new MyObject(123); //MyObject 클래스의 인스턴스 생성>참조변수 obj4에 주소값 저장
		MyObject obj5 = new MyObject(123);
		
		if(obj4.equals(obj5)) { //obj4.equals()메서드 실행
			System.out.println("동일 객체");
			
		}else {
			System.out.println("다른 객체");
		}
		
		//해시코드 비교
		if(obj4 == obj5) {
			System.out.println("동일 객체");
		}
		else {
			System.out.println("다른 객체");
		}
	}
	
	

}

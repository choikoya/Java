package com.ruby.java.ch08.polymorphism;

//열거형 데이터 타입

enum Status{
	READY, SEND, COMPLETE, CLOSE //여기 있는 값이 변수명 자체라고 보면됨
}

public class EnumTest01 {
	public static void main(String[] args) {
		Status work = null; //참조변수인경우 초기값을 null로 설정
		
		int n=2;
		
		switch (n) {
		case 1:
			work = Status.READY;
			break;
		case 2:
			work = Status.SEND; 
			break;
		case 3:
			work = Status.COMPLETE;
			break;
		case 4:
			work = Status.CLOSE;
			break;
			
		}
		System.out.println("현재 작업 상태 : " + work);
	}

}

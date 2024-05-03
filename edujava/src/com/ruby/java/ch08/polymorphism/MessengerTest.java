//8.2.3익명클래스 376p

package com.ruby.java.ch08.polymorphism;

public class MessengerTest {
	public static void main(String[] args) {
		
		//Messenger(new Messenger()형태로 구현 불가 바디 붙여야 함
		Messenger test = new Messenger() { //클래스부모 = new 익명클래스가 상속받는 객체. 클래스 선언과 동시에 힙에 인스턴스 생성 후 test변수에 인스턴스 주소값 저장
			
			
			public void setMessage(String msg) {
				System.out.println("test에서 메시지를 설정합니다:" +msg);
			}
			
			public String getMessage() {
				return "test";
			}
		};
		
		System.out.println(test.getMessage());
		test.setMessage("have a nice day!");
	}

}

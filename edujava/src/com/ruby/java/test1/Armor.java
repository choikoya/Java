package com.ruby.java.test1;

public class Armor { //src에서 클래스생성. 패키지에 com.ruby.java.test1지정. 클래스명은 Armor. main메서드 사용안할거라서 체크없이 파일생성
	
	public String name = "john"; //필드선언 //값을 초기화
	int height = 185;
	int weight = 100;
	String color = "RED";
	boolean isFly = false; //true면 "날 수 있습니다" 출력됨
	//클래스,필드,메서드 앞에 private를 붙이면 내부에서만 볼 수 있고 외부에서 armor.isFly 로 접근못함
	
	boolean takeOff() {
		System.out.println("takeOff 메서드 호출");
		
		return isFly; // isFly대신 name을 넣으면 에러뜸. 데이터타입이 달라서
	}
	
	void setData(String n, int h, int w, String c) {
		name =n; //파라미터(매개변수-string, int...)를 한번에 4개 보냄
		height = h;
		weight =w;
		color = c;
	}
	
	void setName(String str) { //str타입의 매개변수를 설정
		name = str;
	}
	
	void setHeight(int h) {
		height = h;
	}
	
	
	/*
	 * void takeOff() { //메서드 선언 //void는 return값 없음
	 * System.out.println("takeOff 메서드 호출"); //main이 없어서 혼자 프로그램 실행되지 않음. //다른
	 * class(Test.java)에서 메서드를 호출시켜 값 출력하기
	 * 
	 * //return; //하면 중단하고 이 코드를 호출한 곳으로 돌아감. return; 아래쪽은 실행안되는 코드라 빨간줄 뜸. return은
	 * 마지막에 넣음
	 * 
	 * if (isFly) System.out.println("날 수 있습니다"); else
	 * System.out.println("날 수 없습니다");
	 * 
	 * 
	 * 
	 * } //중괄호 연 코드의 시작과 닫는 중괄호의 위치 맞추기. 중괄호 안의 내용은 들여쓰기 void land() {
	 * System.out.println("land 메서드 호출"); } void shootLaser() {
	 * System.out.println("shootLaser 메서드 호출"); } void launchMissile() {
	 * System.out.println("launchMissile 메서드 호출"); }
	 * 
	 */
}

//자주색:키워드

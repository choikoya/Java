package com.ruby.java.ch08.polymorphism;

//클래스 Enum 생성자, 메서드, 변수 385p

enum Mandarin{
	금귤(600), 한라봉(500), 레드향(300), 천혜향(400), 황금향(800);
	private int price;
	Mandarin(int p) {
		price = p;
	}
	int getPrice() {
		return price;
	}
}

public class EnumTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mandarin ma = Mandarin.한라봉; //Mandarin 타입의 ma변수에 Mandarin.한라봉을 저장
		if (ma == Mandarin.한라봉) 
			System.out.println("ma는 한라봉입니다.");
		System.out.println(ma + "가격 : " +ma.getPrice());
		Mandarin list[] = Mandarin.values();
		System.out.println("== 귤의 종류 ==");
		for (Mandarin m : list)
			System.out.println(m + ":" + m.getPrice());

	}

}

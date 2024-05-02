package com.ruby.java.ch05;

public class Test02 {
	
	static void test(String name, int...v) { //int...v는 배열이라고 보면 됨
		System.out.println(name + ":");
		for(int x : v) // v의 배열을 순차적으로 x에 넣어줌 . 확장 for문 152p
			System.out.print(x+" ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		test("오정임", 98, 85, 88);
		test("김푸름", 90, 95, 92);
		test("김하늘", 80, 98, 95);
	}

}

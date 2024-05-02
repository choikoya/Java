package com.ruby.java.ch07.abstraction;


/*
* 7장 실습 코드로 구현한다 
*/

interface Shape {
	public double perimeter();
	public float area();
}

class Triangle implements Shape { //삼각형
	private int x1, y1, x2,y2,x3,y3;
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3){ //생성자 파라미터 만들기
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
			
	}
	
	@Override
	public double perimeter() { //둘레 구글링으로 계산식 찾아서 구현
		double sum = 0;
		return sum;
	}
	
	@Override
	public float area() {
		System.out.println();
		return 0.0f;
	}
	@Override
	public String toString() {
		return "triangle";
	}
}
class Rectangle implements Shape {
	int x1,y1,x2,y2,x3,y3,x4,y4;
	public Rectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
		this.x4 = x4;
		this.y4 = y4;
		
		
	}
	@Override
	public double perimeter() { //구글링으로 계산식 찾아서 구현
		double sum = 0;
		return sum;
	}
	
	@Override
	public float area() {
		System.out.println();
		return 0.0f;
	}
}


class Square extends Rectangle {
	int side;
	public Square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int side) {
		//super()를 사용 7장
		super(x1, y1, x2, y2, x3, y3, x4, y4); //상위클래스의 생성자를 만들고.순서중요 super가 먼저 나와야함
		this.side = side;//내 것을 만듦
		
	}
	@Override //컴파일러에게 알려주는 코드주석문
	public float area() {
		System.out.println();
		return side*side;
	}
}
public class Ch07_interface_실습 {
	public static void main(String[] args) {

	Shape t = new Triangle(1,2,3,4,5,6); //위에랑 갯수맞춰줘야함. 갯수만큼 값을 입력, 3개의 꼭지점 >값이 클래스 객체에 저장이 됨
	Shape r = new Rectangle(1,2,3,2,1,5,3,5);
	Shape s = new Square(1,2,3,2,1,5,3,5,3); //마지막 변의길이

	System.out.println("삼각형 둘레 길이 = " + t.perimeter() + " ");
	System.out.println("삼각형 면적 = " + t.area());
	System.out.println("사각형 둘레 길이 = " + r.perimeter());
	System.out.println("사각형 면적 = " + r.area());
	
}
}


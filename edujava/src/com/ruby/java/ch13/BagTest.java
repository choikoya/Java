

package com.ruby.java.ch13;

class Bag<T> { //템플릿. class를 찍어내는 틀
	private T thing;

	public Bag(T thing) { //String thing으로 표현하던걸 타입을 매개변수로 T에 100을 만든다면 thing은 데이터멤버
		this.thing = thing;
	}

	public T getThing() {
		return thing;
	}

	public void setThing(T thing) {
		this.thing = thing;
	}

	void showType() {
		System.out.println("T의 타입은 " + thing.getClass().getName());
	}
}

class Book {
}

class PencilCase {
}

class Notebook {
}

public class BagTest {

	public static void main(String[] args) {
		Bag<Book> bag = new Bag<>(new Book()); //615p 클래스를 찍어냄
		Bag<PencilCase> bag2 = new Bag<>(new PencilCase());
		Bag<Notebook> bag3 = new Bag<>(new Notebook());

		bag.showType();
		bag2.showType();
		bag3.showType();
		
//		bag = bag2; //다른클래스의 객체라서 안됨
//		bag2 = bag3;
	}
}
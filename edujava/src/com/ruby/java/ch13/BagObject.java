
package com.ruby.java.ch13;
//generic 대신에 Object class 사용한 방법으로 생략
class Bag {
	private Object thing; 
	public Bag(Object thing) {
		this.thing = thing;
	}
	public Object getThing() {
		return thing;
	}
	public void setThing(Object thing) {
		this.thing = thing;
	}
	void showType() {
		System.out.println("T의 타입은 " + thing.getClass().getName());
	}
}
class Book2 {
}
class PencilCase2 {
}
class Notebook2 {
}

public class BagObject  {
	public static void main(String[] args) {
		Bag bag = new Bag(new Book2());
		Bag Bag2 = new Bag(new PencilCase2());
		Bag bag3 = new Bag(new Notebook2());

		bag.showType();
		Bag2.showType();
		bag3.showType();

		bag = Bag2;//제네릭 안쓸경우 error 뜨지 않지만 잘못된 코드이다
		/*
		Book book = bag.getThing();
		PencilCase pc = Bag.getThing();
		Notebook nb = bag3.getThing();
		*/
		//Book book = bag.getThing();//getThing의 리턴타입은 Object(Book은 Object에 속하나 반대는 안됨)
		Book2 book = (Book2)bag.getThing();//실제론 Book이므로 down casting 
		PencilCase2 pc = (PencilCase2)Bag2.getThing();
		Notebook2 nb = (Notebook2)bag3.getThing();
	}
}
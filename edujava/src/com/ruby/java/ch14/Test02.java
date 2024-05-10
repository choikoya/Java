package com.ruby.java.ch14;

@FunctionalInterface

interface Multiply { //이 인터페이스는 functional interface
	double getValue();
	void setValue();
}
public class Test02 {

			public static void main(String[] args) {

				Multiply m;
				m = () -> 3.14 * 2;
				System.out.println(m.getValue());

				m = () -> 10 * 3;
				System.out.println(m.getValue());
			}
		
	}



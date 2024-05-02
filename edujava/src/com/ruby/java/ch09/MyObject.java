package com.ruby.java.ch09;

public class MyObject {
	
	int num;
	MyObject(int num){
		this.num = num;
	}
	
	@Override //ctrl + space
	public String toString() {
		return "MyMy";
	}
	//탭 당기기 shift + tab
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		MyObject arg =(MyObject) obj;
		
		if(this.num == arg.num) {
			result = true;
		}
		
		return result;
	}
}

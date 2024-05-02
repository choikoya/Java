package com.ruby.java.ch09;

import java.nio.file.spi.FileSystemProvider;

//408p

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = new String("java");// String 인스턴스 생성> 참조변수에 주소값 저장해 참조
		String s2 = "java";
		
		String s3 = new String("java");
		String s4 = "java";
		
		if(s1 == s3) {
			System.out.println("동일객체");
		} else {
			System.out.println("다른객체");
		}
		
		if(s2 == s4) {
			System.out.println("동일객체");
		} else {
			System.out.println("다른객체");
		}
		
		
		if(s1.equals(s3)) {
			System.out.println("동일 문자열");
			
		}else {
			System.out.println("다른 문자열");
		}
		
		if(s2.equals(s4)) {
			System.out.println("동일 문자열");
			
		}else {
			System.out.println("다른 문자열");
		}
		String s5 = "JAVA";
		
		if(s1.equals(s5)) {
			System.out.println("동일 문자열");
			
		}else {
			System.out.println("다른 문자열");
		
		}
		
	}

}

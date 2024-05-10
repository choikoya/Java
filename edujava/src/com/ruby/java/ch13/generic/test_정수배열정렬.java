package com.ruby.java.ch13.generic;
/*
 * 정수 배열을 정렬후 출력
 * 실수 배열을 정렬후 출력
 * 스트링 배열을 정렬후 출력하는 코드 완성 
 */
import java.util.Arrays;
import java.util.Random;

public class test_정수배열정렬 {
	static void showData(Object[]data) {
		for(int i=0; i<data.length; i++) {
			System.out.println(data [i]);
		}
		
	}
public static void main(String[] args) {
	int [] data = new int[20];
	double [] doubleData = new double[20];
	String [] stringData = {"apple","grape","blueberry","banana"};
	
	Random rnd = new Random(); //난수생성
	for (int i = 0; i < data.length; i++) {
		data[i] = rnd.nextInt(100);
		doubleData[i] = rnd.nextDouble(100.0);
		
	}
		
	Arrays.sort(data);
	Integer[]idata = new Integer[20]; 
	for(int i=0; i<idata.length; i++) {
		idata[i] = data[i]; //정수를 객체박스로 만듦
	}
	showData(idata); //객체박스로 만든 정수를 출력
	
	Arrays.sort(doubleData); //실수도 똑같이 정렬
	double[]
	
	
	showData(doubleData);
	
	Arrays.sort(stringData);
	showData(stringData);
	//출력 
}
}

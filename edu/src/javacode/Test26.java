package javacode;

import java.util.Scanner;

public class Test26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("반복값:");
		
		int n = sc.nextInt(); //스캔받은값은 10대신 들어가는 값
		
		int i = 0;
//		while(i < 10) {
		while(i < n) {
			System.out.println(i);
			i++;
		}
		System.out.println("OK");

	}

}

package javacode;

import java.util.Scanner;

public class Test22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a = 12;
//		int b = 2;
//		char op = '+';
		
		//표준입력장치로부터 입력을 받기 위한 입력 객체를 생성한다
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 점수:"); //정수형 값을 입력받기 위한 메시지를 화면에 출력
		int a = sc.nextInt(); //정수형 값을 입력받아서 변수 a에 저장
		
		System.out.print("두번째 점수:");
		int b = sc.nextInt();
		
		System.out.println("op:"); //문자열 값을 입력받기 위한 메시지를 화면에 출력
		String ops = sc.next(); //문자열 입력받아서 문자열 변수 ops에 저장
		char op = ops.charAt(0); //ops에 저장된 첫번째 문자를 문자변수 op에 저장
		
//		System.out.print("op:");
//		char op = (char) sc.nextByte();
		
		switch(op) { //입력된 문자변수 op에 저장된 값으로 코드를 실행
		case '+':
			System.out.println(a + b); break;
			//break; 안넣으면 모든 case 조건문 결과가 다 나옴
		case '-':
			System.out.println(a - b); break;
		case '*':
			System.out.println(a * b); break;
		case '/':
			System.out.println(a / b); break;
		}

	}

}

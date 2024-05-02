package javacode;

import java.util.Scanner;

public class Test20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//scanner(입력장치)선언. 빨간줄떠있으면 import 해줘야함 ctrl + shift + O
		Scanner sc = new Scanner(System.in);
		
	//	int score = 90;
		System.out.print("점수를 입력하세요 ");
		//println으로 되어있으면 줄바꿔서 밑에 뜸 ln없으면 옆에뜸
		int score = sc.nextInt();
		
		char grade;
		
		if(score >= 90) {
			grade = 'A';
		} else if(score >=80) {
			grade = 'B';
		} else if(score >=70) {
			grade = 'C';
		} else if(score >=60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
			
		System.out.println("당신의 등급은 " + grade +" 입니다");
		

	}

}

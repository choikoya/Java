package Chap5;
/*
 * 실습 5-1 : 팩토리얼 값을 재귀적으로 구함 - 직접 입력하여 실습
 * recursive relation을 이해
 */

import java.util.Scanner;

class 실습5_1Factorial {
 //--- 음이 아닌 정수 n의 팩토리얼 값을 반환 ---//
 static int factorial(int n) { // 메서드는 정수 n을 매개변수로 받아, n의 팩토리얼 값을 반환합
     if (n > 0) {
    	 System.out.println("return " + n + " * factorial(" + n + " - 1);"); //디버깅을 위해 현재 실행되는 재귀 호출을 출력
         return n * factorial(n - 1);
     }
     else {
    	 System.out.println("return 1");// 디버깅을 위해 반환되는 값을 출력
         return 1;//n이 0이면 1을 반환
     }
 }

 public static void main(String[] args) {
     Scanner stdIn = new Scanner(System.in);

     System.out.print("정수를 입력하세요 : ");
     int x = stdIn.nextInt();

     System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");
 }
}
package Chap5;
/*
 * //실습 5-5  재귀 알고리즘
 * 재귀에 대한 이해를 돕는 순수 재귀 메서드 - 직접 입력하여 학습
 * stack frame을 이해하는 것이 필요 :구글링 - "스택 프레임(stack frame)", TCP School 참조 
 */

import java.util.Scanner;

class 실습5_3Recur {
 //--- 순수 재귀 메서드 ---//
 static void recur(int n) {//이 메서드는 정수 n을 매개변수로 받아, n이 0보다 클 때까지 재귀 호출을 수행
     if (n > 0) { //종료조건. n이 0보다 작거나 같은 경우에는 더 이상 재귀 호출을 진행하지 않고 종료
    	 System.out.println("recur(" + n + " - 1) 호출됨");//재귀 호출을 시작하기 전에 recur(n - 1)이 호출될 것임을 출력
         recur(n - 1); 
         System.out.println("n = " + n);
         if(n>1) {//재귀 호출 조건. n이 1보다 큰 경우에만 다음 재귀 호출이 발생하도록 합
	         System.out.println("recur(" + n + " - 2) 호출됨");
	         recur(n - 2); //꼬리재귀->제거 자기를 2번 부름. recur 메서드를 n - 2를 인수로 하여 재귀 호출. 핵심
         }
     }
 }

 public static void main(String[] args) {
     Scanner stdIn = new Scanner(System.in);
     // 처음에는 n = 2,3에 대하여 실행한다 다음에 5에 대하여 
     System.out.print("정수를 입력하세요 : ");
     int x = stdIn.nextInt();

     recur(x);//입력받은 정수 x를 인수로 하여 recur 메서드를 호출
 }
}

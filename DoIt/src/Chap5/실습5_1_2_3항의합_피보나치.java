package Chap5;

/* 피보나치 수열은 첫 두 항인 fibonacci(0)과 fibonacci(1)은 1로 정의되며, 그 이후의 항은 바로 앞 두 항의 합으로 정의됨
 * 실습 5-3: 피보나치 수열을 간결한 코딩으로 해결
 * 삼항 조건 연산자를 사용한 대표적 사례로서 기억해야 함
 * f(n) = f(n-1) + f(n-2)
 * f(n) = f(n-1) + f(n-2) + f(n-2)를 구현하는 실습: 현재 코드를 수정하여 완료 
 */


import java.util.Scanner;

public class 실습5_1_2_3항의합_피보나치 {

 //--- 음이 아닌 정수 n의 팩토리얼 값을 반환 ---//
 static int fibonacci(int n) {
	 //recursive 함수를 간결한 코딩으로 해결 - 학습 요점이다 
    
	 //return (n >2) ? fibonacci(n - 1) + fibonacci(n - 2)+fibonacci(n-3) : 1; //이렇게하면 n이 0,1일때의 값을 제대로 처리하지 못함 
	 //n이 0일 때는 0을, 1과 2일 때는 1을 반환하도록 수정해야 함
	 //tribonacci(4)는 tribonacci(3) + tribonacci(2) + tribonacci(1) = 2 + 1 + 1 = 4를 반환
	 return(n == 0) ? 0 : (n == 1 || n == 2) ? 1 : fibonacci(n - 1) + fibonacci(n - 2) + fibonacci(n - 3);
 }

 public static void main(String[] args) {
     Scanner stdIn = new Scanner(System.in);

     System.out.print("정수를 입력하세요 : ");
     int x = stdIn.nextInt();

     System.out.println(x + "의 피보나치 수열은 " + fibonacci(x) + "입니다.");
 }
}

package Chap5;
/*
 * 실습 5-4: 유클리드 호제법으로 최대공약수를 구함
 * 위키백과: 유클리드 호제법 학습
 * 유클리드 호제법은 MOD연산(두 값을 나눈 나머지를 구하는 연산)을 반복하면 된다
 * 두 수 a와 b가 있을 때, a를 b로 나눈 나머지를 r라고 합시다. 즉, r = a % b.
이제, gcd(a, b)는 gcd(b, r)와 같습니다.
이 과정을 나머지가 0이 될 때까지 반복합니다.
나머지가 0이 되는 순간의 b가 바로 두 수의 최대공약수입니다.
 */

import java.util.Scanner;

class 실습5_2EuclidGCD {
 //--- 정수 x, y의 최대공약수를 구하여 반환 ---//
 static int gcd(int x, int y) { //이 메서드는 두 정수 x와 y를 매개변수로 받아, 그들의 최대공약수를 반환합
	 System.out.println("x = " + x + ", y = " + y);//현재 값 x와 y를 출력하여 재귀 호출의 과정을 추적
     if (y == 0)
         return x; //어떤 수를 0으로 나누었을 때 나머지는 그 수 자신이므로, x가 최대공약수임
     else
         return gcd(y, x % y);//핵심
 }

 public static void main(String[] args) {
     Scanner stdIn = new Scanner(System.in);

     System.out.println("두 정수의 최대공약수를 구합니다.");

     System.out.print("정수를 입력하세요 : ");  int x = stdIn.nextInt();
     System.out.print("정수를 입력하세요 : ");  int y = stdIn.nextInt();

     System.out.println("최대공약수는 " + gcd(x, y) + "입니다.");
 }
}

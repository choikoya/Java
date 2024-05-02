package Quiz;

import java.util.Scanner;

public class PrimeN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Number[0:exit]:");
			int num = sc.nextInt(); //임의의 num값 받음
			if(num == 0) break; //0이면 나감
			
			if(isPrime(num) == true) //isPrime num이 true면
				System.out.println(num + " is a Prime."); //num은 소수 출력
			else									//그렇지 않으면
				System.out.println(num + " is not a Prime."); //num은 소수아님 출력
		}
		sc.close(); //스캔종료
		System.out.println("Done!"); //"Done"출력
	}

	//방법1. 2 ~ N-1 까지 확인
	
	//num이 소수면 true, 그렇지 않으면 false를 리턴
//	public static boolean isPrime(int num) { //소수 판별 메서드
//		if(num == 1) {
//			return false;
//		}
//		
//		//i:num. for문 한바퀴 돌때마다 1씩 증가
//		for(int i = 2; i<num; i++) {
//			if(num%i==0) 
//				return false;
//				
//
//			}
//			return true;
//		}
//	
	
	//방법2. 2 ~ N/2 까지 확인
	
//	public static boolean isPrime(int num) { //소수 판별 메서드
//		if(num == 1) {
//			return false;
//		}
//		
//		//i:num. for문 한바퀴 돌때마다 1씩 증가
//		for(int i = 2; i<num/2; i++) {
//			if(num%i==0) 
//				return false;
//				
//
//			}
//			return true;
//		}
//	
	
	//방법3. 2 ~ Math.sqrt(N) 까지 확인 . 제곱근값 반환
	
	public static boolean isPrime(int n) { //소수 판별 메서드
		if(n == 1) return false;
		if(n == 2 || n == 3) return true;
		
		
		//i:num. for문 한바퀴 돌때마다 1씩 증가
		for(int i = 2; i<Math.sqrt(n); i++) {
			if(n%i==0) 
				return false;
				

			}
			return true;
		}
		
		


	}



package Quiz;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		수치 합
//		0보다 큰 하나의 정수를 입력 받아서 전체 합, 홀수 합, 짝수 합 출력
//		
//		예)
//		입력 :n
//		전체 합 : 1+2+3...(n-1)+n = sum
//		홀수 합 : 1+3..=sum
//		짝수 합 : 2+4..=sum
		
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.print("숫자입력:[0:exit]");
		
		int n = sc.nextInt();
		if (n == 0)
			break;	
		
			int sum1 = 0;
			int sum2 = 0;
			
			//홀수 짝수를 각각 sum1, sum2로 설정해서 최종합은 sum1+sum2하면됨
			for(int i=1; i<=n; i++) {
				if (i%2 == 0) {
					sum2 += i;
				//sum += i; // sum = sum + i;
				}
				else 
				{
					sum1 += i;
				}
			}
			
			System.out.println("짝수합:"+ sum2); //for문 밖에 출력값이 있어야 됨
			System.out.println("홀수합:"+ sum1);
			System.out.println("전체합:" + (sum1 + sum2));
		
		
	}
		System.out.println("종료");
		sc.close(); //리소스 닫음 없어도 됨

}
}

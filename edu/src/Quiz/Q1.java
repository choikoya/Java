package Quiz;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		두 수를 입력 받아 곱을 출력
//		앞의 수를 뒤의 수로 나누어 몫과 나머지 출력
//		
//		예
//		
//		입력 값 : 15,4
//		곱 : 15*4 = 60
//		몫: 15/4 =3
//		나머지 : 15-(4*3)=3
		
		
		Scanner sc = new Scanner(System.in);
		
	
		System.out.print("A : ");
		int n = sc.nextInt();
		
		System.out.print("B : ");
		int m = sc.nextInt();
		
		System.out.println("곱 : " + (n * m));
		System.out.println("몫 : " + (n / m));
		System.out.println("나머지 : " + (n % m));
		
		
		
		
	

	}

}

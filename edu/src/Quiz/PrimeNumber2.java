//정수의 자릿수를 입력 받아서 해당 자릿수에 속하는 소수 찾아서 출력하기

package Quiz;

import java.util.Scanner;

public class PrimeNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("Number[0:exit]");
			int num = sc.nextInt();
			if (num == 0) break;
			
			//이해가 안되는 부분
			int s = (int)Math.pow(10.0, (double)(num-1)); //ex)3이면 세자리수 시작100~
			int e = (int)Math.pow(10.0, (double)(num))-1; //세자리수 끝 ~999까지
			
			int count = 0; //카운트 초기화
			
			for(int i=s; i<=e; i++) { //입력받은 자릿수 넣은 값~ 자릿수 끝까지 1씩 증가
				if(PrimeNumber1.isPrime(i)) { //PrimeNumber1클래스의 isPrime 메서드 사용
					System.out.println(i); //소수인 i 출력
					count++; //카운트 더함
				}
			}
			System.out.println("Number of Prime :" + count);
			
		}
		System.out.println("Done!"); //메인 안에서 돌아가게
	}
	
	

}

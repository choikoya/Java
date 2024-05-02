//정수의 자릿수를 입력 받아서 소수를 찾아서 출력하는 프로그램 작성
//ex) 입력 자릿수 : 4 (1000 ~ 9999)
// 7331 ➔ 7, 73, 733, 7331 모두 소수

package Quiz;

import java.util.Scanner;

public class PrimeNumber3 {

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
			int count = 0;
			
			for(int n = s; n<e; n++) {
				if(PrimeNumber1.isPrimeAll(num)) {
					System.out.println(n + "");
					count++;
				}
			}
			System.out.println("Number of Prime :" + count);
		}
		System.out.println("Done!");
	}
	

	}


	
	
	//4자릿수 입력받음
	//n3//10의 3제곱자리 %==0 (1000~9999) 도는동안 %2==0이면 x 아니면 출력, 
	//n2//10의 2제곡자리 %==0 (100~999) 도는동안 %2==0이면 x 아니면 
	//n2//
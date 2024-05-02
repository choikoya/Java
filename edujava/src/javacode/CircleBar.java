/*원기둥 클래스
• 아래의 필드와 메소드를 갖는 원기둥 클래스를 작성하세요.
• 필드:
• radius : 반지름
• height : 높이
• 메소드:
• getVolume() : 부피 반환
• getArea() : 겉넓이 반환
• 출력 예
• 원기둥의 부피: 251.33
• 원기둥의 겉넓이: 226.19
 */

package javacode;

import java.util.Scanner;

public class CircleBar {


	static int r = 5; //반지름
	static int h = 10; //높이

	//부피구하기
	//PI * radius * radius * height
	static double getVolume() {

		return Math.PI * r * r * h; //double v = Math.PI * r * r * h; 부피구하기
		//return 0.0;
	}

	//표면적 구하기
	//원기둥 겉넓이 : 226.19 PI * radius * raius * 2 + (2 * PI * radius) * height 
	static double getArea() {
		return Math.PI * r * r * 2 + (2*Math.PI*r)*h;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("반지름[0:exit]"); 
			r=sc.nextInt();
			if(r==0)
				break;
			System.out.print("높이"); 
			h =sc.nextInt();

			System.out.println("Volume:" + (int)getVolume());
			System.out.println("Area:" + (int)getArea());

		}
		System.out.println("Done");
		sc.close();

	}
}


package Chap2_기본자료구조;

//메소드에 배열 전달 실습: 교재 59 -  배열을 메소드의 매개변수로 전달하여 다양한 작업을 수행하는 방법
//function parameters를 작성할 수 있어야 한다 

import java.util.Random;

public class train_실습2_4메소드배열전달 {
	
	static int top = 0; //현재 배열에 저장된 데이터의 개수
	static final int MAX_LENGTH = 20; //배열의 최대 크기를 나타내는 상수
	
	public static void main(String[] args) { //메인 메소드
		
		int []data = new int[MAX_LENGTH];// 정수형 배열 선언. 크기 20의 배열 생성
		
		inputData(data, 10);//inputData 메소드를 호출. 10개 정수를 입력받는다
		showData(data);//showData 메소드를 호출. 배열의 내용을 출력
		
		int max = findMax(data);//findMax 메소드를 호출. 배열에서 최대값을 찾아 max 변수에 저장. 58p 실습2-3 참조
		System.out.println("\nmax = " + max);//최대값을 출력
		boolean existValue = findValue(data, 3); //findValue 메소드를 호출. 배열 data에 값 3이 있는지 확인. 그 결과를 existValue 변수에 저장
		System.out.println("찾는 값 = " + 3 + ", 존재여부 = " + existValue);//값 3의 존재 여부를 출력
	}
	
	//inputData 메소드는 배열 data와 정수 n을 매개변수로 받음
	static void inputData(int[]data, int n) {//교재 63 - 난수의 생성/top이 배열에 저장된 갯수를 저장
		
		//Random 클래스의 인스턴스 rand를 생성
		Random rand = new Random();
		for(int i=0;i<n;i++) {
			data[i] = rand.nextInt(100); //0부터 99까지의 난수를 생성하여 배열 data에 저장. nextInt메서드:int형 정수의 난수를 생성
		}
		top = n;// top 변수에 실제 저장된 데이터 개수 설정
	}
	
	//showData 메소드는 배열 data를 매개변수로 받음
	static void showData(int[]data) {
		//top 갯수까지 출력한다 [1,2,3]등으로 출력하도록 작성
		//배열의 내용을 출력. 배열의 첫 요소는 [로 시작하고, 각 요소는 , 로 구분되어 마지막 요소 후에는 ]로 끝납
		System.out.print("[");
		for(int i=0;i<top;i++) {
			System.out.print(data[i]);
			if(i<top-1)
				System.out.print(",");
		}
		System.out.print("]");
	}
	
	//findMax 메소드는 배열 data를 매개변수로 받음
	static int findMax(int[] data) {
		//배열의 첫 번째 요소를 max 변수에 초기화
		int max = data[0];
		//배열의 각 요소를 확인하면서 현재 max보다 큰 값을 찾으면 max를 갱신
		for(int i=1;i<data.length;i++)
			if(data[i]>max)
				max = data[i];
		
		return max;
		//최대값을 반환 
	}
	
	//findValue 메소드는 배열 data와 정수 value를 매개변수로 받음
	static boolean findValue(int[]data, int value) {
		//items[]에 value 값이 있는지를 찾아 존재하면 true, 없으면 false로 리턴
		
		//for 루프를 사용하여 배열의 각 요소를 확인. 만약 요소 중 하나가 value와 같다면 true를 반환
		for(int i=0;i<top;i++) {
			if(data[i] == value) {
				return true;
			}
			
		}
		//
		return false;

	}

}

package Chap2_기본자료구조;

import java.util.Arrays;
//교재 67 - 실습 2-5
//2번 실습
import java.util.Random;

public class train_실습2_5정수배열정렬 {
	
	static int top = 0;
	static final int MAX_LENGTH = 20;
	
	public static void main(String[] args) {
		
		float []data = new float[MAX_LENGTH];// 0.0 ~ 1.0 사이의 실수를 저장
		inputData(data, 10);//10개의 난수를 입력
		showData(data);//top 개수 만큼 출력

		
		reverse(data);//역순으로 재배치 - 교재 67페이지 참조
		System.out.println(Arrays.toString(data));// 교재 84페이지 코드 참조

		sortData(data);//교재 205 bubbleSort() 함수 코드를 사용 - 올림차순으로 정렬
		showData(data);
		
		Random rand = new Random();
		float realData = rand.nextFloat();//실수 난수 생성
		insertData(data, realData);//역순으로 재배치 - 정렬 아님
		showData(data);
	}
	

	static void inputData(float[]data, int n) {
		//난수 실수를 입력
		Random rand = new Random();
		for(int i=0;i<n;i++)
		//	data[i]=rand.nextFloat(); //(float)1.0넣은것과 차이?
		 data[i] = (float)Math.random();
			
		top += n;

	}
	
	static void showData(float[]data) {//실수 배열을 top 갯수만 출력
		
		System.out.print("(");
		for(int i=0;i<top;i++) { //i는 배열의 인덱스
			System.out.print(data[i]);
			if(i<top-1) {
				System.out.print(", ");//마지막 요소 뒤에 쉼표를 출력하지 않기 위해서
			}
			
		}
		System.out.println(")");
	}
	
	static void swap(float[]data, int i, int j) {//교재 67페이지 - 맞교환
		float temp = data[i];
		data[i] = data[j];
		data[j] = temp;
		
	}
	
	static void reverse(float[]data) {//역순으로 재배치
		for(int i=0;i<top/2;i++) {
			swap(data, i, top - 1 - i);
		}
		
	}
	
	
	
	static void sortData(float[]data) {//오름차순으로 정렬
		for(int i=0;i<top-1;i++) {
			for(int j= 0; j<top -1 - i; j++) {
				if(data[j] > data[j + 1]) {
					swap(data, j, j + 1);
				}
			}
		}

	}
	
	
	static void insertData(float[]data, float RealData) {//insert되는 실수 값이 insert될 위치를 찾아 보다 큰 값은 우측으로 이동
		
		
		int insert = top;
		for (int i = top - 1; i >= 0; i--){
			if(RealData > data[i]) {
				break;
			}
			data[i + 1] = data[i];
			insert = i;
		}
		data[insert] = RealData;
		top++;
	}


}









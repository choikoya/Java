package Chap2_기본자료구조;

import java.util.Arrays;

//5번 실습 - 2장 실습 2-10를 수정하여 객체 배열의 정렬 구현
class PhyscData implements Comparable<PhyscData>{
	String name;
	int height;
	double vision;

	public PhyscData(String string, int i, double d) {
		this.name=string;
		this.height=i;
		this.vision=d;
		
	}
	@Override
	public String toString() {
		return name +" "+ height +" "+ vision;

	}
	@Override
	public int compareTo(PhyscData p) {
		if (this.name.compareTo(p.name) == 0)
			if(this.height - p.height == 0) {
				return Double.compare(this.vision, p.vision);
			}
			else {
				return this.height - p.height;
			}
		else
			return this.name.compareTo(p.name);
	}
//	public int equals(PhyscData p) {
//
//	}
}
public class 실습2_14객체배열정렬 {
//	swap() {
//		
//	}
//	sortData() {//객체 배열을 이름 순서로 정렬, 이름이 같으면 키 값을 정렬, 키 값이 같으면 시력으로 
//		
//	}
	public static void main(String[] args) {
		PhyscData[] data = {
				new PhyscData("홍길동", 162, 0.3),
				new PhyscData("홍동", 164, 1.3),
				new PhyscData("홍길동", 162, 0.7),
				new PhyscData("김홍길동", 172, 0.3),
				new PhyscData("이길동", 182, 0.6),
				new PhyscData("이길동", 167, 0.2),
				new PhyscData("최길동", 169, 0.5),
		};
		showData("정렬전",data);
		
		sortData(data);
		showData("정렬후", data);
		
		PhyscData[] newData= insertObject(data, new PhyscData("이기자", 179, 1.5));//배열의 사이즈를 1개 증가시킨후 insert되는 객체 보다 큰 값들은 우측으로 이동, 사이즈가 증가된 객체 배열을 리턴
		showData("삽입후", newData);
	}
	
	static void showData(String msg, PhyscData[] data) {
		System.out.println(msg);
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]);
		}
		
	}
	
	static void sortData(PhyscData[] data) {
		Arrays.sort(data);
		
	}
	
	
	
	static PhyscData[] insertObject(PhyscData[] data, PhyscData n){//배열의 사이즈를 1개 증가시킨후 insert되는 스트링 보다 큰 값들은 우측으로 이동, 사이즈가 증가된 스트링 배열을 리턴
		PhyscData[] newData = new PhyscData[data.length+1];
		
		int i = 0;
		
		while(i < data.length && data[i].compareTo(n) < 0)  {
			newData[i] = data[i];
			i++;
		}
		newData[i] = n;
		while(i < data.length) {
			newData[i+1] = data[i];
			
			i++;
		}
		
//		while(i < data.length )  {
//			if (data[i].compareTo(n) < 0)
//				newData[i] = data[i];
//			else {
//				newData[i] = n;
//			}
//			i++;
//		}
		
		return newData;
		
	}

}

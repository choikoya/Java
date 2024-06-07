//문자열 배열을 정렬하고, 새로운 문자열을 삽입하는 기능을 구현

package Chap2_기본자료구조;

import java.util.Arrays;

public class Test_실습2_14스트링배열정렬 { //public class가 한개여야만 오류안남. 이름 바꾸려면 f2
	public static void main(String[] args) {
		String []data = {"apple","grape","persimmon", "pear","blueberry", "strawberry", "melon", "oriental melon"};
		showData("정렬전", data);
		
		sortData(data);
		showData("정렬후", data);
		
		data = insertString(data, "banana");
		showData("삽입후", data);
		
		
		
	}
	
	 // 배열을 출력하는 메소드
	static void showData(String message, String[]data) {//확장된 for 문으로 출력 
		System.out.println(message);
		for(String item:data) {//배열 data의 각 요소를 순서대로 하나씩 순회하여 각 요소를 item변수에 저장
			System.out.println(item+"");
		}
		System.out.println();
	}

	

	// 두 문자열을 교환하는 메소드
	static void swap(String data[], int idx1, int idx2) {//스트링의 맞교환 함수로 sortData()에서 호출됨
		String temp= data[idx1];
		data[idx1]=data[idx2];
		data[idx2]=temp;
		System.out.println("교환후:"+data[idx1]+"<->"+data[idx2]);
	}
	
	
	// 문자열 배열을 오름차순으로 정렬하는 메소드
	static void sortData(String data[]) {//오름차순으로 정렬
		for(int i=0;i<data.length-1;i++) {
			for(int j=i+1;j<data.length;j++) {
				if(data[i].compareTo(data[j])>0) { //compareTo() 메서드: 문자열을 비교하여 두 문자열이 같으면 0, 첫 번째 문자열이 두 번째 문자열보다 사전적으로 앞에 오면 양수, 그렇지 않으면 음수를 반환
					swap(data, i, j);
				}
			}
		}
		

	}
	
	  //새로운 문자열을 배열에 삽입하는 메소드
	static String [] insertString(String[]data, String newString){//배열의 사이즈를 1개 증가시킨후 insert되는 스트링 보다 큰 값들은 우측으로 이동, 사이즈가 증가된 스트링 배열을 리턴
		// 새로운 문자열을 추가하기 위해 배열의 크기를 1 증가시킴
		String[] newData = new String[data.length+1];
		
		for(int i=0;i<data.length;i++) {
			newData[i]=data[i];
		}
		
		int i;
		for(i=newData.length -2;i>=0 && newData[i].compareTo(newString)>0; i--) {
			newData[i+1] = newData[i];
		
	}
		//System.out.println("new string = " );
	
		newData[i+1]= newString;
		//for (String st: newData)
		//	System.out.print(" " + st);
		//data = newData;
		//for (String st: data)
		//	System.out.print(" " + st);
		return newData;
		//System.arraycopy(newData, 0, data, 0, newData.length);
		
	}
}




//static String[] insertString(String[] data, String newString): 이 메소드는 배열의 크기를 증가시키고, 새로운 문자열을 삽입한 후 새로운 배열을 반환합니다. 이 메소드는 새로운 배열을 반환하기 때문에 호출하는 쪽에서 반환된 배열로 원본 배열을 대체해야 합니다.
//static void insertString(String[] data, String newString): 이 메소드는 배열을 직접 수정하여 새로운 문자열을 삽입합니다. 따라서 메소드를 호출한 후에는 배열이 수정된 상태로 유지됩니다. 반환 값이 없기 때문에 호출하는 쪽에서 별도의 작업이 필요하지 않습니다. 이 방식은 메소드 호출 후에도 원본 배열이 수정된 상태로 유지되므로 호출하는 쪽에서 추가적인 작업이 필요하지 않습니다.


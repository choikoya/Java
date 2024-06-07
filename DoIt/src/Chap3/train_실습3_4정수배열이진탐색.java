//목적: 배열에 난수를 생성하여 입력하고, 배열을 정렬한 후 선형 검색과 이진 검색을 통해 특정 값을 찾는 과정을 연습. 
//이를 통해 초보자가 배열의 정렬 및 검색 알고리즘에 익숙해지고, 자바에서 배열을 다루는 방법을 이해할 수 있도록 도움.


package Chap3;
/*
* 3장 1번 실습과제: 03-3 정수배열이진검색
* 함수(메소드)에 parameter 전달 방식을 표현하는 능력의 숙달 훈련
* 함수(메소드) 전체를 작성하는 훈련 
* 3장 - 1번 실습 과제 > 2번 실습: 스트링 객체의 정렬과 이진 탐색 > 3번 실습: 객체 정렬과 이진 탐색
*/
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//main 클래스 정의
public class train_실습3_4정수배열이진탐색 {

	static Object arr;// 정적 객체 변수 선언

	 // main 메소드 정의
	public static void main(String[] args) {
		
		int []data = new int[30];// 길이가 30인 정수 배열 선언
		
		inputData(data);// 구현 반복 숙달 훈련 - 배열에 100 이하 난수를 생성하는 메소드 호출

		showList("정렬 전 배열[]:: ", data); //정렬 전 배열출력
		Arrays.sort(data); //배열 정렬
		showList("정렬 후 배열[]:: ", data);// 정렬 후 배열출력
		
		Scanner scanner = new Scanner(System.in);// 스캐너 객체 생성

		//선형 검색
		System.out.println("선형 검색을 위한 키 값 입력:");
		int key = scanner.nextInt(); // 키 값을 입력 받음
		//선형 검색을 통해 배열에서 키 값 찾기:linearSearch 메소드를 호출하여 배열에서 키 값을 찾음
		//교재 99-100:실습 3-1 참조, 교재 102: 실습 3-2
		int resultIndex = linearSearch(data, key);// 선형 검색 함수 호출하여 결과 인덱스를 변수에 저장
		
		//Arrays 클래스에 linear search는 없기 때문에 구현해야 한다 
		System.out.println("\nlinearSearch(13): key = " + key + ", result = " + resultIndex); // 선형 검색 결과 출력

		/*
		 * 교재 109~113
		 */
		//이진 검색
		System.out.println("이진 검색을 위한 키 값 입력:");
		key = scanner.nextInt();
		resultIndex=(int) binarySearch(data, key); // 이진 검색 함수 호출하여 결과 인덱스를 변수에 저장
		System.out.println("\nbinarySearch:key="+key+",result="+resultIndex);// 이진 검색 결과 출력
		
		
		/*
		 * 교재 115 Arrays.binarySearch에 의한 검색
		 */
		// Arrays.binarySearch를 사용한 검색
		System.out.println("Arrays.binarySearch를 위한 키 값 입력:");
		key = scanner.nextInt();
		resultIndex = Arrays.binarySearch(data, key);// Arrays.binarySearch를 사용하여 결과 인덱스를 변수에 저장
		System.out.println("\nArrays.binarySearch(10): result = " + resultIndex);// Arrays.binarySearch 결과 출력

	}

	// 배열에 난수를 입력하는 함수
	static void inputData(int[] data) {
		// TODO Auto-generated method stub
		Random rand = new Random();// Random 객체 생성
		for (int i = 0; i < data.length; i++) {// 배열의 각 인덱스를 순회
			data[i] = rand.nextInt(101);  // 0부터 100까지의 난수를 배열에 저장
		}
		
	}
	
	
	// 배열을 출력하는 함수
	static void showList(String message, int[] data) {
		// TODO Auto-generated method stub
		System.out.print(message);// 메시지 출력
        for (int i : data) {// 배열의 각 요소를 순회
            System.out.print(i + " ");// 각 요소 출력
        }
        System.out.println();
		
	}


	 // 선형 검색 함수
	static int linearSearch(int[] data, int key) {
		// TODO Auto-generated method stub
		for (int i = 0; i < data.length; i++) { // 배열의 각 요소를 순회
            if (data[i] == key) { // 현재 요소가 키 값과 같으면
                return i; // 인덱스 반환
            }
        }
        return -1;  // 찾지 못했을 때 -1 반환
		
	}

	 // 이진 검색 함수
	static int binarySearch(int[] data, int key) {
		// TODO Auto-generated method stub
		int low = 0; // 검색 범위의 시작 인덱스
        int high = data.length - 1;// 검색 범위의 끝 인덱스

        while (low <= high) {// 검색 범위가 유효할 때까지 반복
            int mid = (low + high) / 2;// 중간 인덱스 계산
            if (data[mid] == key) {// 중간 요소가 키 값과 같으면
                return mid;// 인덱스 반환
            } else if (data[mid] < key) {// 중간 요소가 키 값보다 작으면
                low = mid + 1; // 검색 범위의 시작 인덱스를 중간 인덱스 다음으로 설정
            } else {// 중간 요소가 키 값보다 크면
                high = mid - 1;// 검색 범위의 끝 인덱스를 중간 인덱스 이전으로 설정
            }
        }
        return -1;  // 찾지 못했을 때 -1 반환
    }
	}

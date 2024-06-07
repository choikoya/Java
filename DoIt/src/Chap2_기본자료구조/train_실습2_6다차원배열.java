package Chap2_기본자료구조;

//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/*
 * 3번째 실습
 * 교재 83 - 배열 처리 + function parameter 전달 숙달 훈련 
 */

public class train_실습2_6다차원배열 {

	public static void main(String[] args) {
		double [][]A = new double[2][3]; //2x3 크기의 행렬 A를 생성
		double [][]B = new double[3][4];
		double [][]C = new double[2][4];

		inputData(A); 
		inputData(B);
		double [][]D = A.clone();//교재83 - //행렬 A를 복제하여 D에 저장
	
		showData("A[2][3] = ",A);// A 행렬 데이터 출력
		
		showData("D[2][3] = ",D);
	
		showData("B[3][4] = ",B);
		
		
		double [][]E = addMatrix(A,D);//행렬 덧셈
		showData("E[2][3] = ",E);
		
		
		C = multiplyMatrix(A,B);//행렬 곱셈
		showData("C[2][4] = ",C);

		double [][]F = transposeMatrix(A);//전치 행렬(원래의 행렬에서 행과 열을 서로 바꾼 새로운 행렬)
		showData("F[3][2] = ",F);
		
		boolean result = equals(A, D);//행렬 A와 D가 같은지 비교
		System.out.println(" equals(A,D) = " + result);
		
		System.out.println("F = " + Arrays.deepToString(F));// 2차원 배열 F를 문자열로 출력 
	}
	static void inputData(double[][]data) {//double 난수 0.0 ~ 1.0 생성
		Random rand = new Random();
		for(int i=0;i<data.length;i++) {// 행렬의 각 행을 반복
			for(int j=0;j<data[i].length;j++) {// 행렬의 각 열을 반복
				data[i][j]=rand.nextDouble();// 난수를 생성하여 행렬의 해당 위치에 저장
			}
		}


	}
	
//	일반적인 for루프로 표현하면?
//	for (int i = 0; i < data.length; i++) {
//    double[] row = data[i];
//    System.out.println(Arrays.toString(row));
//}	
	
	static void showData(String message, double[][]data) {//주어진 문자열을 출력하고 배열을 2차원 형태로 출력
		System.out.println(message);
		for(double[] row:data) {// 행렬의 각 행을 반복(data 배열의 각 요소를 row 변수에 할당하여 반복. data는 2차원 배열이므로 row는 data의 각 행을 나타냄)
			System.out.println(Arrays.toString(row));// 행렬의 각 행(row배열)을 문자열로 변환하여 출력
		}
		 System.out.println();
	}
	
	
//		A가 2x3 배열이라면:
//		A.length는 2 (행의 수)
//		A[i].length는 3 (열의 수, 각 행의 길이)

	//두 행렬의 사이즈가 같고 값도 모두 같아야 행렬 2개는 equals을 true로 리턴
	static boolean equals(double[][]A, double[][]B) {// 두 행렬이 같은지 비교하는 메소드
		if(A.length != B.length || A[0].length !=B[0].length) {// 행렬의 크기가 다른지 확인
			return false;// 크기가 다르면 false 반환
		}
		for(int i=0; i<A.length; i++) {// 행렬의 각 행을 반복(A.length는 배열 A의 행의 수를 나타냄)
			for(int j=0; j<A[i].length; j++) {// 행렬의 각 열을 반복=배열 A의 i번째 행의 각 열을 반복(A[i].length는 i번째 행의 열의 수를 나타냄,)
				if(A[i][j] != B[i][j]) {//행렬의 해당 위치의 값이 다른지 확인
				return false;
				}
			
			}
		}
		return true;// 모든 값이 같으면 true 반환

	}
	static double [][] addMatrix(double[][] A, double[][] B) {//행렬 덧셈 결과를 리턴
		if(A.length != B.length || A[0].length != B[0].length) {
			throw new IllegalArgumentException("행렬크기다름");// 크기가 다르면 예외 발생
		}
		double[][] result = new double[A.length][A[0].length]; // 결과 행렬 생성
		for(int i=0;i<A.length; i++) { 
			for(int j=0;j<A[i].length;j++) {
				result[i][j] = A[i][j]+B[i][j]; // 두 행렬의 값을 더하여 결과 행렬에 저장
			}
		}
		return result;

	}
	static double [][] multiplyMatrix(double[][] A, double[][] B) {//행렬 곱셈 결과를 리턴
		 if (A[0].length != B.length) {// 행렬의 크기가 곱셈 조건을 만족하는지 확인
	            throw new IllegalArgumentException("행렬 A의 열의 수와 행렬 B의 행의 수 불일치");
	        }
		 double[][] result = new double[A.length][B[0].length];// 결과 행렬 생성
	        for (int i = 0; i < A.length; i++) {
	            for (int j = 0; j < B[0].length; j++) {
	                for (int k = 0; k < A[0].length; k++) {// 곱셈을 수행하기 위해 추가 반복
	                    result[i][j] += A[i][k] * B[k][j];// 두 행렬의 값을 곱하여 결과 행렬에 더함
	                }
	            }
	        }
	        return result;// 결과 행렬 반환
	    }
	
	static double [][] transposeMatrix(double[][] A) {//전치 행렬을 리턴
		 double[][] result = new double[A[0].length][A.length];//결과 행렬 생성 (행과 열의 크기가 바뀜)
	        for (int i = 0; i < A.length; i++) {
	            for (int j = 0; j < A[0].length; j++) {
	                result[j][i] = A[i][j];// 원래 행렬의 값을 전치 행렬의 해당 위치에 저장
	            }
	        }
	        return result;
	    }
}


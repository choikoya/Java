package Quiz;

import java.util.Random; //랜덤 임포트
import java.util.Scanner; //스캐너 임포트 ctrl + shift + O

public class MatrixCalc {

	private	int[][] matrix = { //필드변수. 전체 클래스에 적용
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
	private void getMatrix() { //랜덤 입력받아서 행렬 합 구하기
		Scanner sc = new Scanner(System.in);
		System.out.print("행렬:");
		int n = sc.nextInt(); //입력받은 값을 지역변수 n에  
		int m = sc.nextInt();
		
		matrix = new int [n][m]; 
		Random rd = new Random(); //랜덤 변수 만듦
		
		for (int i=0; i<n; i++) { //입력받은 n,m으로 행렬만들기
			for (int j=0; j<m; j++) {
				matrix[i][j] = rd.nextInt(10); //sc.nextInt()로 해놓으면 배열 전부 입력해야해서
	
			}
			
		}
		sc.close();
		

	}

	public void work(boolean flag) { //boolean넣어서 true면 
		if (flag) getMatrix(); //getMatrix 실행 
		
		//1행 가로 합 출력
		//1+2+3 matrix[0][0] + matrix[0][1] + matrix[0][2]
		for(int i=0; i<matrix.length; i++) {
			
			int sum = 0; //sum값 초기화
			for (int j=0; j<matrix[0].length; j++) { //처음엔 j<3까지로 해보고 생성된 배열길이만큼 돌게끔
				sum = sum + matrix[i][j]; //0으로 해서 한번 돌려보고 값넣기
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println("=>"+sum);	
		}
		System.out.println();
		
//		세로 합 출력
//		matrix[0][0] + matrix[1][0] + matrix[2][0]
		for(int j=0; j<matrix[0].length; j++) {
			
			int sum = 0;
			for (int i=0; i<matrix.length; i++) {
				sum = sum + matrix[i][j];
			System.out.print(matrix[i][j]+"\t");
			}
			System.out.println("=>"+sum);
		}
		
		
	}
	
	
	
}

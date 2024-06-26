
package Quiz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class MReader {
	//파일에서 데이터를 읽어서 2차원 배열로 만들어주는 메서드

	private static int[][] loadMatrix(String fname) { // 행렬만들기
		int[][] ret = null;
		List<String> list = new ArrayList<>();
		String str;
		try (BufferedReader br = new BufferedReader(new FileReader(fname))) {
			while ((str = br.readLine()) != null) {
				list.add(str);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}

		for (int i = 0; i < list.size(); i++) {
			String[] arr = list.get(i).split(" ");
			if (ret == null) {
				ret = new int[list.size()][arr.length];
			}
			for (int j = 0; j < arr.length; j++) {
				ret[i][j] = Integer.parseInt(arr[j]);

				
			}
			
		}
		return ret; //for 루프 끝나고 리턴
	}
	//파라미터로 넘어온 2차원 배열을 출력하는 메서드
	private static void printMatrix(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("-".repeat(30));
	}
	//2차원 배열 2개를 행렬곱하는 메서드
	private static int[][] caclMatrix(int[][] a, int[][] b) {
		return null;
	}
	//메인 메서드
	public static void main(String[] args) {
		int[][] a = loadMatrix("m.txt");
		if (a == null)
			return;
		printMatrix(a);
		int[][] b = loadMatrix("m1.txt");
		if (b == null)
			return;
		printMatrix(b);

		int[][] c = caclMatrix(a, b);
		printMatrix(c);

	}
	

}








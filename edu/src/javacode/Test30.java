package javacode;

public class Test30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 100; i++) {

//			int i = 6;
			if ((i % 2) == 0) {
				// System.out.println(i + "은 2의 배수입니다");
				if ((i % 3) == 0) {
					System.out.println(i + "은 2와 3의 공배수입니다");
				}

			}
		}

	}
}

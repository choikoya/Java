package practice;

public class StaticMethodTest {
	

	public static void main(String[] args) {
		
		//클래스 메서드 사용//클래스명.메서드명 //사용시 변수필요없음
		StaticMethodTest.print1();
		
		//오류남. print2는 static선언하지 않았는데 클래스 메서드처럼 호출했기때문
		//StaticMethodTest.print2();
		
		//힙 메모리에 StaticMethodTest 클래스의 인스턴스 생성 후 스택 메모리에 생성한 참조변수 exam에 인스턴스 참조정보 저장
		StaticMethodTest exam = new StaticMethodTest();
		//스택에서 참조변수 exam의 인스턴스를 찾아가 print2()메서드 호출> 출력됨
		exam.print2();
		
		
		// TODO Auto-generated method stub

	}

	public static void print1() { //static으로 선언한 클래스 메서드

		System.out.println("hello");
	}
	
	public void print2() { //static으로 선언하지 않은 인스턴스 메서드
	
		System.out.println("java");
	}
	
	
}



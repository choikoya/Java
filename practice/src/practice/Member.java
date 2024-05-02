package practice;

public class Member {

	private String name;
	private int age;
	
	public Member() {
		System.out.println("Member() 생성자 실행");
		
	}
	public void setName(String name) {
		
	}
	public static void main(String[] args) {
		//main()메서드 실행후
		System.out.println("main() 메서드 실행");
		
		//Member클래스의 인스턴스를 힙에 생성. 생성자 호출
		new Member();
		// TODO Auto-generated method stub

	}

}

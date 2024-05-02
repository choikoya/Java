package practice;

public class ArmorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//new Armor()은 객체를 메모리에 생성. heap 메모리에 3개의 인스턴스 생성(name, height)인스턴스 3개씩.
		//클래스명 참조변수명 = new 클래스명();
		Armor suit1 = new Armor(); //참조변수 suit1 선언. new 명령문은 할당된 메모리의 위치정보(인스턴스의 참조정보)를 반환->참조변수에 저장
		Armor suit2 = new Armor();
		Armor suit3 = new Armor();
		
		suit1.setName("mark6");//suit1 변수가 참조하는 인스턴스를 찾아가 각 필드에 저장
		suit1.setHeight(180);
		
		suit2.setName("mark16");
		suit2.setHeight(1800);
		
		suit3.setName("mark116");
		suit3.setHeight(18000);
		
		System.out.println(suit1.getName()+ ":" + suit1.getHeight()); //getName()메서드는 name 필드값 반환
		System.out.println(suit2.getName()+ ":" + suit2.getHeight());
		System.out.println(suit3.getName()+ ":" + suit3.getHeight());
		
		Armor suit = new Armor();
		
		
		//힙 메모리에는 직접 접근할 수 없으므로 stack메모리에 참조변수를 만들어 사용해서 힙에 있는 인스턴스의 필드 또는 메서드에 접근
		//참조변수명.인스턴스의 필드명 또는 메서드명()
		suit.setName("mark6"); //suit 변수가 참조하는 메모리 찾아가 setName메서드 실행> 인자값 mark6이 인스턴스의 name 필드에 저장됨(필드값 수정)
		suit.setHeight(180);
		System.out.println(suit.getName()+ suit.getHeight());
		
	}

}

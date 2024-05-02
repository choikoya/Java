package test2; //armor.java와 다른 패키지에서 armor.java 필드 호출해서 쓰려면 import해야함

import com.ruby.java.test1.Armor; //ctrl shift O로 import / 마우스로 해도됨

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Armor armor = new Armor();
		System.out.println("name:"+armor.name);
	}

}

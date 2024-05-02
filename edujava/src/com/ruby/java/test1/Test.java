package com.ruby.java.test1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Armor armor = new Armor();
		
		boolean ret = armor.takeOff(); 
		if(ret)
			System.out.println("fly");
		else
			System.out.println("no");
	/*	
		armor.takeOff(); //armor 클래스의 takeOff메서드 호출
		armor.isFly = true; //armor의 isFly필드가 private로 선언되어 있으면 접근안되서 호출불가(에러뜸)
		System.out.println();
		armor.takeOff();
		
		armor.
		
		armor.land(); //land 메서드 호출/ land 메서드 콜
		armor.shootLaser();
		armor.launchMissile();
		

		
		System.out.println("Name:" + armor.name); //armor 클래스의 필드 호출
		System.out.println("height" + armor.height);
		System.out.println("weight" + armor.weight);
		

	*/
	}

}

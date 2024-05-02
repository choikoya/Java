package com.ruby.java.ch08.polymorphism;

abstract class Employee{
	String name;
	int salary;
	
	public abstract void calcSalary();
	public abstract void calcBonus();
}
class Salesman extends Employee{
	public int annual_sales;
	public void calcSalary() {
		System.out.println("Salesman 급여 = 기본급 + 판매수당");
	}
	public void calcBonus() {
		System.out.println("Salesman 보너스= 기본급 * 12 * 4");
	}
}

class Consultant extends Employee{
	public int num_project;
	public void calcSalary() {
		System.out.println("Consultant 급여 = 기본급 + 특별수당");
	}
	public void calcBonus() {
		System.out.println("Consultant 보너스= 기본급 * 12 * 2");
	}
}

//class Manager extends Employee{
//	public void calcSalary() {
//		System.out.println("Manager 급여 = 기본급 + 성과수당");
//	}
//	public void calcBonus() {
//		System.out.println("Consultant 보너스= 기본급 * 12 * 2");
//	}
//}

 class Manager extends Employee{
	public int num_team;

	public void calcSalary() {
		System.out.println("Manager 급여 = 기본급 + 성과수당");
	}

	@Override
	public void calcBonus() {
		// TODO Auto-generated method stub
		
	}
}
class Director extends Manager{
	public void calcBonus() {
		System.out.println("director 보너스 = 기본급 * 12 * 6");
	}
}


//
//public class HRSTest {
//	public static void calcTax(Employee e) {
//		System.out.println("소득세를 계산합니다.");
//	}
//	
//	public static void main(String[] args) {
//		Salesman s = new Salesman();//stack에 저장되는 로컬변수
//		Consultant c = new Consultant();
//		Director d = new Director();
//	
////		s.calcBonus();
////		c.calcBonus();
////		d.calcBonus();
////		
////		calcTax(s);
////		calcTax(c);
////		calcTax(d);
//
//		System.out.println(s.toString()); //toString:Object에서 제공되는 기본메소드(ctrl t)
//		System.out.println(s.toString());
//		System.out.println(s.toString());
//		
//		Salesman s2 = s;
//		System.out.println(s2.toString());
//		
//		if(s.equals(c)) {
//			System.out.println("동일한 객체입니다.");
//		}else {
//			System.out.println("서로 다른 객체입니다.");
//		}
//		
//		
//		
//	}
//
//}


//
////다른 테스트
public class HRSTest{
	
	public static void main(String[] args) {
		Salesman s1 = new Salesman();
		Employee s2 = new Salesman();
		Object s3 = new Salesman();
		
		Object m1 = new Manager();
		Employee m2 = new Manager(); //오류: 위에 Manager class abstract삭제 > Manger > unimplements... 클릭
		Manager m3 = new Manager();
		
		Object arr[] = new Object[6];
		arr[0]= s1;
		arr[0]= s2;
		arr[0]= s3;
		arr[0]= m1;
		arr[0]= m2;
		arr[0]= m3;

		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
}


//package com.ruby.java.ch14;
//
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//import java.util.Random;
//
///* 과제목표 : 제네릭, 람다식으로 Comparator, compare 만들어서 정렬하기
///*
// * public interface Comparator<T>{
// *    int compare(T 01, T 02);
// *    }
// *    
// * public interface Comparable<T> {
// *   public int compareTo(T o);
// *   }   
// */
//
//
//class Student { //클래스에서 쓸 필드 생성
//	String sno;
//	String sname;
//	
//	public Student(String sno, String sname) { //메인에서도 쓸 생성자 생성(class밖에서 호출할거라서 public)
//		// TODO Auto-generated constructor stub
//		this.sno=sno; //this.sno는 위에 클래스에서 생성한 sno =sno는 public student에서 만든 것
//		this.sname=sname;
//
//	}
//	public String toString() { //함수
//		
//		return"(" +sno  + ", "+sname +")"; 
//	}
//}
//
//
//public class 구현과제14장_람다식2_copy {
//	static void sortStudents() {
//
//	}
//	static void showStudents(String msg, Student[] sArray) { //출력이름은 달라도 됨 sArray 대신 s로 해되 됨
//		System.out.println(msg + ":");
//		for(int i=0 ; i<sArray.length ; i++) {
//			System.out.print(sArray[i]+" ");
//		}
//		System.out.println();
//	}
//
//	static void showStudents(String msg, List<Student> list) {
//		System.out.print(msg + ": ");
//		
//		System.out.print(list);
//		
//		System.out.println();
//
//	}
//	public static Comparator<Student> sname() {
//		return new Comparator<Student>() {
//			@Override
//			public int compare(Student s1, Student s2) {
//				return s1.sname.charAt(0)-s2.sname.charAt(0);
//			}
//		};
//	}
//	
//	public static void main(String[] args) {
//		
//		
//		
//		//문제1: Arrays.sort()를 사용한 sArray 정렬 - sno 사용, 익명클래스 사용
//
////*객체비교 인터페이스*
//		
//		//자기 자신과 매개변수 객체를 비교
////Comparable 인터페이스 쓰려면 compareTo 메소드를 구현해야함 
////		 compareTo(T o) 메소드는 파라미터(매개변수)가 한 개
//		
//		//두 매개변수 객체를 비교
////Comparator 인터페이스를 쓰려면 compare 메소드를 구현해야 한다
////		 Comparator의 compare(T o1, T o2) 메소드는 파라미터 두 개 
//		 
//		 
//		 
////*Generic(제네릭)*
//// 많은 타입을 지원하고 싶은데 String에 대한 클래스, Integer에 대한 클래스 등 하나하나 타입에 따라 만드는건 비효율적
//// 그래서-> 제네릭이라는 것을 사용(클래스 내부가 아닌 외부에서 사용자에 의해 지정되는 것을 의미함) 
//// 특정(Specific) 타입을 미리 지정해주는 것이 아닌 필요에 의해 지정할 수 있도록 하는 일반(Generic) 타입인것	
//// 지정된다는 것 보다는 타입의 경계를 지정하고, 컴파일 때 해당 타입으로 캐스팅하여 매개변수화 된 유형을 삭제하는 것임
//	
//	Comparator<Student> compSno = new Comparator<Student>(){ //제네릭
//		@Override //재정의
//		public int compare(Student s1, Student s2) {
//			
//		return Integer.parseInt(s1.sno) - Integer.parseInt(s2.sno);
//
//		
//	}
//
//	};
//	
//	Comparator<Student> compSno2 = (s1,  s2) ->Integer.parseInt(s1.sno)-Integer.parseInt(s2.sno);
//	
//        Student[] sArray = new Student[5];
//        
//        // Student 객체 생성 및 배열에 할당
//        sArray[0] = new Student("121", "Alice"); //함수호출. 생성자가없다고 오류 
//        sArray[1] = new Student("33", "Bob");
//        sArray[2] = new Student("9", "Charlie");
//        sArray[3] = new Student("2", "John");
//        sArray[4] = new Student("39", "Bobby");
//        // ArrayList로 변환
//        ArrayList<Student> sList = new ArrayList<>(); //컬렉션
//        for (Student student : sArray) {//(클래스타입)변수 : 배열(반복대상)
//            sList.add(student); //arr에 집어넣어라
//        }
//        showStudents("sno 정렬전", sArray); //showstudent라는 함수를 만들어라(파라미터2개)
//        //문제1: Arrays.sort()를 사용한 sArray 정렬 - sno 사용, 익명클래스 사용
//        //Arrays.sort(sArray);
//        Arrays.sort(sArray, compSno);
//        showStudents("sno 정렬후", sArray);
//        
//        showStudents("sname 정렬전", sArray);
//        //문제2: Arrays.sort()를 사용한 sArray 정렬 - sname 사용, 익명 객체 사용
//        Comparator<Student> sname=sname();
//        Arrays.sort (sArray,sname);
//        showStudents("sname 정렬후", sArray);
//        
//	}
//
//}

package com.ruby.java.ch08.polymorphism;



public class MyLinkedList {

	
	private Node head = null; //head 필드와 내부 클래스 Node를 모두 private로 선언하여 외부에서 직접 접근하지 못하게 함
	
	private class Node{ //내부 클래스 Node 선언
		private String data; //data, link 필드 선언
		private Node link;
		
		public Node(String data) { //Node(String)생성자 선언
			this.data = data;
			
		}
	}
	public void add(String data) { //실행할때마다 내부 클래스 Node의 인스턴스 생성
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}else {
			Node next = head;
			while(next .link != null) {
				next = next.link;
			}
			next.link = newNode;
		}
	}
	
	public void print() { //인스턴스의 내부 객체인 Node의 data값 모두 출력
		if(head == null) {
			System.out.println("등록된 데이터 없음");
		}else {
			System.out.println("등록된 데이터는 다음과 같음");
			Node next = head;
			while(next != null) {
				System.out.println(next.data);
				next  = next.link;
			}
		}

	}
	
	public static void main(String[] args) {
		MyLinkedList myList = new MyLinkedList();
		myList.print();
		
		myList.add("JAVA");
		myList.add("JSP");
		myList.add("Servlet");
		myList.print();
		
		myList.printReverse(); //Q.뒤에서부터 앞으로 출력해보기(양방향 링크드리스트) private Node tail = null; 있어야함
}

	private void printReverse() {
		System.out.println("-".repeat(40));
		System.out.println("이번에는 거꾸로 출력");
		System.out.println("-".repeat(40));
		// TODO Auto-generated method stub
		
	}

}


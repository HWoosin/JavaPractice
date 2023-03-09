package oop.inter.basic;

/*
 * 1. 인터페이스를 작성한 후에는 클래스를 생성해서
 * 인터페이스에 명세된 내용을 구현하면된다.
 * 
 * 2. 인터페이스의 구현 키워드는 implements
 * 	상속과 같이 클래스 이름 뒤에 구현하고자 하는 인터페이스 이름을 작성.
 * 
 * 3. 인터페이스에 선언된 추상 메서드는 반드시 구현 클래스에서 오버라이딩 진행.
 * 
 * 4. 인터페이스는 하나의 클래스에서 여러 개의 인터페이스를 동시에 다중 구현 가능.
 */

public class ImplClass1 implements Inter, Inter2 {

	@Override
	public void method1() {
		System.out.println("Inter의 추상메서드 구현!");
	}

	@Override
	public void method2() {
		System.out.println("Inter2의 추상메서드 구현!");
		
	}
	
	public void method3() {
		System.out.println("ImplClass1의 메서드 구현!");
	}

	@Override
	public void parentMethod() {
		System.out.println("ParentInter의 메서드 구현!");
		
	}

	
}

package oop.poly.casting;

public class MainClass {
	
	public static void main(String[] args) {

		Parent p = new Parent();
		p.n1 = 1;
//		p.n2 = 2; (x) 상속은 역전이 일어날 수 없다.
		
		p.method1();
		p.method2();
		
//		p.method3();(x) 자식의 메소드
		
		System.out.println("=============================");
		
		Child c = new Child();
		c.n1 = 1; //상속받은거
		c.n2 = 2; //원래 자기가 가지고 있는거
		
		c.method1();
		c.method2();
		c.method3();
		
		System.out.println("=============================");
		//다형성 적용(promotion)
		Parent p2 = new Child();
		p2.n1 = 1;
//		p2.n2 = 2;(x)
		
		p2.method1();//자식객체 이므로 오버라이딩된 메소드 호출
		p2.method2();
//		p2.method3();(x)
		//객체의 접근을 부모로 접근했음
		
		/*
		 * 다형성이 적용되면 자식 클래스의 본래멤버(필드, 메서드)를 참조하지 못하는 문제가 발생
		 * 이를 해결하기 위해 강제 타입변환 사용.
		 */
		
		Child c2 = (Child) p2; //부모 타입을 자식타입으로 강제 변환(DownCasting)
		c2.n2 =2;
		c2.method3();
		System.out.println("p2의 주소값: " + p2);
		System.out.println("c2의 주소값: " + c2);
		

		//다형성이 한번도 발생하지 않은 경우에는
		//강제 형 변환을 사용할 수 없다.
		Parent ppp = new Parent();
//		Child c3 = (Child) ppp; (x) 자식타입의 부모객체는 만들어 질수 없다.
	}

}




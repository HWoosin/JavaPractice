package oop.modi.member.pac1;

public class B {
	
	public B() {
		
		A a = new A();
		a.x = 1;
		a.y = 2;
//		a.z = 3; (x) private으로 가려놨음
		
		a.method1();
		a.method2();
//		a.method3(); (x) private
	}

}

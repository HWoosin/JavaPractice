package oop.modi.cls.pac1;

//public 제한자는 접근 제한 자체가 없는 형태 (어디서나 사용가능)
public class B {
	
	//클래스 A의 접근 제한자는 default이기 때문에 동일 패키지 내부의
	//클래스에서 접근이 가능
	A a = new A();

}

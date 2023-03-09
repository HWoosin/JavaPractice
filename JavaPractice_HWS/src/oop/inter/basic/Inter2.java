package oop.inter.basic;

//클래스가 상속 가능한 것처럼 인터페이스도 extends를 사용하여
//인터페이스 간의 상속을 구현할 수 있다.
//다중 상속가능
public interface Inter2 extends ParentInter{

	int I = 5;//상수 static final
	
	void method2(); //abstract
}

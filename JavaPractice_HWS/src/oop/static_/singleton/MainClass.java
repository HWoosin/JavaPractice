package oop.static_.singleton;

public class MainClass {

	public static void main(String[] args) {

//		Singleton s1 = new Singleton(); //생성자를 private로 제한
//		s1.method1();
//		s1.method2();
		
//		Singleton s1 = Singleton.s;
//		Singleton.s =null;
		
		Singleton s1 = Singleton.getInstance();
		s1.method1();
		s1.method2();
		
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		Singleton s4 = Singleton.getInstance();
		Singleton s5 = Singleton.getInstance();
		Singleton s6 = Singleton.getInstance();
		
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);//주소가 동일하다 = 하나의 객체를 돌려쓰고있다.

	}
}

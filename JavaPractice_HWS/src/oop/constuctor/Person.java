package oop.constuctor;

public class Person {

	String name;
	int age;
	int tall;
	
	Person(){}
	
	Person(String pName, int pAge, int pTall){
		name = pName;
		age = pAge;
		tall = pTall;
	}
	
	void info() {
		System.out.println("이름이?" + name);
		System.out.println("나이가?" + age);
		System.out.println("키가?" + tall);
		System.out.println();
	}
	
}

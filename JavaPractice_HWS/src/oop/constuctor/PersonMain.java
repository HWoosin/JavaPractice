package oop.constuctor;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {

		/*
		 Scanner를 이용해서 사용자에게 
		 이름, 나이, 키를 입력받아서
		 해당 정보를 저장하는 객체를 디자인하고
		 객체 내에는 해당 사람의 정보를 모두 출력 해주는 info()메서드 존재.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = sc.next();
		
		System.out.print("나이: ");
		int age =sc.nextInt();
		
		System.out.print("키: ");
		int tall = sc.nextInt();
		
		System.out.println();
		
		Person woosin = new Person(name, age, tall);
		woosin.info();
		
		Person gildong = new Person("홍길동",30,180);
		gildong.info();
		
		sc.close();
	}
}

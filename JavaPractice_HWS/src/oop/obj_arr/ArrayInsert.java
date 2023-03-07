package oop.obj_arr;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Person[] people = new Person[3];
		
		for(int i=0; i<people.length; i++) {
			System.out.print("이름은? ");
			String name = sc.next();
			System.out.print("나이는? ");
			int age = sc.nextInt();
			System.out.print("성별은? ");
			String gender = sc.next();
			System.out.println();
			
			Person p = new Person(name,age,gender);
			people[i]=p;
//			people[i] = new Person(name,age,gender);
		} //입력반복문 끝
		
		//System.out.println(Arrays.toString(people));
		
		for(Person p : people) {
			p.personInfo();
			System.out.println();
		}
		
		sc.close();
	}

}

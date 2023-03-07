package oop.obj_arr;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {

//		Person hong = new Person("홍길동", 32, "남자");
//		Person lee = new Person("이묘행", 55, "여자");
//		Person kim = new Person("김길규", 12, "남자");
//		
//		hong.personInfo();
//		lee.personInfo();
//		kim.personInfo();
		
//		int[] arr = new int[5];
//		int[] arr = {1,2,3,4,5};
		//객체배열도 똑같이 타입과 이름을 줄수있다
//		Person[] people = new Person[3];
//		people[0] = new Person("홍길동",32,"남자");
		
		Person[] people = {
				new Person("홍길동", 32, "남자"),
				new Person("이묘행", 55, "여자"),
				new Person("김길규", 12, "남자")
		};
		
		//System.out.println(Arrays.toString(people));
		
//		people[0].personInfo();
//		people[1].personInfo();
//		people[2].personInfo();
		
		for(int i=0; i<people.length; i++) {
			people[i].personInfo();
			System.out.println();
		}
		
//		for(Person p :people) {//foreach
//			p.personInfo();
//			System.out.println();
//		}
	}

}









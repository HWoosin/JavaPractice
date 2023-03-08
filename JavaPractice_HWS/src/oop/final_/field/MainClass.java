package oop.final_.field;

public class MainClass {

	public static void main(String[] args) {

		Person kim = new Person("감철소");
//		kim.nation ="미국"; (x) 값이 할당될 수 없음
//		kim.name = "감매이클"; (x)
		kim.age = 30;
		
		Person park = new Person("바경히");
//		park.nation = "영국" (x)
//		park.name = "바경국";
		
		System.out.println(kim.name);
	}

}

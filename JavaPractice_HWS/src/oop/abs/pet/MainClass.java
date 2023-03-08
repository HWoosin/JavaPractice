package oop.abs.pet;

public class MainClass {

	public static void main(String[] args) {

		Pet dog = new Dog("발발이","똥개",3);
		Pet cat = new Cat("애옹이","러시안블루",2);
		
		dog.feed();
		dog.takeNap();
		
		System.out.println("==============================");
		
		cat.feed();
		cat.takeNap();
	}

}

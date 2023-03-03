package oop.constuctor;

public class Bread {
	int price;
	String name;
	String ingredient;
	
	
	Bread(){
		System.out.println("우리 매장의 기본 빵!");
	}
	
	Bread(int bPrice, String bName, String bIngre){
		System.out.println("커스텀 빵!");
		price = bPrice;
		name = bName;
		ingredient = bIngre;
	}
	
	void info() {
		System.out.println("빵 이름: "+ name);
		System.out.println("빵 가격: "+ price);
		System.out.println("주 재료: "+ ingredient);
	}

}

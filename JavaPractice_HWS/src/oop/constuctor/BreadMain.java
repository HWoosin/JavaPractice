package oop.constuctor;

public class BreadMain {

	
	public static void main(String[] args) {

		/*
		 * 객체를 생성하지 않았을때의 예시를 보고
		 * 빵 객체를 생성할 수 있는 클래스(설계도)를 작성.
		 * 클래스 이름은 Bread로 통일.
		 * 
		 * BreadMain에서 똑같이 피자빵, 초코케이크의 정보를 호출
		 */
		
		Bread pizBread = new Bread();
		pizBread.name ="피자빵";
		pizBread.price = 500;
		pizBread.ingredient ="치즈";
		pizBread.info();
		
		System.out.println();
		
		Bread choCake = new Bread(1500,"초코케이크","초콜렛");
		choCake.info();
	}

}

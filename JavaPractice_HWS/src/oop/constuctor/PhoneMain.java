package oop.constuctor;

public class PhoneMain {

	public static void main(String[] args) {

		Phone basic = new Phone();
		/*
		basic.model="폴더폰";
		basic.color="회색";
		basic.price=200000;
		basic.showSpec();
		*/
		basic.showSpec();
		System.out.println();
		
		Phone basic2 = new Phone();
		basic2.showSpec();
		System.out.println();

		Phone galaxy23 = new Phone("galaxy23");
		galaxy23.showSpec();
		System.out.println();
		
		Phone iPhone14 = new Phone("iPhone14","스페이스 그레이");
		//iPhone14.color = "스페이스 그레이";
		iPhone14.showSpec();
		
	}

}

package oop.poly.car;

public class MainClass {

	public static void main(String[] args) {
		

		Sonata s1 = new Sonata();
		Sonata s2 = new Sonata();
		Sonata s3 = new Sonata();
		
		Porsche p1 = new Porsche();
		Porsche p2 = new Porsche();
		Porsche p3 = new Porsche();
		
		Tesla t1 = new Tesla();
		Tesla t2 = new Tesla();
		Tesla t3 = new Tesla();
		Tesla t4 = new Tesla();
		
		/*
		Sonata[] sonatas = {s1,s2,s3};
		for(Sonata s : sonatas) {
			s.run();
		}
		
		Tesla [] teslas = {t1,t2,t3,t4};
		for(Tesla t : teslas) {
			t.run();
		}
		*/
		
		//다형성을 적용해서 이종모음 배열을 선언할 수 있다.
		Car[] cars = {s1,s2,s3,p1,p2,p3,t1,t2,t3,t4};
		for(Car c : cars) {
			c.run();
		}	
		
		System.out.println("================================");
		
		System.out.println("*** 타이어 교체 ***");
		t1.frontL = new HTire();
		t1.frontR = new HTire();
		t1.rearL = new HTire();
		t1.rearR = new HTire();
		
		System.out.println("================================");
		
		Driver kim = new Driver();
		kim.drive(p1);
		kim.drive(s1);
		kim.drive(t1);
		
		System.out.println("================================");

		Car t5 = kim.buyCar("테슬라"); //부모인 Car 타입으로 받아야함
		Tesla t6 = (Tesla) kim.buyCar("테슬라"); //또는 캐스팅 연산자로 tesla 주어서 맞춰준다.
		
		System.out.println("================================");

		Car c = kim.buyCar("테슬라");
		c.run();
		Tesla t7 = (Tesla) c;
		t7.enterMembership();
		
		System.out.println("================================");

		CarShop shop = new CarShop();
		shop.carPrice(s3);
		shop.carPrice(new Tesla());
		shop.carPrice(kim.buyCar("포르쉐"));
	}

}















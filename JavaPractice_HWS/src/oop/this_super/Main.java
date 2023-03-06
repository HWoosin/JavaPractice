package oop.this_super;

public class Main {

	public static void main(String[] args) {

		Player p1 = new Player();
		p1.name = "전사1";
		//System.out.println("p1의 주소값: "+p1);
		p1.charactorInfo();
		
		System.out.println("=======================================");
		
		Player p2 = new Player("전사2");
		//System.out.println("p2의 주소값: "+p2);
		p2.charactorInfo();
		
		System.out.println("=======================================");
		
		Player p3 = new Player("전사3", 200);
		p3.charactorInfo();
		
		System.out.println("=======================================");

		p3.attack(p2);
		p1.attack(p2);
		p2.attack(p2);
		
		System.out.println("=======================================");
		
		Warrior w1 = new Warrior("전사짱짱맨");
		w1.charactorInfo();
		
		Mage m1 = new Mage("뾰로롱마법사");
		m1.charactorInfo();
		
		Hunter h1 = new Hunter("헤드헌터");
		h1.charactorInfo();
		
		
	}

}

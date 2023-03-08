package oop.poly.player;

public class MainClass {

	public static void main(String[] args) {

		Warrior w1 = new Warrior("Zl존");
		Warrior w2 = new Warrior("하힣흐흐히하허호");//체력 50
		Mage m1 = new Mage("마법의성");//체력 50
		Hunter h1 = new Hunter("개장수");//체력 50
		System.out.println("=============입장==============");
		
		w1.rush(w2);//-10
		w1.rush(m1);//-20
		w1.rush(h1);//-15
		
		
	}

}

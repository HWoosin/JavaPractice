package oop.inherit.good;

public class MainClass {

	public static void main(String[] args) {

		Warrior w1 = new Warrior();
		
		w1.name = "woosin";
		w1.level = 26;
		w1.atk = 3;
		w1.hp = 50;
		w1.rage = 60;
		w1.charactorInfo();
		
		Mage m1 = new Mage();
		
		m1.name = "Dooli";
		m1.level = 10;
		m1.atk = 1;
		m1.hp = 30;
		m1.mana = 10;
		m1.charactorInfo();
		
		Hunter h1 = new Hunter();
		
		h1.name = "Gildong";
		h1.level = 30;
		h1.atk = 5;
		h1.hp = 60;
		h1.pet = "발발이";
		h1.charactorInfo();
	}

}

package oop.inherit.good;

public class Mage extends Player {

	int mana;

	@Override
	void charactorInfo() {
		super.charactorInfo();
		System.out.println("정신력: "+mana);
	}
	
	
}

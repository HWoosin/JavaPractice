package oop.inherit.good;

public class Hunter extends Player{
	
	String pet;

	@Override
	void charactorInfo() {
		super.charactorInfo();
		System.out.println("펫: "+ pet);
	}
	
	

}

package oop.poly.player;

public class Hunter extends Player{
	
	String pet;
	
	Hunter(String name){
		super(name);
		this.pet ="핑핑이";
		
	}

	@Override
	void charactorInfo() {
		super.charactorInfo();
		System.out.println("펫: "+ pet);
	}
	
	

}

package oop.this_super;

public class Warrior extends Player{

	int rage;

	Warrior(String name){
		//모든 생성자에는 super()가 내장되어있다.
		//자식 객체가 생성 될 때는 부모의 객체도 생성이 되어야
		//부모 속성과 기능이 실존, 물려 줄 수가 있다.
		super(name);
//		this.name = name;
		this.rage = 60;
	}
	
	@Override
	void charactorInfo() {
		super.charactorInfo();
		System.out.println("분노게이지: " + rage);
	}
	

	

}

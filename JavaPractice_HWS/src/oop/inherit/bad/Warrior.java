package oop.inherit.bad;

public class Warrior {

	String name;
	int level;
	int atk;
	int hp;
	int rage;
	
	void charactorInfo() {
		System.out.println("*** 캐릭터 소개 ***");
		System.out.println("아이디: "+name);
		System.out.println("레벨: "+level);
		System.out.println("공격력: "+atk);
		System.out.println("체력: "+hp);
		System.out.println("분노게이지: "+rage);
	}
}

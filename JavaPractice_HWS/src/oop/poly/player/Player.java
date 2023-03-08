package oop.poly.player;

public class Player {
	String name;
	int level;
	int atk;
	int hp;
	
	Player(){
		//System.out.println("Player의 기본생성자 호출");
		//System.out.println("this의 주소값: "+ this);
		
		level = 1;
		atk = 3;
		hp =50;
	}
	Player(String name){
		this();
		System.out.printf(name+"(이)가 소환되었습니다.\n");
		this.name = name;
		
	}
	Player(String name, int hp){
		this(name);
		System.out.println("Player의 3번 생성자 호출");
		this.hp = hp;
	}
	
	void attack(Player target) {
		
		if(this == target) {
			System.out.println("스스로는 때릴수 없다.");
			return;
		}
		//x가 y를 공격
		System.out.printf("%s가 %s를 공격합니다.\n",this.name,target.name);
		target.hp -= 10;
		this.hp += 5;
		System.out.printf("나의 체력: %d, 상대방 체력: %d\n", this.hp, target.hp);
	}
	
	void charactorInfo() {
		System.out.println("*** 캐릭터 소개 ***");
		System.out.println("아이디: "+name);
		System.out.println("레벨: "+level);
		System.out.println("공격력: "+atk);
		System.out.println("체력: "+hp);

	}

}

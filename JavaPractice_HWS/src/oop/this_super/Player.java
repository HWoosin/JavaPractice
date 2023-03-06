package oop.this_super;

public class Player {
	String name;
	int level;
	int atk;
	int hp;
	
	/*
	 * this
	 * 
	 * this란 자기 자신 객체를 가리키는 키워드
	 * 생성자 또는 메서드 내에서 this를 사용하면 this는 
	 * 그 생성자 또는 메서드를 호출한 객체의 주소값을 띄게된다.
	 * this()를 사용해서 같은 클래스 내의 다른 생성자를 호출 할 수도 있다.
	 * 이 때는 매개변수의 선언에 따라 괄호 내에 적절한 값을 전달하면 된다.
	 */
	
	Player(){
		System.out.println("Player의 기본생성자 호출");
		//System.out.println("this의 주소값: "+ this);
		
		level = 1;
		atk = 3;
		hp =50;
	}
	Player(String name){
		this(); // 같은 클래스의 다른 생성자를 부르는 문법.
		System.out.println("Player의 2번 생성자 호출");
		//System.out.println("this의 주소값: "+ this);
		this.name = name;
//		level = 1;
//		atk = 3;
//		hp =50;
		
	}
	Player(String name, int hp){
		this(name); //다른 생성자의 호출은 생성자 내에서 최상단에 위치해야 한다.
		System.out.println("Player의 3번 생성자 호출");
		//this.name = name;
		this.hp = hp;
	}
	
	void attack(Player target) {
		
		//System.out.println("target: "+target);
		//System.out.println("this: "+this);
		
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
		//System.out.println("지금 이 메서드를 호출한 객체의 이름: "+this.name);
	}

}

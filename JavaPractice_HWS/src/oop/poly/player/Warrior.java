package oop.poly.player;

public class Warrior extends Player{

	int rage;

	Warrior(String name){
		super(name);
		this.rage = 60;
	}
	
	public void rush(Player p) {
		/*
		 * 전사의 고유기능인 rush메서드 작성
		 * rush의 대상은 모든 직업들.
		 * 만약 rush의 대상이 전사라면 10의피해,
		 * 마법사라면 20의 피해, 사냥꾼이라면 15의 피해를 받는다.
		 * 서로 다른 데미지를 instanceof를 사용하여 구분해서 적용.
		 * 남은 체력 출력.
		 * main에서 객체를 생성한 후 호출해서 적용확인
		 */
	
		if(p instanceof Warrior) {
			p.hp-=10;
			System.out.println(this.name+"(이)가 "+p.name+" 공격!");
			System.out.printf("%s의 체력 %d\n",p.name,p.hp);
		}
		else if(p instanceof Mage) {
			p.hp-=20;
			System.out.println(this.name+"(이)가 "+p.name+" 공격!");

			System.out.printf("%s의 체력 %d\n",p.name,p.hp);
		}
		else if(p instanceof Hunter) {
			p.hp-=15;
			System.out.println(this.name+"(이)가 "+p.name+" 공격!");
			System.out.printf("%s의 체력 %d\n",p.name,p.hp);
		}
		else {
			System.out.println("없는 직업");
		}
		
	}
	
	@Override
	void charactorInfo() {
		super.charactorInfo();
		System.out.println("분노게이지: " + rage);
	}
	

	

}

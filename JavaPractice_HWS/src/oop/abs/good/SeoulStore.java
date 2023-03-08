package oop.abs.good;

public class SeoulStore extends HeadStore {

	//무조건 오버라이딩 해야만 하는 메소드 등장
	@Override
	public void orderApple() {
		System.out.println("사과쥬스의 가격은 3000원");
	}

	@Override
	public void orderBanana() {
		System.out.println("바나나쥬스의 가격은 3500원");
		
	}

	@Override
	public void orderGrape() {
		System.out.println("포도쥬스의 가격은 2500원");
		
	}
	

}

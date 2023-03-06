package oop.encap.good;

public class MyBirth {
	
	/*
	 * 캡슐화(은닉): 데이터 보호의 목적으로 사용하는 OOP기술 중 하나.
	 * 
	 * 외부에서 직접 변수에 접근할 수 없도록 멤버변수에 private 제한을 붙임.
	 */
	
	private int year;
	private int month;
	private int date;
	
	/*
	 * 캡슐화는 데이터에 접근 제한을 걸러서 정보를 보호하는 것이 목적이지만
	 * private을 설정하면 데이터 접근 자체가 불가능.
	 * 
	 * 따라서 데이터의 유효성을 검증할수있는 제어분이 포함된 메서드를 사용하여 데이터의 접근을 허용하도록 설계,
	 * 이 때 사용하는 메서드를 getter / setter 메서드라고 부른다.
	 * 
	 * setter
	 * 1. 숨겨진 변수에 값을 저장하기 위한 메서드.
	 * 2. 메서드 내부에 데이터 유효성 검증 로직을 작성하여 적절한 데이터만
	 * 	멤버변수에 저장시키고, 접근제한자는 public으로 설정하여 외부에서 누구나 사용할 수 있게 합니다.
	 * 3. 메서드 이름은 일반적으로 set + 멤버변수이름 으로 설정.
	 */
	
	public void setYear(int year) {
		if(year < 1900 || year > 2023) {
			System.out.println("잘못된 연도 입력입니다.");
		}
		else {
			this.year= year;
		}
	}
	
	public void setMonth(int month) {
		if(month < 1 || month > 12 ) {
			System.out.println("잘못된 월 입력입니다.");
		}
		else {
			this.month= month;
		}
	}
	
	public void setDate(int date) {
		if(date < 1 || date > 31) {
			System.out.println("잘못된 일 입력입니다.");
		}
		else {
			this.date=date;
		}
	}
	
	/*
	 * getter
	 * 1. 숨겨진 변수의 값을 참조할 때 사용하는 메서드
	 * 2. setter와 마찬가지로 public 제한을 통해 외부에 메서드를 공개하고,
	 * 	이름은 일반적으로 get + 멤버변수이름 으로 설정
	 */
	
	public int getYear(String pw) {
		if(pw.equals("abc1234")) {
			return this.year;
		}
		else {
			System.out.println("잘못된 비밀번호");
			return 0;
		}
	}
	
	public int getMonth() {
		return this.month;
	}
	public int getDate() {
		return this.date;
	}
	

}





















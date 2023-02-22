package basic.operator;


public class ConditionalOperator {

	public static void main(String[] args) {

		/*
		 * 3항 연산자
		 * 피 연산자(연산을 당하는 값)가 3개인 연산자를 말한다.
		 * (조건식 ? 좌항 : 우항);
		 * 조건식을 비교하여 true일 경우에느 좌항이,
		 * false일 경우에는 우항의 값이 도출된다.
		 */
		
		int x =10, y = 20;
		
		String result = (x < y ? "x는 y보다 크다" : "x는 y보다 작다.");
		System.out.println(result);
		
		//난수를 발생시키는 메서드 Math.random();
		//0.0이상 1.0미만의 실수 난수값을 반환.
//		double rn = Math.random();
//		System.out.println(rn);
		
		//1~10까지의 정수 난수를 발생시키기
		int rn = (int) ((Math.random()*10)+1);
		System.out.println(rn);
		
		//10부터 100까지 정수 난수를 발생
		int rn2 = (int) ((Math.random()*91)+10);
		System.out.println(rn2);
		
		//34부터 176
		int rn3 = (int) ((Math.random()*143)+34);
		System.out.println(rn3);
	}

}

package basic.switch_;

import java.util.Scanner;

public class SwitchExample1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("성별을 입력하세요.(m/f)");
		System.out.print(">>> ");
		String gen = sc.next();
		
		/*
		 * switch 키워드 뒤에 나오는 괄화는 boolean형 조건식이 아닌 
		 * 변수나, 변수의 연산식을 적어야 하며, 타입은 정수, 문자열만 가능.
		 */
		
		switch(gen){
		
		case "m" :
			System.out.println("남자");
			break; // 해당 case만 실행하고 switch문을 종료해라!
		
		case "f" :
			System.out.println("여자");
		}
		
		sc.close();
	}

}

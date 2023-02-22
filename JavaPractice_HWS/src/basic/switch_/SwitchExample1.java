package basic.switch_;

import java.util.Scanner;

public class SwitchExample1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("성별을 입력하세요.(M/F)");
		System.out.print(">>> ");
		String gen = sc.next();
		
		/*
		 * switch 키워드 뒤에 나오는 괄화는 boolean형 조건식이 아닌 
		 * 변수나, 변수의 연산식을 적어야 하며, 타입은 정수, 문자열만 가능.
		 */
		
		switch(gen){
		
		/*
		 * switch 괄호 안에 지정한 기준 값에 따라
		 * 만족하는 case문을 순서대로 탐색.
		 * 적합한 case가 존재하는 경우에 해당 case에 종속된 문장 실행.
		 * 따로 조치가 없다면 나머지 케이스들이 연속적으로 실행.
		 */
		
		case "m": case "ㅡ":
		
		case "M" :
			System.out.println("남자");
			break; // 해당 case만 실행하고 switch문을 종료해라!
		
		case "f": case "ㄹ":
			
		case "F" :
			System.out.println("여자");
			break;
			
		default: //case를 설정하지 않은 값들은 모두 default로 온다.
			System.out.println("잘못된 입력입니다.");
			
		}
		
		sc.close();
	}

}

package basic.switch_;

import java.util.Scanner;

public class SwitchQuiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 수: ");
		int num1 = sc.nextInt();
		System.out.print("연산을 선택하세요 [+, -, *, /]: ");
		String Opr = sc.next();
		System.out.print("두번째 수: ");
		int num2 = sc.nextInt();

		double result = 0;
		boolean flag = false;

		switch (Opr) {

		case "+" :
			result= num1 + num2;
			//System.out.printf("결과: %.1f", result);
			break;
		case "-" :
			result= num1 - num2;
			//System.out.printf("결과: %.1f", result);
			break;
		case "*" :
			result= num1 * num2;
			//System.out.printf("결과: %.1f", result);
			break;
		case "/" :
			if(num2 == 0) {
				System.out.println("연산할 수 없는 입력값.");
				flag = true;
				break;
			}
			result= (double) num1 / num2;
			//System.out.printf("결과: %.1f", result);
			break;

		default:
			System.out.println("사칙연산문자 입력이 잘못되었습니다.");
			System.out.print("[+, -, *, /]");
			flag = true;
			break;

		}

		if(!flag) { // not flag? flag 가 false냐? 
			System.out.printf("결과: %.1f", result);
		}
		sc.close();

	}
}

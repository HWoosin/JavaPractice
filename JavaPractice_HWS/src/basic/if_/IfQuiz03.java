package basic.if_;

import java.util.Scanner;

public class IfQuiz03 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		if(num == 0) { //if(num % 7 == 0 && num != 0)->7의배수이고 0이 아닌것만 골라냄 "7의 배수입니다."
			System.out.println("0입니다.");
		}
		else if(num % 7 != 0) {
			System.out.println("7의 배수가 아닙니다");
		}
		else {
			System.out.println("7의 배수 입니다.");
		}
		
		sc.close();
	}

}

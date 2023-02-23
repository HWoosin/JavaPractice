package basic.loop;

import java.util.Scanner;

public class WhileQuiz01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("단수를 입력하세요: ");
		int dan = sc.nextInt(); //입력 단
		
		System.out.printf("*** 구구단 %d 단 ***\n", dan);
		
		int mul = 1; // 곱하는 수
		while(mul<=9) { // 9까지 곱함
			
			System.out.printf("%d X %d = %d\n",dan, mul, dan * mul); 
			
			mul++;
		}
		
		sc.close();
	}

}

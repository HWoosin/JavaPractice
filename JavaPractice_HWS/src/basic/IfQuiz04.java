package basic;

import java.util.Scanner;

public class IfQuiz04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 숫자: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int num2 = sc.nextInt();
		System.out.print("세번째 숫자: ");
		int num3 = sc.nextInt();

		int max ,mid, min;

		if(num1 > num2 && num1 > num3) { //num1이 max
			max = num1;

			if(num2>num3) { //mid min정하기
				mid = num2;
				min = num3;
			}
			else {
				mid =num3;
				min = num2;
			}
		}
		else if(num2 > num1 && num2 > num3) { // num2가 max
			max = num2;

			if(num1>num3) { //mid min 정하기
				mid = num1;
				min = num3;
			}
			else {
				mid =num3;
				min = num1;
			}
		}
		else { // num3가 max
			max = num3;
			
			if (num1>num2) { // mid min 정하기
				mid =num1;
				min = num2;
			}
			else {
				mid = num2;
				min = num1;
			}
		}


		System.out.println("max: "+ max);
		System.out.println("mid: "+ mid);
		System.out.println("min: "+ min);
		
		sc.close();
	}

}

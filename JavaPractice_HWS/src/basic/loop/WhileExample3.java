package basic.loop;

import java.util.Scanner;

public class WhileExample3 {
	
	public static void main(String[] args) {

		/*
		 * 정수 1개를 입력받아서 해당 정수가 소수(prime number)
		 * 인지를 판별하기.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요:");
		int num = sc.nextInt();
		
		
		int i = 1;
		int c = 0;
		while(i <= num) {
			if(num % i == 0) {
				c++;
			}
			i++;
		}
		if(c== 2) {
			System.out.printf("%d-> 소수 입니다.\n", num);
		}
		else
			System.out.printf("%d-> 소수가 아닙니다.\n", num);
		
		//sc.close();

		// total이 num +1 인 경우
		System.out.println("약수 갯수가 아닌 약수 합이 num + 1도 약수임ㅋ");
		
		int j = 1;
		int total = 0;
		while(j <= num) {
			if(num % j == 0) {
				total += j;
			}
			j++;
		}
		if(total == num +1) {
			System.out.printf("%d-> 소수 입니다.", num);
		}
		else
			System.out.printf("%d-> 소수가 아닙니다.", num);
		
		sc.close();
	}
}

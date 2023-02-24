package basic.if_;

import java.util.Scanner;

public class IfExample3 {

	public static void main(String[] args) {

		/*
		 * if의 중첩문
		 * else if문이 첫번쨰 조건식이 false일 경우 분기를 나눴다면
		 * if의 중첩문은 첫번째 조건식이 true인 경우 분기를 나누는 방식이다.
		  
		 * 변수의 유효범위
		 * 변수는 선언된 블록 내에서만 유효하다.
		 * 선언된 블록을 벗어나면 메모리에서 자동으로 소멸한다.
		 * 변수를 선언할 때 사용 범의를 잘 파악해서 전체적으로 사용할 변수라면 미리선언해두고,
		 * 지역적으로 사용할 변수는 그 블록 범위 내에서만 사용하고 소멸시키는 것이 좋다.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("키: ");
		int tall = sc.nextInt();
		
		if(tall >= 140) {
			
			System.out.print("나이:");
			int age = sc.nextInt();

			if(age >= 8) {
				System.out.println("놀이기구 탑승이 가능합니다.");
			}
			else if(age >=6) {
				System.out.println("보호자 동반 시 탑승이 가능합니다.");
			}
			else {
				System.out.println("나이가 6세 미만입니다.");
				System.out.println("놀이기구 탑승이 불가능합니다.");
			}
		}
		else {
			System.out.println("키가 140미만입니다.");
			System.out.println("놀이기구 탑승이 불가능합니다.");
		}

		sc.close();
	}

}

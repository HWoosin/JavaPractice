package basic;

import java.util.Scanner;

public class IfQuiz01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("키:");
		int tall = sc.nextInt();
		
		System.out.print("나이:");
		int age = sc.nextInt();
		
		if(tall >= 140 && age >= 8) {
			System.out.println("탑승이 가능합니다.");
		}
		else {
			System.out.println("탑승 불가능.");
		}
		
		System.out.println("오늘 하루 즐거운 시간 되세요!");
		
		sc.close();
	}

}

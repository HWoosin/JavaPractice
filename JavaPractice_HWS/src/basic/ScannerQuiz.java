package basic;

import java.util.Scanner;

public class ScannerQuiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("이름을 입력하세요: ");
		String name = sc.next();
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		System.out.println();
		
		
		
		System.out.printf("이름: %s\n", name);
		System.out.printf("나이: %d세\n", age);
		
		
		System.out.println("출생년도: " + (2023 - age) + "년");
		
		sc.close();
		
	}

}

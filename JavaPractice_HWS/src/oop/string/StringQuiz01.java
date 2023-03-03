package oop.string;

import java.util.Scanner;

public class StringQuiz01 {

	public static void main(String[] args) {

		/*
		 1. 스캐너를 통해 id를 입력
		 2. 말썽꾸러기 사용자는 id에 공백을 입력할 확률이 굉장히 높다.
		 3. 공백을 제거한 아이디가 5글자 미만이라면 다시 입력받으세요.
		 4. 5글자 이상 입력되었다면 "id가 등록되었습니다." 출력 후 종료
		 */
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("ID: ");
			String ID = sc.nextLine();
			
			//ID = ID.trim();
			ID = ID.replace(" ","");
			
			if(ID.length()<5) {
				System.out.println("다시 입력하세요.");
				continue;
			}
			else {
				System.out.println("당신의 ID: <"+ ID + ">");
				System.out.println("ID가 등록되었습니다.");
				break;
			}
		}
		
	}

}

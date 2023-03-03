package oop.string;

import java.util.Scanner;

public class StringQuiz02 {

	public static void main(String[] args) {

		/*
		 1. 주민등록번호 13자리 임력받기.
		 2. 주민등록번호는 -을 포함해서 받을예정.
		 3. 13자리가 아니라면 다시 입력.
		 4. 남자인지 여자인지 구분해서 출력
		 */

		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("주민등록번호를 입력해주세요(-포함) ");
			System.out.print(">");
			String cert = sc.next();

			cert = cert.replace("-","");
			System.out.println(cert);
			//System.out.println(g);

			if(cert.length()!=13) {
				System.out.println("13자리를 정확히 입력해주세요.");
				continue;
			}
			else {
				char g = cert.charAt(6);
				if(g =='1' || g =='3') {
					System.out.println("남");
					break;
				}
				else if(g=='2' || g=='4') {
					System.out.println("여");
					break;
				}
				else {
					System.out.println("잘못된 입력.");
				}
				/*
				switch(g) {

				case '1': case '3':
					System.out.println("남");
					break;
				case '2': case '4':
					System.out.println("여");
					break;
				default:
					System.out.println("잘못된 입력.");
					}
				 */

			}
		}
		sc.close();
	}

}



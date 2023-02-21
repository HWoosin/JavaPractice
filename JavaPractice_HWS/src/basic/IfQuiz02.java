package basic;

import java.util.Scanner;

public class IfQuiz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력해주세요:");
		int x = sc.nextInt();
		System.out.print("두번째 정수를 입력해주세요:");
		int y = sc.nextInt();
		
		System.out.printf("입력받은수 %d, %d ->",x,y);
		
		if(x>y) {
			System.out.printf("%d가 큰수입니다.\n",x);
		}
		else if(y>x) {
			System.out.printf("%d가 큰수입니다.\n",y);
		}
		else {
			System.out.println("같은 수 입니다.");
		}
		
		sc.close();
	}

}

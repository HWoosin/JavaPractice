package basic.loop;

import java.util.Scanner;

public class WhileQuiz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int x = sc.nextInt();
		
		int i = 1;
		int total = 0;
		while(i<= x) {
			
			if(x % i == 0) { //i로 나눠서 나머지가 0이면 i는 x의 약수라는것 //그것을 total에 누적
				total +=i;
			}
			i++;
		}
		System.out.printf("입력받은 값: %d, 약수의 합-> %d", x, total);
			
		sc.close();
	}

}

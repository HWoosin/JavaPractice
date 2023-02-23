package basic.loop;

import java.util.Scanner;

public class LoopNesting2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("입력받은 수: ");
		int num = sc.nextInt();

		System.out.print("소수: ");

		int i;
		int count=0;// 소수 갯수 카운트
		
		for(i = 2; i <= num; i++) {// i부터 num 까지의 수 모두 검색
			int c=0; // 소수가 맞는지 확인하기위한 카운트 약수가 2개여야한다.
			for(int j = 1; j<= i; j++) {//i를 j로 나눠서 약수 갯수확인 
				if(i % j == 0) {				
					c++;
				}

			}
			if(c==2) {
				System.out.printf("%d ",i);
				count++;

			}
		}
		System.out.println();

		System.out.printf("소수갯수: %d", count);

		sc.close();
	}
}

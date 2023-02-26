package basic.loop;

import java.util.Scanner;

public class LoopNesting2 {

	public static void main(String[] args) {

		/*
        - 정수를 하나 입력받아서 해당 숫자까지의 모든 소수를
         가로로 출력하고, 그 소수들의 개수를 구하는 로직을 작성합니다.

        ex)
        입력받은 수 -> 30
        소수: 2 3 5 7 11 13 17 19 23 29
        소수의 개수: 10개
        */
		Scanner sc = new Scanner(System.in);

		System.out.print("입력받은 수: ");
		int num = sc.nextInt();

		System.out.print("소수: ");

		int i;
		int count=0;// 소수 갯수 카운트
		
		for(i = 2; i <= num; i++) {// i부터 num 까지의 수 모두 검색
			int c=0; // 소수가 맞는지 확인하기위한 카운트, 약수가 2개일때 증가시킬것임
			for(int j = 1; j<= i; j++) {//i를 j로 나눠서 약수 갯수확인 ,나눠서 i의 약수가 1과 자기자신 뿐이면 그 수는 소수
				if(i % j == 0) {				
					c++;
				}

			}
			if(c==2) {//c가 2인 약수들만 출력 하고 count를 증가(소수 갯수 세기)
				System.out.printf("%d ",i);
				count++;

			}
		}
		System.out.println();

		System.out.printf("소수갯수: %d", count);

		sc.close();
	}
}

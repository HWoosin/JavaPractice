package chap1_HWS;

import java.util.Arrays;
import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] score = new int[5];
		int[] ranking = new int[5];// 랭킹 배열을 선언 하여 점수의 순위를 주고 순서대로 출력할것임!
		
		for(int i = 0; i< score.length; i++) {
			System.out.print("점수를 입력하세요: "); 
			int inputS = sc.nextInt(); // input Score 변수 입력받기
			ranking[i] = 1;//모두 1순위로 초기화 하고 비교하는 for문에서 다음수와 비교해서 작으면 등수 내려감
			score[i]= inputS;//배열에 넣
		}
		System.out.println("========================================"); 
		System.out.println("입력된 점수-> "+Arrays.toString(score));//입력받은 모든 점수 출력
		//System.out.println("입력된 등수-> "+Arrays.toString(ranking));//입력받은 모든 순위 출력, 모두 1인상태 확인
		System.out.println("========================================"); 

		
		//여기서 순위 비교!
		for(int i = 0; i < score.length; i++) {//한점수를 기준으로 두고 다음, 다다음, 다다다음, 다다다다음 점수를 비교!
			for(int j = 0; j <score.length; j++) {
				if(score[i]<score[j]) {//비교해서 i번째 점수가 작으면 등수 내려가기
					ranking[i] += 1;
				}

			}
		}
		
		System.out.println("점수\t순위");
		System.out.println("========================================"); 
		for(int k = 0; k< score.length; k++) {
			System.out.printf("%d\t%d\n",score[k],ranking[k]);
		}
		sc.close();
		
	}

}

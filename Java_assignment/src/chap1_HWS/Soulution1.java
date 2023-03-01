package chap1_HWS;

import java.util.Arrays;
import java.util.Scanner;

public class Soulution1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];

		for(int i = 0; i < 10; i++) {
			System.out.printf("%d번째 수: ", i+1);
			int input = sc.nextInt();
			arr[i]=input;
		}
		System.out.println("========================================"); 
		System.out.println("현재 배열"+Arrays.toString(arr)); //입력한 수 확인

		int max = arr[0];//가장 큰수를 찾아서 담을 변수, 배열의 첫 시작수를 max로 두고 다음번째 수와 비교할때 사용!

		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {//max가 다음수 보다 작으면 그냥넘김
				max = arr[i];
				//max가 큰수를 만나면 큰수를 max로 초기화, 그렇게 또 큰수 만나면 max로 담는다, 하지만 다음수가 작으면 max는 그대로 유지!
			}

		}
		System.out.println("가장 큰 값: "+ max);
		sc.close();
	}
}

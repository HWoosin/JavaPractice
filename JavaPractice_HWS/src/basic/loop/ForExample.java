package basic.loop;

import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {

		/*
		int i = 1 ;
		int total = 0;
		
		while(i<=10) {
			total += i;
		}
		System.out.println(total);
		*/
		/*
		int total = 0;
		for(int i = 1 ; i <=10 ; i++) {
			total += i;
		}
		System.out.println(total);
		*/
		//1~200까지 정수 중 6의 배수이면서 12의 배수는 아닌 수를 가로출력 
		
		for(int x = 1; x <=200; x++ ) {
			if(x % 6 == 0 && x % 12 != 0) {
				System.out.printf("%d ",x);
			}
		}
		System.out.println();
		int count = 0;
		for(int x = 1; x <=60000; x++) {
			if(x % 177 == 0) {
				count++;
			}
		}
		System.out.println("177의 배수 갯수"+count+"개");
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력:");
		int num = sc.nextInt();
		int result=1;
		for(int x = 1; x <= num; x++) {
			result *=x;
		}
		System.out.printf("%d!: %d",num,result);

//		for(int x = num; x >=1; x--) {
//			result*=x;
//		}
		
		
		sc.close();
		
		/*
		for(int j = 0; j < 5; j++) {//줄시작
			for(int s = 1; s < 5-j; s++) {//총 줄수-j만큼 공백출력반복 처음에는 공백 4
				System.out.print(" ");
			}
			for(int k = 0; k < j*2+1; k++) {// 공백이후 0 찍어내기 반복 처음에는 0 하나
				System.out.print("0");
			}
			System.out.println();//줄바꾸고 다시 반복함.
		}
		*/
	}
}








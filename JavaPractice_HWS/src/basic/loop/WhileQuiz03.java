package basic.loop;

import java.util.Scanner;

public class WhileQuiz03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1:");
		int x = sc.nextInt();
		System.out.print("정수2:");
		int y = sc.nextInt();

		int z;
		if(x>y) {
			z=y;
			y=x;
			x=z;
//			System.out.println(x);
//			System.out.println(y);
			
			//int start = (x > y ? y : x)
			//int end = (x > y ? x : y)
			/*
			while(start <=end){
				total += start;
				start++;
			}
			*/
		}
		int i = x;
		int sum = 0;
		
		while(i <= y) {
			sum += i;
			i++;
		}
		
		System.out.printf("%d부터 %d까지의 누적합계: %d", x, y, sum);
		
		sc.close();
	}

}

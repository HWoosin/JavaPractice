package basic.if_;

import java.util.Scanner;

public class IfExample1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		int point = sc.nextInt();
		System.out.println("내 점수: "+ point + "점");
		System.out.println("----------------------");

		
		if(point >= 90){
			System.out.println("90점 이상입니다.");
			System.out.println("합격");
		}
		/*
		if(point < 70) {
			System.out.println("70점 미만입니다.");
			System.out.println("블합격");
		}
		*/
		/*
		else if(point >= 70) {
			System.out.println("70점 이상입니다.");
			System.out.println("합격");
		}
		*/
		else{
			System.out.println("불합격");
		}
		System.out.println("시험치느라 수고했습니다.");
		
		sc.close();
	}
	

}

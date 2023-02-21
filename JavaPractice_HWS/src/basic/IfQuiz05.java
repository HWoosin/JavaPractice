package basic;

import java.util.Scanner;

public class IfQuiz05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어:");
		double korean = sc.nextDouble();
		System.out.print("영어:");
		double english = sc.nextDouble();
		System.out.print("수학:");
		double math = sc.nextDouble();

		String score;
		
		double average = (korean + english + math)/3;
		
		
		if(average>=90) {
			if(average>=95) {
				score ="A+";
			}
			else {
				score ="A0";
			}
		}
		else if(average>=80) {
			score ="B";
		}
		else if(average>=70) {
			score ="C";
		}
		else if(average>=60) {
			score ="D";
		}
		else {
			score ="F";
		}
		
		System.out.printf("평균점수: %.1f\n", average);
		System.out.println("당신의 학점은 "+ score +" 입니다.");
		
		sc.close();
	}

}

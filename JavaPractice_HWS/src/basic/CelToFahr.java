package basic;

import java.util.Scanner;

public class CelToFahr {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("온도를 입력하세요:");
		double cel = sc.nextDouble(); // int cel = sc.nextInt()
		
		double fahr = (cel * 9/5) +32; // double fahr = (double) cel * 9/5 +32
		
		System.out.printf("섭씨: %.1f℃  \n", cel);
		System.out.printf("화씨: %.1f℉  ", fahr);
		
		sc.close();
	}
	
	

}

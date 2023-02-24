package basic.loop;

import java.util.Scanner;

public class BreakQuiz01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);

		int cor = 0;
		int wrg = 0;

		int result =0;

		while(true) {
			int x = (int)((Math.random()*100)+1);
			int y = (int)((Math.random()*100)+1);
			int opr = (int)(Math.random()*2);

			if(opr==0) {
				System.out.printf("%d + %d = ",x,y);
			}

			else {
				int z;
				if(y>=x) {// 뺄때 음수결과 안나오게 함
					z=y;
					y=x;
					x=z;
				}
				System.out.printf("%d - %d =" ,x,y);
			}

			result = sc.nextInt();

			if(opr==0) {
				if(x + y == result) {
					System.out.println("정답입니다.");
					cor++;
				}
				else if(result == 0) {
					System.out.println("종료합니다.");
					System.out.println("----------------------");
					System.out.println("정답횟수: " + cor);
					System.out.println("오답횟수: " + wrg);
					break;
				}
				else {
					System.out.println("오답입니다.");
					wrg++;
				}
			}
			else{
				if(x - y == result ) {
					System.out.println("정답입니다.");
					cor++;
				}
				else if(result == 0) {
					System.out.println("종료합니다.");
					System.out.println("----------------------");
					System.out.println("정답횟수: " + cor);
					System.out.println("오답횟수: " + wrg);
					break;
				}
				else {
					System.out.println("오답입니다.");
					wrg++;
				}
			}

		}
		sc.close();

	}
}

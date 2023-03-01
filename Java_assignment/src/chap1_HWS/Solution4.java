package chap1_HWS;

import java.util.Arrays;
import java.util.Scanner;

public class Solution4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] allStd = {1,2,3,4,5,6,7,8,9,10}; //전체 학생번호~출석부~
		int[] joinStd = new int[8];//제출 학생 담기!
		
		for(int i = 0; i < 8; i++) {
			System.out.print("학생번호 입력: ");
			int join = sc.nextInt();//수업참가한 학생 번호 입력
			joinStd[i]=join;	
		}
		System.out.println("============================");
		System.out.println("제출자"+Arrays.toString(joinStd));
		
		
		for(int i = 0; i < 10; i++) {
			boolean flag = false;//출석부에서 제출한학생이 없는지 확인할 boolean
			for(int j = 0; j < 8; j++) {
				if(allStd[i]==joinStd[j]) {//제출자가 출석부에도 존재하면 boolean true
					flag =true;
				}
			}
			if(!flag) {//제출자가 출석부에도 없다는것은 안냈다는것 boolean이 false유지
				System.out.println("숙제를 안 낸 학생 번호: "+allStd[i]);
			}

		}


			
			
		}
	}



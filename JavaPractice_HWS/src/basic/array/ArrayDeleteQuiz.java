package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] kakao = {"무지","네오","어피치","라이언","춘식이"};
		System.out.println("현재 저장된 친구들: " + Arrays.toString(kakao));
		System.out.print("삭제를 원하는 친구를 입력: ");
		String name = sc.next();

		boolean flag = false;

		for(int i = 0; i < kakao.length; i++) {
			if(name.equals(kakao[i])) {//입력과 배열안에있은것 대조해서 중복되면
				for(int x = i; x < kakao.length-1; x++) {// 앞으로 끌어당겨 넣음
					kakao[x]= kakao[x+1];
				}
				flag = true; //중복을 확인했다는것
				break;
			}	
		}
		if(!flag) {
			System.out.println("일치하는 이름이 없음"); //중복 없으면 종료
 
		}
		else {
			String[] kakao2 = new String[kakao.length-1];//앞에서 끌어당긴 애들 새 배열에 넣기
			for (int y =0; y <kakao2.length; y++) {
				kakao2[y]=kakao[y];

			}
			kakao =kakao2;
			kakao2 =null;
			System.out.println("삭제 후 저장된 친구들: " + Arrays.toString(kakao));

		}

		sc.close();
	}

}

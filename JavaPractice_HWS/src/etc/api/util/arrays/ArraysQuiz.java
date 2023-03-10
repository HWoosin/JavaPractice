package etc.api.util.arrays;

import java.util.Arrays;

public class ArraysQuiz {

	/*
    - 참가한 사람의 이름이 담긴 배열 participant와
    완주한 사람의 이름이 담긴 배열 completion이 주어질 때
    완주하지 못한 선수의 이름을 return하는 solution 함수를 완성하세요.
	 */

	public static String solution(String[] participant, String[] completion) {

		Arrays.sort(participant);
		Arrays.sort(completion);
		String loser = "";
		/*
		//배열 일일히 비교하기
		boolean flag = false;
		for(int i = 0; i<participant.length; i++) {
			for(int j=i; j<completion.length; j++) {
				if(participant[i]==completion[j]) {
					flag=true;
				}
				else {
					flag = false;
					lose = participant[i];

				}
			}

		}
		return lose;	
	}
		 */
		for(int i = 0; i<participant.length; i++) {
			int j = Arrays.binarySearch(completion, participant[i]);
			//participant의 i번째 사람을 completion에서 찾는다. 없으면 음수반환할것!
			if(j<0) {
				loser= participant[i];
				break;
			}
		}
		return loser;
	}

	public static void main(String[] args) {

		String[] participant = {"홍길동","김길동","김철수","최철수","박영희"};
		String[] completion = {"홍길동", "김길동", "박영희", "김철수"}; 

		System.out.println("완주 못한사람: "+solution(participant,completion)); 



	}

}

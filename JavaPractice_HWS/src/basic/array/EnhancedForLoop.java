package basic.array;

public class EnhancedForLoop {

	public static void main(String[] args) {

		/*
		 * 향상된 for문 (forEach)
		 * 제어변수(인덱스)의 사용 없이 배열 내부의 요소를 전체 참조할 수 있게 해주는 반복문.
		 * ex)
		 * for(배열 요소를 받아줄 수 있는 변수: 배열변수명) {
		 		반복실행문
		 * }
		 */

		String[] week = {"월","화","수","목","금","토","일"};
		/*
		for(int i=0; i < week.length; i++) {
			System.out.println(week[i]+"요일 좋아~~!");
		}
		 */

		for(String day : week) {
			System.out.println(day + "요일 좋아~~!");
		}
		System.out.println("---------------------------------------------");
		/*
        1. scores라는 이름으로 int배열을 하나 선언해서
        점수 데이터를 저장하세요.
        {96, 88, 74, 63, 100, 55}

        2. 향상 for문(forEach)을 사용하여 총점과 평균을 구해보세요.
        총점(int), 평균(double, 소수점 둘째 자리까지 출력)
        */
		int[] scores = {96,88,74,63,100,55};
		int total=0;
		
		
		for(int s : scores) {
			total+=s;//s값은 자꾸 다음배열을 불러오겠지 그걸 total에 누적합
		}
		double avg =(double)total/scores.length;
		System.out.println("총점: "+ total);
		System.out.printf("평균: %.2f\n", avg);
	}

}

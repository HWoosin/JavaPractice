package basic.array;

public class Array2DQuiz {

	public static void main(String[] args) {

		int[][] score = {
				{79,80,99}, //A
				{95,85,89}, //B
				{90,65,56}, //C
				{69,78,77}  //D
				//과목은 3과목
		};

		String[] stuName = {"A학생", "B학생", "C학생", "D학생"};
		String[] subName = {"국어", "영어", "수학"};

		/*
		 1. 각 학생의 평균을 소수점 첫째 자리까지 출력해 보세요.
		 2. 각 과목의 평균을 출력해 보세요.
		 3. 반 평균을 출력해 보세요 (모든 학생들의 평균을 더해서 학생수로 나누기)
		 */

		//학생평균
		double allAvg = 0;
		double stdSum = 0;
		for(int i = 0; i<stuName.length;i++) {
			for(int j=0; j<subName.length; j++) {
				stdSum += score[i][j];

			}
			allAvg += (stdSum/3);
			System.out.printf("%s 학생 평균: %.1f\n",stuName[i],stdSum/3);
			stdSum=0;
		}
		/*
		double totalAvg = 0.0;//반 평균에 사용할 변수
		int idx= 0; //stuName 배열에서 학생의 이름을 꺼내올 용도로 사용할 변수
		for(int[] stu :score){
			int total =0;
			for(int s : stu){
				total +=s;
			}
			double avg = (double)total/subName.length;
			totalAvg += avg;
			System.out.printf("%s 학생 평균: %.1f\n",stuName[idx],avg);
			idx++;
		}
		double classAvg = totalAvg/stuName.length;
		System.out.printf("반 평균: %.1f\n", classAvg/stuName.length);
		*/
		
		System.out.println("---------------------------------");
		//과목평균
		double subSum =0;
		for(int i=0; i<subName.length; i++) {
			for(int j=0; j<stuName.length; j++) {
				subSum += score[j][i];
			}
			System.out.printf("%s 과목 평균: %.1f\n",subName[i],subSum/stuName.length);
			subSum=0;
		}

		System.out.println("---------------------------------");
		//반 평균
		System.out.printf("반 평균은 %.1f", allAvg / stuName.length);
		//밥먹고 10분 컷,,,사람은 역시 밥을 먹어야함!!
	}
}










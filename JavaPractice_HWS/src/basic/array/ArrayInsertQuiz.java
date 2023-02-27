package basic.array;

//import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsertQuiz {

	public static void main(String[] args) {
		/*
        1. String 배열을 생성하세요. (foods)
        크기는 넉넉하게 50개로 지정하겠습니다.

        2. 사용자에게 음식 이름을 입력받아서 배열에
         삽입해 주세요.
         사용자가 음식 입력창에 '배불러' 라고 작성하면
         입력을 종료해 주세요.

        3. 입력이 종료되면 사용자가 입력한 음식을
        가로로 출력해 주세요. (null은 출력하지 마세요.)
        
        추가 문제 
         - 입력을 받았는데 이미 배열에 존재하는 음식이라면
         '이미 존재하는 음식입니다.' 를 출력하고
         다시 새로운 음식을 입력받을 수 있도록 코드를 제어해 보세요.
        */
		Scanner sc = new Scanner(System.in);
		
		String[] foods= new String[50];// 50의 배열 넓이 설정
		
		for(int i = 0; i < foods.length; i++) {//배열 50개에 음식넣는 for문--(i번째 마다 계속 입력)
			boolean flag= false;//중복검사를 위한 boolean flag변수-false로 초기화
			System.out.print("음식을 주문하세요: ");
			String eat = sc.next();//사용자 입력
			
			for(int j=0;j<i;j++) {//여태 입력한 배열들 중 사용자가 지금 입력한 내용이 중복되는지 하나씩 대조하는 for문--(j번 부터  i번 까지 검사)
				if(eat.equals(foods[j])) {//사용자가 입력한 eat과 foods배열의 j번째가 같으면? flag를 true로 변경
					flag= true;
					System.out.println("중복");
					i--;//다음배열로 넘어가서 빈 배열이 생기지 않기 위해 i 를 감소
				}
			} 
			
			if(eat.equals("배불러")) {//사용자가 eat에 배불러를 적으면 종료
				System.out.println("그만 주문. ");
				break;
			}
			if(!flag) {//flag가 false인 경우에만 foods의 i번째 배열에 저장
				foods[i]= eat;
			}
			
		}
		
		for(String m : foods){ //m변수는 foods의 배열 하나씩 보여줌
			if(m ==null) {
				break;
			}
			else
				System.out.print(m + " ");
		}
		//System.out.println(Arrays.toString(foods));
		sc.close();
	}
}

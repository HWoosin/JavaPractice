package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class RussianRoulette {

	public static void main(String[] args) {
		/*
        - 게임 인원은 2 ~ 4명 입니다.
        - 실탄 개수는 6개 미만으로 설정하겠습니다.
        - 게임이 시작되면, 시작 인원은 랜덤으로 순서가 설정됩니다.
         또한 총알의 위치도 랜덤으로 설정됩니다.
        - 총알의 위치는 boolean 타입의 배열로 선언하여 배치하였습니다.
        ex)  [false, false, false, true, false, false]
        - 룰은 정해진 것은 없지만, 한명이 사망하면 총알의 위치를 
         랜덤으로 바꿔서 남은 인원으로 다시 진행을 할 생각입니다.
         원하는 규칙이 있다면 자유롭게 커스텀해서 작성해 보세요.
		 */
		Scanner sc = new Scanner(System.in);
		//게임인원 입력
		System.out.println("========== 러시안룰렛판에 오신것을 환영합니다. ==========");
		System.out.print("참가 수: ");
		int p = sc. nextInt();//사람수 p
		

		if(p < 2 || p > 5) {//2명에서 5명 게임가능
			System.out.println("게임 인원이 올바르지 않습니다.");
			return;
		}
		
		
		String[] people = new String[p];

		System.out.println("플레이어의 이름을 입력해주세요");
		for(int i = 0; i<p; i++) {
			System.out.printf("%d번째 플레이어 이름: ",i+1);
			String name = sc.next();
			people[i] = name;
		}
		for(int j = 0; j<p; j++) { // 참가자 출력
			System.out.println(people[j]);
		}

		//실탄갯수 입력 1~5
		System.out.print("총알 갯수(6 미만): ");
		int bullet = sc.nextInt();
		if(bullet>5 || bullet<1) {
			System.out.println("실탄 수가 올바르지 않습니다.");
			//return;
		}

		//실탄 탄창에 배치
		boolean[] bulletPos = new boolean[6];
		for(int i = 0; i<bullet; i++) {
			int pos = (int)(Math.random()*bulletPos.length);

			if(bulletPos[pos]) {//총알 차있으면 넘겨버리기
				i--;
				continue;
			}
			else
				bulletPos[pos]= true;

		}
		//탄창내용
		//System.out.println(Arrays.toString(bulletPos));

		//난수 생성하고 실탄을 탄창에 배치
		//false -> true로 바꾸는 것이 실탄 장전
		//난수는 중복으로 발생할 가능성이 있기 때문에 중복 방지 로직을 세워서
		//같은 위치에 두개의 실탄이 장전되지않도록 해주면 된다.

/*
		//실행 순서 정하기
		//난수를 이용해서 실행 순서를 정함
		//시작 인덱스를 난수로 정해서 돌아가게 해도 되고, 배치를 섞어도 상관없음
		int startIdx = (int) (Math.random()*p);
		System.out.printf("\n총을 돌렸습니다. %s부터 시작합니다.\n"
				, people[startIdx]);

		//일부러 입력 대기를 해서 흐름을 잠시 끊어줍니다.
		//이 입력값(enter)은 받아서 활용할 것이 아니기 때문에 
		//따로 변수를 선언하지 않습니다.
		sc.nextLine();


		//최후의 1인이 남을 때 까지 게임을 진행해 주세요.
		//또는 총알을 다 소비할 때 까지 게임을 진행해 주세요.
		//총알을 소모하면 true값을 false로 변경해 주세요.
		//사람이 한 명 아웃되면 배열의 크기를 줄여 주세요.


		int realBulletPos = 0;
		while(true) {

			System.out.printf("\n\n[%s의 턴!]\t탄창을 장전했습니다.\n"
					, people[startIdx]);
			System.out.println("# 엔터를 누르면 격발합니다!");
			sc.nextLine();

			if(bulletPos[realBulletPos]) { //총알 격발!

				System.out.printf("\n빵!!!\n[%s] 사망...\n"
						, people[startIdx]);
				bullet--;
				p--;
				bulletPos[realBulletPos] = false; //총알이 소모되었으니 false로 변경.

				for(int i = startIdx; i < people.length-1; i++) {//지금 죽은사람 기준으로 한칸씩 당김
					people[i] = people[i+1];
				}
				String[] temp = new String[p];

				for(int j=0; j<temp.length; j++) {//temp에 죽은사람빼고 다시 담음
					temp[j] = people[j];
				}
				people = temp; 
				temp= null;

				System.out.println("생존자:"+Arrays.toString(people));

				if(p==1) {
					System.out.println("최종생존자"+ people[0]);
					System.out.println("가라..넌 살았다.");
					break;
				}
				else if(bullet == 0) {
					System.out.println("총알이 다 떨어졌습니다.");
					System.out.println("생존자:"+Arrays.toString(people));
					System.out.println("가라..너흰 살았다.");
					break;

				}
				else {
					System.out.println("총돌려라..총식는다..");
					sc.nextLine();
				}

			} else { // false였기 때문에 생존.
				System.out.println("휴... 살았습니다.");
				startIdx++;
			}
			// startIdx가 증가하는데 배열밖으로 넘어가면 0으로 초기화 한다. 다음차례가 처음으로 돌아가기 하기위함
			if(startIdx == p) {
				startIdx=0;
			}
			realBulletPos++;//다음탄으로 넘기기
*/
		
		
			//내가작성한 코드
			int bulletCount=0;//탄창자리 변수
			int startP = (int)(Math.random()*p);//랜덤으로 지정된 startP번째부터 게임시작
			sc.nextLine();
			
			System.out.println("++++++게임시작++++++\n");
			System.out.printf("%s부터시작\n",people[startP]);

			while(true) {
				//게임시작
				System.out.println(people[startP]+"의 차례");
				System.out.print("엔터를 누르면 방아쇠를 당깁니다.");
				sc.nextLine();
				//총알격발!
				if(bulletPos[bulletCount]) {//true면 격발된 상황
					System.out.println("빵!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					System.out.printf("%s 사망..\n",people[startP]);//startP째의 사람죽음
					bullet--;//총알사용
					p--;//사람감소
					bulletPos[bulletCount]= false;//현재 총탄위치는 사용됨 그래서 false로 변경

					//==================================================================================
					//배열 수정부문
					//죽었으면 치워야지,,startP번째 뒷사람들 다 땡김
					for(int i=startP; i <people.length-1; i++) {//기존 배열 -1용량에 담아
						people[i]=people[i+1];
					}
					String[] leftP = new String[people.length-1];//죽은사람빼고 다시배열담음 left People
					
					for(int j=0; j<leftP.length;j++) {
						leftP[j]=people[j];
					}
					people = leftP;//다시 그걸 people로 지정해준다.
					leftP =null;
					//생존 확인
					//System.out.println(Arrays.toString(people));
					//==================================================================================
					

					
					//다음 게임진행과 게임종료 조건
					if(people.length ==1) {//다죽고 남은 최후의1인일때
						System.out.println("게임종료");
						System.out.printf("생존자: %s ",people[0]);//배열에서 맨앞사람이 생존자 
						break;
					}
					else if(bullet==0) {//총알이 다쓰고 살아남은 인원
						System.out.println("총알소진");
						System.out.println("다수의 생존자"+Arrays.toString(people));
						break;
					}
					else {//위의 조건을 만족하지 못하면 아직 게임이 진행중
						System.out.println("총돌리세요..");
						sc.nextLine();
					}
				}//격발상황 끝.
				
				else {//총알 미격발
					System.out.println("운이 좋군요.. 총돌리세요.");
					startP++;//랜덤지정부터 시작했으니까 그다음사람으로 넘기기, 증가해야 다음사람지목됨
				}//미격발 상황 끝
				bulletCount++;//다음총알이 들어있는 탄으로 넘어가기위한 증가
				
				
				
				//배열을 순환시키기위한 검사 if
				if(startP == p) {//people배열의 끝까지 갔다는것은, 다시 처음부터 배열시작시켜야한다는것이다
					startP=0;
				}
			}//while 종료
			sc.close();
			
			
		}
	}
































package etc.api.util.random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LottoSimulator {

	static Random r = new Random();

	static int prize1 = 0; //1등 당첨 횟수를 세어줄 변수
	static int prize2 = 0; //2등 당첨 횟수를 세어줄 변수
	static int prize3 = 0; //3등 당첨 횟수를 세어줄 변수
	static int prize4 = 0; //4등 당첨 횟수를 세어줄 변수
	static int prize5 = 0; //5등 당첨 횟수를 세어줄 변수
	static int failCnt = 0; //꽝 당첨 횟수를 세어줄 변수

	public static List<Integer> createLotto() {
		/*
		 * 1~45 범위의 난수 6개를 생성해서
		 * 컬렉션 자료형에 모아서 리턴.
		 * 중복발생x
		 */
		Set<Integer> lotto = new HashSet<>();

		while(lotto.size() < 6) {
			int num = r.nextInt(45)+1;
			lotto.add(num);
		}
		List<Integer> lottoList = new ArrayList<>(lotto);
		Collections.sort(lottoList);
		return lottoList;
	}

	//보너스 번호
	public static int createBonusNum(List<Integer> lotto) {
		/*
		 * 매개값으로 전달되는 당첨번호 집합을 전달 받고
		 * 당첨번호들을 피해서 보너스 번호 하나만 뽑기
		 * 1~45사이의 난수.
		 */
		while(true) {
			int bonus = r.nextInt(45)+1;
			if(!lotto.contains(bonus)) {
				return bonus;
			}
		}


	}
	//당첨 등수알려주는 메서드
	public static int checkLottoNumber(List<Integer> myLotto, List<Integer> lotto, int bonus ) {
		/*
		 * 매개값으로 당첨번호, 구매한 로또번호집합, 보너스번호를 받는다.
		 * 내 로또 번호와 당첨번호를 비교하여
		 * 일치하는 횟수를 세주고 등수를 판단.
		 * 판단된 등수에 해당하는 static 변수의 값을 올려주면 된다.
		 */
		int correct = 0;
		for(int i=0; i<lotto.size(); i++) {
			if(lotto.contains(myLotto.get(i))){
				correct++;
			}
		}
		return correct;
	}

	public static void main(String[] args) {

		//로또 번호 생성 메서드를 호출해서 당첨 번호를 하나 고정.
		//보너스 번호도 하나 고정
		List<Integer> myLotto = createLotto();//내가 산 로또
		List<Integer> lotto = new ArrayList<>();//로또돌려서 나오는 번호 저장 리스트
		int bonus = 0;//보너스
		int tries = 0;//시도 횟수
		long payMoney = 0;
		//System.out.println(createLotto(myLotto));
		while(true) {
			/*
			 * 1등이 당첨 될때까지 반복문 돌린다.
			 * 1등이 당첨 된다면, 1등이 되기까지 누적 당첨 횟수를 출력하고 반복문 종료
			 * 로또 구매하기 위한 금액 출력(long)
			 */
			lotto = createLotto();//로또 생성
			bonus = createBonusNum(lotto);
			int fin = checkLottoNumber(myLotto,lotto,bonus);
			if(fin == 6) {
				//System.out.println("1등 당첨");
				System.out.println(myLotto);
				prize1++;
				break;
			}
			else if(fin == 5) {
				if(myLotto.contains(bonus)) {
					//System.out.println("2등 당첨");
					prize2++;

				}
				else {
					//System.out.println("3등 당첨");
					prize3++;
				}

			}
			else if(fin == 4) {
				//System.out.println("4등 당첨");
				prize4++;
			}
			else if(fin == 3) {
				//System.out.println("5등 당첨");
				prize5++;

			}
			else {
				//System.out.println("꽝");
				failCnt++;
			}
			tries++;
			payMoney +=1000;
			System.out.println(tries+"번 시도.");
		}
		System.out.println("1등당첨!");
		System.out.println("2등당첨수!" +prize2);
		System.out.println("3등당첨수!"+prize3);
		System.out.println("4등당첨수!"+prize4);
		System.out.println("5등당첨수!"+prize5);
		System.out.println("꽝 당첨수!"+failCnt);
		System.out.println("비용: " + payMoney+ "원.");


	}

}
package chap5_HWS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FoodManager {

	static Map<String, Integer> foods = new HashMap<>(); //입력을 메소드로 실행하기 위해 옮김
	static Scanner sc = new Scanner(System.in);

	private static String writeMenu(String select) {
		System.out.printf("%s할 메뉴명: ",select);
		String food = sc.next();

		if(!foods.containsKey(food)) {
			return food;
		}
		return null;
	}
	private static String findMenu(String select) {
		System.out.printf("%s할 메뉴명: ",select);
		String food = sc.next();

		if(foods.containsKey(food)) {
			return food;
		}
		return null;
	}

	public static void main(String[] args) {

		System.out.println("*** 음식점 메뉴판 관리 프로그램 ***");

		while(true) {

			System.out.println("# 1. 메뉴 등록");
			System.out.println("# 2. 메뉴 전체보기");
			System.out.println("# 3. 프로그램 종료");
			System.out.print("> ");
			int menu = sc.nextInt();

			System.out.println("--------------------------------");

			if(menu == 1) {
				/*
				 - 메뉴명과 가격을 입력받아서 Map에 삽입하시면 됩니다.
				  이미 존재하는 메뉴명이 들어왔다면 '이미 존재하는 메뉴입니다.'
				  를 출력하시고 메인 메뉴로 돌아와 주세요.
				 - 메뉴 등록 완료 후 'XXX 메뉴가 등록되었습니다.' 를 출력하세요.
				 */
				String food = writeMenu("추가");
				if(food==null) {
					System.out.println("이미 존재하는 메뉴입니다.");
				}
				else {
					System.out.print("가격입력:");
					int foodPrice = sc.nextInt();
					foods.put(food,foodPrice);
					System.out.println("메뉴가 저장되었습니다.");
				}
			} else if(menu == 2) {
				/*
				 - 만약 메뉴가 하나도 등록되어 있지 않다면
				  '메뉴부터 먼저 등록해 주세요!' 출력 후 메인 메뉴로 이동시켜
				  주세요. 

				 - Map의 모든 요소를 반복문을 이용하여 출력해 주세요.
				 ex)
				    메뉴명 : 가격
				    메뉴명 : 가격
				    메뉴명 : 가격....
				 */
				if(foods.size()==0) {
					System.out.println("메뉴 먼저 등록해주세요!");
					continue;
				}
				else {
					Set<String> menuBox = foods.keySet();
					for(String f : menuBox) {
						System.out.println("<메뉴명: "+f+"> : <가격: "+ foods.get(f)+"원>");
					}
				}
				/*
				  메뉴를 모두 출력 후에 선택지를 제공하세요.
				  (1. 수정 | 2. 삭제 | 3. 취소)
				  - 수정: 수정할 메뉴명을 입력받아서 가격 수정을 진행하세요.
				   없는 메뉴명이라면 없다고 메세지를 출력하시고 메인 메뉴로 이동.

				  - 삭제: 삭제할 메뉴명을 입력받아서 해당 메뉴를 삭제해 주세요.
				   없는 메뉴명이라면 없다고 메세지를 출력하시고 메인 메뉴로 이동.

				  - 취소: 메인 메뉴로 이동
				 */
				System.out.println("(1. 수정 | 2. 삭제 | 3. 취소)");
				int subMenu = sc.nextInt();

				if(subMenu == 1) {
					String food = findMenu("수정");
					
					if(food!=null) {
						System.out.print("가격수정: ");
						int foodPrice = sc.nextInt();
						foods.put(food, foodPrice);
						System.out.println("수정완료!");
					}
					else {
						System.out.println("없는 음식메뉴 입니다.");
					}
				}
				else if(subMenu == 2){
					String food = findMenu("삭제");
					if(food!=null) {
						foods.remove(food);
						System.out.println("삭제완료!");
					}
					else {
						System.out.println("없는 음식메뉴 입니다.");
					}
				}
				else if(subMenu == 3) {
					System.out.println("취소합니다.");
					continue;
				}
				else {
					System.out.println("똑바로 입력해!!!!!!!!!!!!!!!");
				}


			} else if(menu == 3) {
				/*
				  - Y / N를 입력받아서 Y가 입력되면 프로그램 종료.
				   그 이외의 값은 종료 취소를 진행해 주세요.
				 */
				System.out.println("종료하실래요?[Y/N]");
				String ch = sc.next();
				String choose=ch.toUpperCase();
				if(choose.equals("Y")) {
					System.out.println("종료!");
					break;
				}
				else if(choose.equals("N")) {
					System.out.println("계속 진행!");
					continue;
				}
				else {
					System.out.println("잘못입력하셨습니다.");
				}

			} 
			else {
				System.out.println("메뉴를 잘못 입력하셨습니다.");
			}

		}
		sc.close();
	}

}


















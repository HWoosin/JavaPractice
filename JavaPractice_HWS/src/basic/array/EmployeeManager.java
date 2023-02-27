package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeManager {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//사원의 정보:사번, 이름, 나이, 부서명
		String[] userNums =  new String[100];
		String[] names =  new String[100];
		int[] ages =  new int[100];
		String[] departments =  new String[100];

		/*
		userNums[0]="123";
		names[0]="황우신";
		ages[0]=26;
		departments[0]="개발부";
		 */
		//입력된 데이터(사원의 정보)의 개수를 체크하는 변수.
		int count=0;

		while(true) {
			System.out.println("\n=========== 사원 관리 프로그램 ==========");
			System.out.println("#1. 사원 정보 신규 등록");
			System.out.println("#2. 모든 사원 정보 보기");
			System.out.println("#3. 사원 정보 검색");
			System.out.println("#4. 사원 정보 수정");
			System.out.println("#5. 사원 정보 삭제");
			System.out.println("#6. 프로그램 종료");
			System.out.println("======================================");

			System.out.print("메뉴를 선택: ");
			int menu = sc.nextInt();

			int view=0;//사번 검색위한 변수

			if(menu ==1) {
				
				while(true) {
					System.out.print("사번입력 > ");
					String userNum = sc.next();

					boolean flag = false;
					for(int j=0; j<userNums.length; j++) {
						if(userNum.equals(userNums[j])) {
							System.out.println("중복된 사번입니다.");
							flag = true;
							break;
						}
					} // 중복찾기 end
					if(!flag) {
						int i;
						for(i=0; i<userNums.length; i++) {
							if(userNums[i] == null) {
								userNums[i] = userNum;
								break;
							}
						} // 빈자리찾기 end

						System.out.print("이름입력 > ");
						names[i] = sc.next();
						System.out.print("나이입력 > ");
						ages[i] = sc.nextInt();
						System.out.print("부서입력 > ");
						departments[i] = sc.next();
						count++;
						break;
					}
				} // 사번중복 무한루프 end
				
			}
			else if(menu ==2) {				
				if(count>0) {
					for(view =0; view < userNums.length ; view++) {
						if(userNums[view]==null) {//null이면 나감 빈공간 null출력 안하겠다!
							break;
						}
						else {
							System.out.printf("사번: %s\n", userNums[view]);
							System.out.printf("이름: %s\n", names[view]);
							System.out.printf("나이: %d\n", ages[view]);
							System.out.printf("부서: %s\n",departments[view]);
							System.out.println("=============================================");
						}

					}
				}
				else {
					System.out.println("등록된 사원 정보가 없습니다.");
				}

			}
			else if(menu ==3) {
				System.out.print("사번입력 > ");
                String userNum = sc.next();

                boolean flag = false;
                for(int i=0; i<userNums.length; i++) {
                    if(userNum.equals(userNums[i])) {
                        System.out.println("사번: " + userNums[i]);
                        System.out.println("이름: " + names[i]);
                        System.out.println("나이: " + ages[i]);
                        System.out.println("부서: " + departments[i]);
                        flag = true;
                        break;
                    }
                }
                if(!flag) {
                    System.out.println("조회하신 사원의 정보가 없습니다.");
                }
			}
			else if(menu ==4) {
				System.out.print("변경할 사원의 사번을 입력하세요:");
				String userNum = sc.next();
				for(int i =0; i < userNums.length; i++) {
					int c=0;
					if(userNum.equals(userNums[i])) {
						System.out.printf("%s %s %d %s\n",userNums[i],names[i],ages[i],departments[i]);
						c++;
						System.out.println("1. 나이변경 || 2. 부서변경 || 3.취소");
						int choose = sc.nextInt();
						if(choose ==1 ) {
							System.out.print("나이를 입력하세요:");
							int age = sc.nextInt();
							ages[i]=age;
							break;

						}
						else if(choose ==2) {
							System.out.print("부서를 입력하세요:");
							String department = sc.next();
							departments[i]=department;
							break;
						}
						else if(choose ==3){
							System.out.println("메인으로 돌아갑니다.");
							break;
						}
						else {
							System.out.println("잘못된입력");
						}

					}
					if(c==userNums.length)
						System.out.println("등록되지않은 사번입니다.");
				}

			}
			else if(menu ==5) {
				System.out.print("사번입력 > ");
                String userNum = sc.next();

                boolean flag = false;
                int i;
                for(i=0; i<userNums.length; i++) {
                    if(userNum.equals(userNums[i])) {
                        System.out.println("정말 삭제하시겠습니까? [Y/N]");
                        flag = true;
                        break;
                    }
                }
                if(!flag) {
                    System.out.println("해당되는 사원의 정보가 없습니다.");
                } else {
                    String yesOrNo = sc.next();
                    switch(yesOrNo) {
                    case "N": case "n":
                        System.out.println("아니요를 선택하셨습니다.");
                        break;
                    case "Y": case "y":
                        for(int j=i; j<userNums.length-1; j++) {
                            userNums[j] = userNums[j + 1];
                            names[j] = names[j + 1];
                            ages[j] = ages[j + 1];
                            departments[j] = departments[j + 1];
                        }
                        count--;
                        break;
                    default :
                        System.out.println("잘못된 입력입니다.");
                    } // switch end
                } // else end
			}
			else if(menu ==6) {
				System.out.println("프로그램 종료합니다.");
				sc.close();
				break; //while true break
			}
			else {
				System.out.println("잘못된 입력입니다.");
			}

		}//end while true
		//System.out.println(Arrays.toString(userNums));
	}

}















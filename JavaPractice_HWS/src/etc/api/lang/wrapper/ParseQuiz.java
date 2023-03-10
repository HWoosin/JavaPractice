package etc.api.lang.wrapper;

import java.util.Scanner;

public class ParseQuiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("주민등록번호를 입력하세요: ");
			String cert = sc.next();

			if(cert.indexOf("-")==-1) {
				if(cert.length()!=13) {
					System.out.println("13자리를 정확히 입력해주세요");
				}
				else
					System.out.println("하이픈을 포함시켜주세요.");
			}

			else if(cert.length()==14) {//적절히 넣었다면

				char gen = cert.charAt(7);
				String getage = cert.substring(0,2);
				int ageYear = Integer.parseInt(getage);
				String month = cert.substring(2,4);
				String date = cert.substring(4,6);
				
				String gender;

				//System.out.println(gen + getage + ageYear + month + date);

				if(gen == '1' || gen == '2') {
					int old = 1900+ageYear;
					int age = 2023 - old;
					if(gen == '1' ) {
						gender= "남자";
						System.out.printf("%d년 %s월 %s일 %d세 %s\n",old,month,date,age,gender);
						break;
					}
					else {
						gender= "여자";
						System.out.printf("%d년 %s월 %s일 %d세 %s\n",old,month,date,age,gender);
						break;
					}

				}
				else if(gen == '3' || gen == '4') {
					int young = 2000+ageYear;
					int age = 2023 - young;
					if(gen == '3') {
						gender= "남자";
						System.out.printf("%d년 %s월 %s일 %d세 %s\n",young,month,date,age,gender);
						break;
					}
					else {
						gender= "여자";
						System.out.printf("%d년 %s월 %s일 %d세 %s\n",young,month,date,age,gender);
						break;
					}
				}
				else {
					System.out.println("잘못된 입력");
				}

			}
			else {
				System.out.println("잘못된입력입니다. 다시 입력해주세요.");
			}


		}
		sc.close();
	}

}

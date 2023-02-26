package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModify {

	public static void main(String[] args) {

		String[] foods = {"햄버거","족발","피자","햄버거"};
		System.out.println(Arrays.toString(foods));

		foods[0] = "치킨";
		foods[2] = "탕수육";
		System.out.println(Arrays.toString(foods));

		//배열의 인덱스 탐색
		System.out.println("---------------------------------------");

		Scanner sc = new Scanner(System.in);
		System.out.println("탐색할 음식을 입력하세요: ");
		String name = sc.next();
		//int c=0;
		//boolean flag = false; 로 맞으면 true로 바꿔주고 아닐경우를 if를 추가해서 거름
		
		for(int i =0; i < foods.length; i++) { //i는 0부터 4전까지 0 1 2 3 탐색
			if(name.equals(foods[i])) { // 사용자가 입력한 name이 foods의 i번째와 같으면 
				System.out.println("탐색 완료");
				System.out.println("인덱스:"+i+"번");
				//c++;
				break;
			}
			else if(i == foods.length-1) {//i가 foods길이의 한번적다는것은 0 1 2 3 을 다 돌았다는 것이고 그말은 같은것을 못찾았다는것
				System.out.println("없음");
				
			}
		}
		

		sc.close();
	}

}

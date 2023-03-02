package basic.method;

import java.util.Arrays;

public class MethodQuiz02 {
	
	static String[] foods = {"떡볶이", "치킨", "파스타"};
	
	//배열의 맨 마지막 위치에 데이터를 추가하는 함수
	//기존 배열보다 크기가 하나 큰 배열 선언해서 값 고대로 내리기
	static void push(String newfood) {
		String[] temp = new String[foods.length+1];
		int i;
		for(i=0; i< foods.length; i++) {
			temp[i]=foods[i];
		}
		temp[foods.length]=newfood;
		foods=temp;
		temp=null;
	}
	
	//배열 내부 데이터 단순 출력 함수
	static void printFood() {
		System.out.println(Arrays.toString(foods));
	}
	
	//배열 내의 특정 음식의 위치를 찾아주는 함수
	static int indexOf(String targetName) {
		int i=0;
		for(i = 0; i<foods.length; i++) {
			if(targetName.equals(foods[i])) {
				return i;//맞으면 i 반환
			}
		}
		return -1;// 틀리면 -1반환
	}
	
	//특정 음식의 배열 포함 여부 (참/거짓)
	//indexOf의 리턴값으로 판단하여 리턴
	static boolean include(String targetName) {
		/*
		if(indexOf(targetName)>=0) {
			return true;
		}
		else {
			return false;
		}
		*/
		return indexOf(targetName) != -1;//존재하는 음식이 없다면 -1값이 오고 -1 != -1 는 false!
	}
	
	//특정 음식 제거 함수
	static void remove(String targetName) {
		String[] temp = new String[foods.length-1];
		/*
		for(int k =0; k<foods.length; k++) {
			
			if(targetName.equals(foods[k])) {
				
				for(int j = k; j<foods.length-1; j++) {
					foods[j]=foods[j+1];
				}
				for(int i = 0; i<temp.length;i++) {
					temp[i]=foods[i];
				}
				foods=temp; temp=null;
			}
		}
		*/
		int idx = indexOf(targetName);
		if(idx>0) {	
			for(int j = idx; j<foods.length-1; j++) {
				foods[j]=foods[j+1];
			}
			for(int i = 0; i<temp.length;i++) {
				temp[i]=foods[i];
			}
			foods=temp; temp=null;
			
		}
		else {
			System.out.println("없는 음식");
		}
		
	}
	
	//특정 음식 수정 메서드
	static void modify(int targetIdx, String newFood) {
		foods[targetIdx]=newFood;
	}

	public static void main(String[] args) {

		printFood();
		push("라면");
		push("김치찌개");
		printFood();
		
		//파스타의 인덱스를 알아내세요.
		System.out.println(indexOf("파스타"));
		//김치찌개의 인덱스를 알아내세요.
		System.out.println(indexOf("김치찌개"));
		//짜장면의 인덱스를 알아내세요. -> -1을 리턴
		System.out.println(indexOf("짜장면"));
		
		remove("김치찌개");
		remove("망고"); //존재하지않는 음식명입니다. 출력
		printFood();
		
		//라면의 존재여부
		System.out.println(include("라면"));
		//양념치킨 존재여부
		System.out.println(include("양념치킨"));
		//2번 인덱스 데이터 닭갈비로 수정
		modify(2,"닭갈비");
		printFood();

	}

}














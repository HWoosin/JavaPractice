package oop.string;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {

		String str ="Hello java";
		String str2 = "Hello java";
		System.out.println(str==str2);
		
		//charAt(index): 문자열 인덱스에 따른 단일 문자 반환.
		char c = str.charAt(4);
		System.out.println("4번 인덱스: " + c);
		
		//substring(begin, end): 문자열을 범위 지정하여 추출
		String ss1 = str.substring(1,5); //1번 이상 5번 미만
		System.out.println("ss1: " + ss1);
		
		String ss2 = str.substring(6); //6번부터 끝까지 추출.
		System.out.println("ss2: " + ss2);
		
		//length(): 문자열의 총 길이 반환
		int len = str.length();
		System.out.println("len: " + len);
		
		//indexOf(str): 해당 문자가 있는 인덱슬르 반환
		//해당 문자가 존재하지 않으면 -1리턴
		//앞부터 검색, 먼저 발견된 인덱스 줌
		int idx1 = str.indexOf("l");
		System.out.println("idx1: " + idx1);
		
		//뒤부터 검색
		int idx2 = str.lastIndexOf("l");
		System.out.println("idx2: " + idx2);
		
		//여러 문자를 전달하면 시작하는 인덱스를 가르쳐줌
		int idx3 = str.indexOf("java");
		System.out.println("idx3: "+ idx3);
		
		//일괄 대/소문자 변경
		String str3 ="HeLLO WorLD";
		String lower = str3.toLowerCase(); //일괄 소문자 변경
		System.out.println("lower: "+ lower);
		String upper = str3.toUpperCase();
		System.out.println("upper: "+ upper);
		
		//trim(): 문자열의 앞, 뒤 공백을 제거
		String name ="					황우신				";
		System.out.println(name.trim() + "님 안녕하세요~!");
		
		//replace(old, new): 기존 문자열 내부의 old값을 모두 찾아서 new 문자열로 일괄 변경.
		String java = "자바 재밌습니다. 자바 커피는 맛있습니다.";
		System.out.println(java.replace("자바", "Java"));
		System.out.println(java.replace("습니", ""));

		//split: 문자열을 구분자로 구분하여 분할.
		//분할된 문자들은 String 배열에 담아서 리턴
		String phone ="010-1234-5678";
		String[] nums = phone.split("-");
		System.out.println(Arrays.toString(nums));
		
		String pet = "멍멍이, 야옹이, 쨱쨰기";
		String[] pets = pet.split(", ");
		System.out.println(Arrays.toString(pets));
		
		System.out.println("=====================================");
		
		//문자열의 정수/실수 변환
		String s1 = "100";
		String s2 = "3.14";
		
		int i = Integer.parseInt(s1); //문자열 ->정수
		double d = Double.parseDouble(s2); //문자열 ->실수
		System.out.println(i+d);
		
		//valueOf: 기본 타입을 문자열로 변경
		System.out.println(3+4);
		System.out.println(String.valueOf(3)+String.valueOf(4));
		
	}

}

















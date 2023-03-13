package etc.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListDelete {

	public static void main(String[] args) {

		/*
		 * 입력받은 이름을 리스트 내에서 삭제하기
		 * 삭제 후 결과 출력
		 * 없으면 없는 친구라고 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		List<String> kakao = new ArrayList<>();
		Collections.addAll(kakao, "무지","네오","어피치","라이언","제이지","춘식이");
		System.out.println("현재 저장된 친구들: "+kakao);
		System.out.print("삭제할 친구: ");
		String name = sc.next();
		
		if(!kakao.contains(name)) {
			System.out.println("없는 친구입니다.");
		}
		else {
			kakao.remove(name);
			System.out.println(kakao);	
		}
		sc.close();
	}

}

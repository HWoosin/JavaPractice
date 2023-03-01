package chap1_HWS;

public class Solution2 {

	public static void main(String[] args) {

		int[] nums= {4,2,6,1,3}; //배열에 제시된 수
		
		for(int i = 0 ; i < nums.length; i++) {//배열 넓이 만큼 반복
			
			int pnStC = 0; //print Star Count
			pnStC= nums[i];
			String star ="★";
			
			System.out.println(star.repeat(pnStC)); //repeat 메소드를 통해 해당 문자를 repeat(n) n만큼 반복출력한다.
			//자바는 ★ * 10 이게 안된다..
		}
	}

}

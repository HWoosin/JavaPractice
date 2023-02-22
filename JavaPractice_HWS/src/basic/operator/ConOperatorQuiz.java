package basic.operator;

public class ConOperatorQuiz {

	public static void main(String[] args) {

		int rn = (int) ((Math.random()*355)+42);
		
		
		System.out.println("발생한 난수:" + rn);
		System.out.println(rn % 2 == 1? "홀수":"짝수");
		
	}

}

package etc.api.lang.math;

public class MathQuiz {
	
	public static int page(int i) {
		//return i=(i/11)+1;
		return (int) Math.ceil(i/10.0);
	}

	public static void main(String[] args) {

		/*
		 * 1~10이 전달되면 1이 반환되고,
		 * 11~20이 전달되면 2가 반환되고,
		 * 21~30이 전달되면 3이 반환되고...
		 */
		System.out.println(page(68)); 
	}

}

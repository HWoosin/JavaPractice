package basic.loop;

public class LoopNastingQuiz01 {

	public static void main(String[] args) {

		int dan =2;
		int hang = 1;
		for( dan =2; dan <=9; dan++) {
			System.out.printf("%d단:\t",dan);
			for(hang=1; hang <=9; hang++) {
				System.out.printf("%dX%d=%d\t", dan, hang, dan*hang);
			}
			System.out.println();
		}

		System.out.println("---------------------------------------------");
		
		int dan2 =2;
		int hang2 =1;
		for(dan2=2; dan2<=9; dan2++) {
			System.out.printf("%d단\t", dan2);
		}
		for(hang2=1; hang2 <=9; hang2++) {
			System.out.println();
			for(dan2=2; dan2<=9; dan2++) {
				System.out.printf("%dX%d=%d\t", dan2, hang2, dan2*hang2);
			}
		}
		System.out.println();
		
		//hang 을 0으로 두고 if문을 만들어 hang이 0이면 "N단" 구문을 먼저 출력하게 하는것도 방법임.
	}
}

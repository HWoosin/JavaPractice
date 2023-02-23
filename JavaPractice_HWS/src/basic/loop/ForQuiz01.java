package basic.loop;

public class ForQuiz01 {
	
	public static void main(String[] args) {
		
		int a = (int)((Math.random()*18)+2);
		
		System.out.printf("*** %d단 ***\n",a);

		
		for(int i =1; i <=19 ; i++) {
			int result = a*i;
			System.out.printf("%d X %d = %d\n",a,i,result);
		}
	}

}

package basic.method;

public class MethodQuiz01 {

	static int calcDivisor(int n) {
		int i;
		int c=0;
		System.out.printf("%d의 약수: \n", n);
		for(i = 1; i <= n; i++) {
			if(n%i==0) {
				c++;
				System.out.print(i+" ");
			}
		}
		System.out.println();
		return c;
	}
	
	public static void main(String[] args) {

		System.out.println(calcDivisor(72)+"개");
		System.out.println(calcDivisor(10)+"개");
		
	}

}










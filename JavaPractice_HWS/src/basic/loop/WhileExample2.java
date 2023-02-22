package basic.loop;

public class WhileExample2 {

	public static void main(String[] args) {

		int x =48; //begin
		
		while(x<= 150) { //end
			if(x % 8 == 0) {
				System.out.printf("%d ",x);
			}
			x++; //step
		}
		
		System.out.println("\n-----------------------------");
		
		int n =1;
		
		while(n<=100) {
			if(n % 4 == 0 && n % 8 != 0) {
				System.out.printf("%d ",n);
			}
			n++;
		}
		
		System.out.println("\n-----------------------------");
		
		int y = 1;
		int c1 = 0;
		while(y <=30000) {
			if(y % 258 ==0) {
				c1++;
			}
			y++;
		}
		System.out.println("258 배수의 갯수 "+ c1 + "개");
		
		System.out.println("\n-----------------------------");
		
		
		int z = 1;
		int c2 = 0;
		while(z<=1000) {
			if(1000 % z ==0 ) {
				c2++;
			}
			z++;
			
		}
		
		System.out.println("1000 약수의 갯수 "+ c2 + "개");
		
	}

}

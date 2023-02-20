package basic;

public class CastingExample3 {

	public static void main(String[] args) {

		char c = 'B';
		int i = 2;
		
		//서로 타입이 다른 기본 데이터의 연산 시에는 데이터 타입이 큰 쪽에
		//작은 쪽이 맞춰져서 자동으로 형 변환이 진행된 뒤에 연산이 진행된다.
		
		int intResult = c+i; //작은 형을 큰 형으로 UpCasting
		char charResult = (char)(c+i);
		
		System.out.println(intResult); //66+2
		System.out.println(charResult); // B 에서 두번 가면 D
		
		int k = 10;
		double d = (double)k/4; // 4가 int 이기 때문(int / int = int) 
		// 그걸 double 에 담으므로 2.0이 나오지만, 
		// k를 double로, 또는 4를 4.0(실수리터럴)으로 변환햐면 2.5 나온다. 
		System.out.println(d);
		
		//int보다 작은 크기의 데이터 연산은 자동으로 값이
		//int로 변환되어 처리된다. (데이터의 손상을 막기위해)
		byte b1 = 100;
		byte b2 = 70;
		System.out.println(b1+b2);
		
	}

}

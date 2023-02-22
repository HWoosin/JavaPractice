package basic.begin;

public class VariableExample {
	
	public static void main(String[] args) {
		/*
		 #변수 (Variable)
		 1. 변수는 데이터가 저장되는 공간에 이름을 붙여놓은것.
		 2. 변수는 생성할 때 변수에 저장되는 데이터의 크기와 모양에 따라 맞는 데이터 형을 선언해야 한다.
		 	ex) int : 4바이트 정수, String: 문자열(문장)
		 3. 변수는 동일한 이름으로 중복 선언할 수 없음.
		 4. 변수 내부의 값은 언제든지 변경 가능.
		 */
		
		//변수 선언: [자료형 ex)int] [변수명]= [값];
		int a; //변수의 초기화: 초깃값을 넣음 '=' 가 assignment(할당)
		a=10;
		double b;
		b=20.2;
		float c;
		c=20;
		String d;
		d="하이~";
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		//변수는 선언과 초기화를 동시에 할 수 있다.(처음 만들때 한번만 가능)
		int score = 90;
		//int score = 80; (x)이미 위에서 score변수 선언했음, 중복
		score = 95; // 자료형을 안쓰면 위의 score변수에 다른값을 할당하여 사용.
		System.out.println(score);// 기본값 90이 사라지고 새로 할당된 95가 출력됨.
		
		//변수에는 다름변수의 값이 저장이 된다.
		int myscore = score - 20 ;
		System.out.println(myscore);
		//변수의 자료형이 맞지않는 데이터는 저장이 불가능 합니다.
		//int count = "한번" (x) 문자열은 정수형에 들어갛수없다.
		//int count = 23.5 (x) 실수는 정수형에 들어갛수없다.
		//String str = 100 (x) 정수는 문자형에 들어갛수없다.
		
		//변수는 자료형이 달라도 이름이 동일하더라면, 중복선언할 수 없다.
		String name ="홍길동";
		//int name = 1004; (x)
		
		//선언 및 초기화하지 않은 변수는 사용이 불가능 하다.
		//int result = myscore + num; (x) num이 선언되지 않았음
		int result;
		//System.out.println(result); (x) 변수가 초기화되지않았으므로 출력안됨 즉, 값이 없음
	}

}

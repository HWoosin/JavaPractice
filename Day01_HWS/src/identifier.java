
public class identifier {

	public static void main(String[] args) {
		//꼭 지켜야 할 규칙(안 지킬시 에러가 발생한다.)
		//1.식별자의 이름은 중복을 허용하지 않는다. 그리고 대/소문자를 철저하게 구분한다.
		int age = 35;
//		int age = 30; (x)
		int Age = 40;
		
		System.out.println(age);
		System.out.println(Age);
		
		//2. 식별자 이름은 숫자로 지정하거나 숫자로 시작하면 안된다.
		int age26 = 26;
		//int 26age = 26; (x)
		//int 26000 = 26; (x)
		
		//3. 식별자 이름에 공백을 포함할 수 없다.
		//int my birth day = 19980917; (x)
		int mybirthday =19980917;
		int myBirthDay =19980917; //연결단어의 첫글자를 대문자로하는것 관례 => camel case
		
		//4. 식별자 이름에 쓸 수 있는 특수문자는 밑줄(_), 달러기호($) 뿐, 권장하지는 않는다. 쓰기로 약속한곳이 있기 때문.
		String $hello = "ㅎㅇ"; //별로임 쓰지않는게 좋다.
		
		//5. 키워드(예약어)는 식별자 이름으로 사용이 불가능하다.
		//이미 기능을 내포하고 있는 지정문자이기 때문이다.
//		int int = 0; (x)
//		String class = "클래스"; (x)
		String Class ="클래스"; //대 소문자 구분 되지만 추천x ClassName 이라던지 대체하기.
		
		//6. 한글이나 한자 같은 식별자 이름도 지정 가능. 권장x
		int 넘버 = 10;
		String 名 = "황우신";
		System.out.println(넘버);
		System.out.println(名);
		
		//그외 여러가지 있음..
	}

}

package chap2_HWS.quiz01;

public class Person {
	String name;
	String age;
	
	Person(){
		
	}
	
	String info() {
		//System.out.printf("이름: %s 나이: %d " ,name,age);
		return "이름: "+this.name+ " " + "나이: "+this.age+" ";
	}
	
}

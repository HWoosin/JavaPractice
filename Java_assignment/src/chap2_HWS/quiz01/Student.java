package chap2_HWS.quiz01;

public class Student extends Person {
	
	String studentID;

	public String info() {
		return super.info()+"학번: "+studentID;
	}

}

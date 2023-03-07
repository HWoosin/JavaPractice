package chap2_HWS.quiz01;

public class Employee extends Person {
	
	String department;
	
	public String info() {
		return super.info()+"부서: "+department;
	}

}

package chap2_HWS.quiz01;

public class MainClass {

	public static void main(String[] args) {

		Student hong = new Student();
		hong.name ="홍길동";
		hong.age ="30";
		hong.studentID ="a001";
		System.out.println(hong.info()); 
		
		Teacher kim = new Teacher();
		kim.name ="김철수";
		kim.age ="50";
		kim.subject="수학";
		System.out.println(kim.info());
		
		Employee park = new Employee();
		park.name ="박영희";
		park.age ="25";
		park.department = "영업부";
		System.out.println(park.info());
		
	}

}

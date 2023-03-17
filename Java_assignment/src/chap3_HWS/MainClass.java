package chap3_HWS;

public class MainClass {

	public static void main(String[] args) {
		
		//상품생성
		Product tv = new Tv();
		Product radio = new Radio();
		Product com = new Computer();
		
		MyCart my = new MyCart(2100);//내돈
		
		my.buy(tv);
		my.buy(tv);
		my.buy(tv);
		my.info();
		
		
		System.out.println("=========================================================");
		
		
		MyCart you = new MyCart(1000);// 딴사람
		you.buy(radio);
		you.buy(com);
		you.buy(com);
		you.info();

		
		

	}

}

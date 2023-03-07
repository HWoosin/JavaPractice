package chap2_HWS.quiz02;

public class MainClass {

	public static void main(String[] args) {

		Car c = new Car("소나타");
		c.setSpeed(200);
		c.enginStart();
		c.setMode('d');
		c.setSpeed(100);
		c.engineStop();
		c.setSpeed(0);
		c.setMode('p');
		c.engineStop();

	}

}

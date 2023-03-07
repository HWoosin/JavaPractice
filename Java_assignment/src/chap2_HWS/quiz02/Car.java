package chap2_HWS.quiz02;

public class Car {

	private String model;
	private int speed;
	private char mode;
	private boolean start;
	
	Car(String model){
		this.model=model;
		System.out.println(model);
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(!start) {
			System.out.println("시동이 걸려있지 않음");
			
			}
		else {
			if(mode!='d' && mode !='r') {
				System.out.println("D나 R모드가 아니라면 속도를 지정할수없습니다.");
				
			}
			if(speed >200 || speed <0) {
				System.out.println("속도를 지정할수없습니다.");
				
			}
			if(mode=='r') {
				if(speed>40) {
					System.out.println("속도를 40이상 지정할수없습니다.(R)");
					
				}
			}
		}
		
		
		
		this.speed = speed;
	}

	public char getMode() {
		return mode;
	}

	public void setMode(char mode) {
		this.mode = mode;
	}
	
	void enginStart() {//시동걸기
		System.out.println("시동버튼을 눌렀습니다.");
		injectGasoline();
		injectOil();
		this.start=true;
		moveCylinder();
		System.out.println("시동이 걸렸습니다.");
	}
	
	void injectGasoline() {//연료주입
		System.out.println("연료가 엔진에 주입됩니다.");
	}
	void injectOil() {//오일순회
		System.out.println("엔진오일이 순환합니다.");
	}
	void moveCylinder() {
		if(start) {
			System.out.println("실린더가 움직입니다.");
		}
		else {
			System.out.println("실린더가 움직이지않습니다.");
		}
	}
	
	
	void engineStop() {
		if(speed>0) {
			System.out.println("주행중에는 시동을 끌수없습니다.");
		}
		else if(speed ==0) {
			if(mode !='p') {
				System.out.println("P모드로 먼저 변속기를 변경하세요");
			}
			else if(mode =='p') {
				this.start=false;
				System.out.println("시동이 꺼졌습니다.");
			}
			else {
				System.out.println("잘못된입력입니다.");

			}
		}
	}
}










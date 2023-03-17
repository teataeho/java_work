package chap2.quiz02;

public class Car {

	private String model;
	private int speed;
	private char mode;
	private boolean start;

	public Car(String model) {
		this.model = model;
		System.out.println(this.model + "에 탔습니다.");
	}

	public void setSpeed(int speed) {
		if(speed < 0 || speed > 200 || !start || mode == 'P' || mode == 'N') {
			System.out.println("이 상태에선 속도를 지정할 수 없습니다.");
		} else {
			if(mode == 'R' && speed > 40) {
				System.out.println("후진할 때는 40km/h 이상 지정할 수 없습니다.");
			} else {
				this.speed = speed;
			}
		}
	}

	public char getMode() {
		return mode;
	}

	public void setMode(char mode) {
		switch(mode) {
		case 'R': case 'P': case 'N': case 'D':
			this.mode = mode;
			break;
		default:
			this.mode = 'P';
		}
	}
	
	public void engineStart() {
		System.out.println("시동버튼을 눌렀습니다.");
		injectOil();
		injectGasoline();
		start = true;
		moveCylinder();
		System.out.println("시동이 걸렸습니다.");
	}
	
	private void injectGasoline() {
		System.out.println("연료가 엔진에 주입됩니다.");
	}
	
	private void injectOil() {
		System.out.println("엔진오일이 순환합니다.");
	}
	
	private void moveCylinder() {
		if(start) {
			System.out.println("실린더가 움직입니다.");
		} else {
			System.out.println("실린더가 움직이지 않습니다.");
		}
	}
	
	public void engineStop() {
		if(speed > 0) {
			System.out.println("주행 중에는 시동을 끌 수 없습니다.");
			return;
		} else {
			if(mode != 'P') {
				System.out.println("P 모드로 먼저 변속기를 변경하세요.");
				return;
			} else {
				start = false;
				System.out.println("시동이 꺼졌습니다.");
			}
		}
	}

	public boolean isStart() {
		return start;
	}

	public void setStart(boolean start) {
		this.start = start;
	}

}

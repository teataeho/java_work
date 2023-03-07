package chap2.quiz02;

public class MainClass {

	public static void main(String[] args) {
		
		Car c1 = new Car("g90");
		
		c1.setSpeed(50);
		c1.engineStart();
		c1.setMode('D');
		c1.setSpeed(100);
		c1.engineStop();
		c1.setSpeed(0);
		c1.setMode('P');
		c1.engineStop();

	}

}

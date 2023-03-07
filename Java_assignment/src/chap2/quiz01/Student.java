package chap2.quiz01;

public class Student extends Person {
	
	String studentId;

	@Override
	public String info() {
		return super.info() + ", 학번: " + studentId;
	}
	
	

}

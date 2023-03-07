package chap2.quiz01;

public class Teacher extends Person {
	
	String subject;

	@Override
	public String info() {
		String str = super.info();
		return str + ", 과목: " + subject;
	}

		

}

package chap2.quiz01;

public class Employee extends Person {
	
	String departments;

	@Override
	public String info() {
		String str = super.info();
		return str + ", 부서: " + departments;
	}
	
	

}

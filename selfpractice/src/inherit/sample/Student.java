package inherit.sample;

public class Student extends Person{
	private String subject;
	
	public Student() {
	}
	
//	public Student(String subject) {
//		this.subject = subject;
//	}

	public Student(String name, String subject) {
		super(name);
		this.subject = subject;
	}
	
	@Override
	public void out() {
		System.out.println(getName()+ " 학생입니다.");
		System.out.println(this.subject+ "를 수강합니다.");
	}
	
}

package inherit;

import inherit.sample.Professor;
import inherit.sample.Student;

public class AbstractEx {

	public static void main(String[] args) {
		Student student = new Student("홍길동", "자바");
		Professor professor = new Professor("김춘추", "컴퓨터과학");
		student.out();
		professor.out();
	}

}

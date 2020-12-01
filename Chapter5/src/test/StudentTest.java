package test;

import hiding.Student;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student();
//		studentLee.studentName = "이상원";  
		//private으로 바뀌면서 외부 클래스의 접근이 허용되지 않아서 오류뜸
		studentLee.setStudentName("이상원");
		// private인 클래스는 메소드로 호출하면 호출이 가능함
		
		System.out.println(studentLee.getStudentName());
	}
}
package test;

import hiding.Student;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student();
//		studentLee.studentName = "�̻��";  
		//private���� �ٲ�鼭 �ܺ� Ŭ������ ������ ������ �ʾƼ� ������
		studentLee.setStudentName("�̻��");
		// private�� Ŭ������ �޼ҵ�� ȣ���ϸ� ȣ���� ������
		
		System.out.println(studentLee.getStudentName());
	}
}
package school;

import java.util.ArrayList;


public class Subject {
	private String subjectName;		//���� �̸�
	private int subjectId;				//���� ���� ��ȣ
	private int gradeType;			//���� �� ��å
	
	
	private ArrayList<Student> studentList = new ArrayList<Student>();	// �� ������ ���� ��û�� �л� ����Ʈ. register()  �޼��带 ȣ���ϸ� �� ����Ʈ�� �߰���
	
	public Subject(String subjectName, int subjectId) {
		this.subjectName = subjectName;
		this.subjectId = subjectId;
		this.gradeType = gradeType;

	}
	
	public String getSubjectName() {
		return subjectName;
	}
	
	public int getSubjectId() {
		return subjectId;
	}
	
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	
	public ArrayList<Student> getStudentList() {
		return studentList;
	}
	
	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	
	public int getGradeType() {
		return gradeType;
	}
	
	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}
	
	public void register(Student student) {
		studentList.add(student);
	}
}
package hiding;

public class Student {
		int studentID;
		private String studentName;
		//private�� �� Ŭ�������� �� ��밡�� �ϴ� �ܺο����� ����� �� ����.
		int grade;
		String address;
		
		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
			// ���ȿ� �ش��ϴ� �κ�
		}
}

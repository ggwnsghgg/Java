package hiding;

public class Student {
		int studentID;
		public String studentName;
		//private는 이 클래스에서 만 사용가능 하다 외부에서는 사용할 수 없다.
		int grade;
		String address;
		
		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
			// 보안에 해당하는 부분
		}
}

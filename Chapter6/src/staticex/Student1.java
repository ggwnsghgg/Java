package staticex;

		// Ŭ������ 
public class Student1 {
		public static int serialNum = 1000;
		public int studentID;												// ��� ����
		public String studentName;
		public int garde;
		public String address;
		
		// �޼����
		public Student1() {  //  ( ( ) �� �������� ����Ʈ ������)
			serialNum++;
			studentID = serialNum;
		}
		
		public String getStudentName() {
			return studentName;
		}
		
		public void setStudentName(String name) {
			studentName = name;
			
		}
}

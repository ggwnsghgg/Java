package staticex;

		// Ŭ������ 
public class Student2 {
		private static int  serialNum = 1000;
		int studentID;												// ��� ����
		String studentName;
		int garde;
		String address;
		
		// �޼����
		public Student2() {  //  ( ( ) �� �������� ����Ʈ ������)
			serialNum++;
			studentID = serialNum;
		}
		
		public String getStudentName() {
			return studentName;
		}
		
		public void setStudentName(String name) {
			studentName = name;
			
		}
		
		public static int getSerialNum() {
			int i = 10;
			return serialNum;
		}
		
		public static void setSerialNum(int serialNum) {
			Student2.serialNum = serialNum;
		}
}

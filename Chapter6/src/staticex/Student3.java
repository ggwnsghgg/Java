package staticex;

import java.io.Serial;

// Ŭ������ 
public class Student3 {
		private static int  serialNum = 1000;
		int studentID;												// ��� ����
		String studentName;
		int garde;
		String address;
		int studentCard;  //�й� studentID + 100
		
		public Student3() {
			serialNum = serialNum + 100;
			studentID = serialNum;
			studentCard = studentID;
		}
		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String name) {
			studentName = name;
		}
		
}

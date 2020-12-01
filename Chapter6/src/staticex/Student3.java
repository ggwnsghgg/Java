package staticex;

import java.io.Serial;

// 클래스명 
public class Student3 {
		private static int  serialNum = 1000;
		int studentID;												// 멤버 변수
		String studentName;
		int garde;
		String address;
		int studentCard;  //학번 studentID + 100
		
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

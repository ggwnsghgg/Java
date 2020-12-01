package staticex;

		// 클래스명 
public class Student2 {
		private static int  serialNum = 1000;
		int studentID;												// 멤버 변수
		String studentName;
		int garde;
		String address;
		
		// 메서드명
		public Student2() {  //  ( ( ) 가 비여있으면 디폴트 생성자)
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

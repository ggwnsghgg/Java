package staticex;

		// 클래스명 
public class Student1 {
		public static int serialNum = 1000;
		public int studentID;												// 멤버 변수
		public String studentName;
		public int garde;
		public String address;
		
		// 메서드명
		public Student1() {  //  ( ( ) 가 비여있으면 디폴트 생성자)
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

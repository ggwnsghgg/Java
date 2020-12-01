package staticex;

public class StudentTest6 {
		public static void main(String[] args) {
			Student3 studentShin = new Student3();
			studentShin.setStudentName("이지원");
			System.out.println(studentShin.studentID);
			System.out.println(studentShin.studentName + " 학번 : "+ studentShin.studentID);
			
			
			Student3 studentMoon = new Student3();
			studentMoon.setStudentName("손수경");  
			System.out.println(studentMoon.studentID);
			System.out.println(studentMoon.studentName + " 학번 : "+ studentMoon.studentID);
			
		}
}


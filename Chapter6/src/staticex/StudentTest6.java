package staticex;

public class StudentTest6 {
		public static void main(String[] args) {
			Student3 studentShin = new Student3();
			studentShin.setStudentName("������");
			System.out.println(studentShin.studentID);
			System.out.println(studentShin.studentName + " �й� : "+ studentShin.studentID);
			
			
			Student3 studentMoon = new Student3();
			studentMoon.setStudentName("�ռ���");  
			System.out.println(studentMoon.studentID);
			System.out.println(studentMoon.studentName + " �й� : "+ studentMoon.studentID);
			
		}
}


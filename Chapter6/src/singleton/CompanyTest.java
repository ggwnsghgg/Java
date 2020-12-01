package singleton;

public class CompanyTest {
	public static void main(String[] args) {
		Company myCompnay1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		System.out.println(myCompnay1 == myCompany2);
		
	}
}
 
package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customerLee = new Customer(10010, "이순신");
//		customerLee.setCustomerID(10010);
//		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustmoer custmoerKim = new VIPCustmoer(10020, "김유신", 10000);
		
//		custmoerKim.setCustomerID(10020);
//		custmoerKim.setCustomerName("김유신");
//		custmoerKim.bonusPoint = 10000;
		System.out.println(custmoerKim.showCustomerInfo());
		
	}

}

package inheritance;

public class OverridingTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer vc = new VIPCustmoer(10030, "나몰라", 2000);		// VIP 고객 생성
		vc.bonusPoint = 1000;
		
		System.out.println(vc.getCustomerName()+ " 님이 지불해야 하는 금액은" + vc.calcPrice(10000) + "원 입니다.");
		

	}

}

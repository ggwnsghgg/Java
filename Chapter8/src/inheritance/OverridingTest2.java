package inheritance;

public class OverridingTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer vc = new VIPCustmoer(10030, "������", 2000);		// VIP ���� ����
		vc.bonusPoint = 1000;
		
		System.out.println(vc.getCustomerName()+ " ���� �����ؾ� �ϴ� �ݾ���" + vc.calcPrice(10000) + "�� �Դϴ�.");
		

	}

}
package Interfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		// Customer Ŭ�������� customer�� Buy �ζ����̽����� buyer�� �����Ͽ� �� ��ȯ. buyer�� Buy �������̽��� �޼��常 ȣ�� ����
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		
		// Customer Ŭ�������� customer�� Sell �ζ����̽����� seller�� �����Ͽ� �� ��ȯ. seller�� Sell �������̽��� �޼��常 ȣ�� ����
		Sell seller = customer;
		seller.sell();
		seller.order();
		
		if(seller instanceof Customer) {
			//seller�� ���� Ŭ�������� Customer�� �ٽ� �� ��ȯ
			Customer customer2 = (Customer)seller;
			customer2.buy();
			customer2.sell();
			customer2.order();
		}
		
	}

}
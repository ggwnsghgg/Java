package classpart;

public class ShoppingTest {
		private String order_num;
		private String order_id;
		private String order_day;
		private String order_item_num;
		private String order_name;
		private String order_address;

		public static void main(String[] args) {
			ShoppingTest test = new ShoppingTest();
			test.order_num  = "201803120001";
			test.order_id = "abc123";
			test.order_day = "2018�� 3�� 12��";
			test.order_name = "ȫ���";
			test.order_item_num = "PD0345-12";
			test.order_address = "����� �������� ���ǵ��� 20����";
		
			System.out.println("�ֹ� ��ȣ : " + test.order_num);
			System.out.println("�ֹ��� ���̵� : " +test.order_id);
			System.out.println("�ֹ� ��¥ : " + test.order_day);
			System.out.println("�ֹ��� �̸� : " + test.order_name);
			System.out.println("�ֹ� ��ǰ ��ȣ : " + test.order_item_num);
			System.out.println("��� �ּ� " + test.order_address);

	}

}

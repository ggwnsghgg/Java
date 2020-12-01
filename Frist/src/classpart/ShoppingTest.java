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
			test.order_day = "2018년 3월 12일";
			test.order_name = "홍길순";
			test.order_item_num = "PD0345-12";
			test.order_address = "서울시 영등포구 여의도동 20번지";
		
			System.out.println("주문 번호 : " + test.order_num);
			System.out.println("주문자 아이디 : " +test.order_id);
			System.out.println("주문 날짜 : " + test.order_day);
			System.out.println("주문자 이름 : " + test.order_name);
			System.out.println("주문 상품 번호 : " + test.order_item_num);
			System.out.println("배송 주소 " + test.order_address);

	}

}

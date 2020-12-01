package classpart;

public class Shopping {
		String order_num;
		String order_id;
		String order_day;
		String order_name;
		String order_item_num;
		String order_address;
		
		
public String getOrder_num() {
		return order_num;
}
public String getOrder_id() {
	return order_id;
}
public String getOrder_day() {
	return order_day;
}
public String getOrder_name() {
	return order_name;
}
public String getOrder_item_num() {
	return order_item_num;
}
public String getOrder_address() {
	return order_address;
}
		public static void main(String[] args) {
			Shopping test = new Shopping();
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

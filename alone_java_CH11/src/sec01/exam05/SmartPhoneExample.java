package sec01.exam05;

public class SmartPhoneExample {
		public static void main(String[] args) {
			SmartPhone myPhone = new SmartPhone("����", "�ȵ���̵�");
			
			
			String strObj = myPhone.toString();	// �����ǵ� toString() ȣ��
			System.out.println(strObj);
			
			// �����ǵ�  toString()�� ȣ���ϰ� ���ϰ��� �޾� ���
			System.out.println(myPhone);
		}
}

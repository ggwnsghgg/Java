package sec02.exam03;

public class VechicleExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare(); // ( x) Vehicle �������̽��� checkFare()�� ����
		
		Bus bus = new Bus();     // ���� Ÿ�� ��ȯ
		
		
		// Bus Ŭ�������� checkFare�� ����
		bus.run();							
		bus.checkFace(); 
	}

}

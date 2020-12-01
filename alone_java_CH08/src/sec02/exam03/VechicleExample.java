package sec02.exam03;

public class VechicleExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare(); // ( x) Vehicle 인터페이스는 checkFare()가 없음
		
		Bus bus = new Bus();     // 강제 타입 변환
		
		
		// Bus 클래스에는 checkFare가 있음
		bus.run();							
		bus.checkFace(); 
	}

}

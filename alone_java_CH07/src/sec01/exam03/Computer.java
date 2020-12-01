package sec01.exam03;

public class Computer extends Calculator{

	@Override
	double areaCircle(double r) {
		// TODO Auto-generated method stub
		System.out.println("Computer 按眉狼  areaCircle() 角青");
		return Math.PI * r * r;
	}
	
//	@Override
//	double areaCircle(double r) {
//		System.out.println("Computer 按眉狼  areaCircle() 角青");
//		return Math.PI * r * r;
//	}
}

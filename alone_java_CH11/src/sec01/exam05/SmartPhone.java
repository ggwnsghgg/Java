package sec01.exam05;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}

	//to String ��������
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return company + ", " + os;
	}
	
}

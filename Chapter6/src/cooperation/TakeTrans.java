package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		
		// �л� �θ� ����
		Student studentJames = new Student("James", 5000);		
		Student studentTomas = new Student("Tomas", 10000);

		
		
		Bus bus100 = new Bus(100);			// �뼱 ��ȣ 100���� ���� ����
		studentJames.takeBus(bus100);		// james�� ���� ž��
		studentJames.showInfo();				// james ���� ���
		bus100.showInfo();						// ���� ���� ���
		
		
		Subway subwayGreen = new Subway("2ȣ��");		// �뼱 ��ȣ 2���� ����ö ����
		studentTomas.takeSubway(subwayGreen);			// tomas�� ����ö ž��
		studentTomas.showInfo();									// tomas ���� ���
		subwayGreen.showInfo();									// ����ö ���� ���
	}

}

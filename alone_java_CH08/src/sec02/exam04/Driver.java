package sec02.exam04;

import sec02.exam03.Bus;
import sec02.exam03.Vehicle;

public class Driver {
								//Bus ��ü , Taxi ��ü
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {			// vehicle �Ű� ������  �����ϴ� ��ü�� Bus���� ����
			Bus bus = (Bus) vehicle;          // Bus ��ü�� ��� �����ϰ� ���� Ÿ�� ��ȯ
			bus.checkFace();                    // BusŸ������ ����Ÿ�� ��ȯ�� �ϴ� ����
		}
		vehicle.run();
	}

}

package sec01.exam01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		//DmbCellPhnoe ��ü ����
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 19);
		
		//CellPhnoe Ŭ�����κ��� ��ӹ��� �ʵ�
		System.out.println("��: " + dmbCellPhone.model);
		System.out.println("����: " + dmbCellPhone.color);
		
		
		//DmbCellPhnoe Ŭ������ �ʵ�
		System.out.println("ä��: " + dmbCellPhone.channel);
		
		
		//CellPhnoe Ŭ�����κ��� 
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�̿���");
		dmbCellPhone.sendVoice("�� ~ �� �ݰ����ϴ�.");
		dmbCellPhone.hangup();
		
		
		//DmbCellPhone Ŭ������ �޼ҵ� ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();

	}

}

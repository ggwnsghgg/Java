package inheritance;

public class VIPCustmoer extends Customer {
			
		private int agentID;						//VIP ���� ��� ���� ���̵�
		double saleRatio;							//������
		
		public VIPCustmoer(int customerID, String customerName, int agentID) {
			super(customerID, customerName);
			customerGrade = "VIP";				//������� VIP
			bonusRatio = 0.5;						//���ʽ� ���� 5%
			saleRatio = 0.1;						//������ 10%
			this.agentID = agentID;
//			System.out.println("VIPCustomer(int, String, int) ������ ȣ��");
		}
		
		
		 // Overwritting(����� - �θ� ������ �ڽ��� ���� ��)
		
		@Override
		public int calcPrice(int price) {
			bonusPoint += price * bonusRatio;
			return price - (int)(price * saleRatio);
		}
		
		public int getAgentID() {							// VIP �������� �ʿ��� �޼���
			return agentID;
		}
		public String showCustomerInfo() {
			return customerName + " ���� Grade��" + customerGrade;
		}
		
	}

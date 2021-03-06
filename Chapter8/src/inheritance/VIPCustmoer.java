package inheritance;

public class VIPCustmoer extends Customer {
			
		private int agentID;						//VIP 고객 담당 상담원 아이디
		double saleRatio;							//할인율
		
		public VIPCustmoer(int customerID, String customerName, int agentID) {
			super(customerID, customerName);
			customerGrade = "VIP";				//고객등급 VIP
			bonusRatio = 0.5;						//보너스 적립 5%
			saleRatio = 0.1;						//할인율 10%
			this.agentID = agentID;
//			System.out.println("VIPCustomer(int, String, int) 생성자 호출");
		}
		
		
		 // Overwritting(덮어쓰기 - 부모 성질을 자식이 덮어 씀)
		
		@Override
		public int calcPrice(int price) {
			bonusPoint += price * bonusRatio;
			return price - (int)(price * saleRatio);
		}
		
		public int getAgentID() {							// VIP 고객에만 필요한 메서드
			return agentID;
		}
		public String showCustomerInfo() {
			return customerName + " 님의 Grade은" + customerGrade;
		}
		
	}


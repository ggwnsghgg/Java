package exception;

public class IDFormatTest {
	private String userID;
	
	public String getUserID() {
		return userID;
	}
						// ���̵� ���� ���� ���� ����
	 public void setUserID(String userID) throws IDFormatExcetpion  { //IDFormatException ���ܸ� setUserID()�޼��尡 ȣ��� �� ó���ϵ��� �̷�
		if(userID == null) {
			throw new IDFormatExcetpion("���̵�� nulll�� �� �����ϴ�");		//������ ���� �߻���Ŵ
		}
		else if(userID.length() < 8 || userID.length() >20) {
			throw new IDFormatExcetpion("���̵�� 8�� �̻� 20�� ���Ϸ� ������.");			//������ ���� �߻���Ŵ
		}
		this.userID = userID;
	}
	 
	 public static void main(String[] args)  {
		 IDFormatTest test = new IDFormatTest();
		 
		 
		 //���̵� ���� null�� ���
		 String userID = null;
		 try {
			test.setUserID(userID);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		 
		 
		 // ���̵� ���� 8�� ������ ���
		 userID = "12345678";
		 try {
			test.setUserID(userID);
		} catch (IDFormatExcetpion e) {
			System.out.println(e.getMessage());
		}
	 }

}

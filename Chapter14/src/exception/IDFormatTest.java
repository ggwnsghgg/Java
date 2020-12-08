package exception;

public class IDFormatTest {
	private String userID;
	
	public String getUserID() {
		return userID;
	}
						// 아이디에 대한 제약 조건 구현
	 public void setUserID(String userID) throws IDFormatExcetpion  { //IDFormatException 예외를 setUserID()메서드가 호출될 때 처리하도록 미룸
		if(userID == null) {
			throw new IDFormatExcetpion("아이디는 nulll일 수 없습니다");		//강제로 예외 발생시킴
		}
		else if(userID.length() < 8 || userID.length() >20) {
			throw new IDFormatExcetpion("아이디는 8자 이상 20자 이하로 쓰세요.");			//강제로 예외 발생시킴
		}
		this.userID = userID;
	}
	 
	 public static void main(String[] args)  {
		 IDFormatTest test = new IDFormatTest();
		 
		 
		 //아이디 값이 null인 경우
		 String userID = null;
		 try {
			test.setUserID(userID);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		 
		 
		 // 아이디 값이 8자 이하인 경우
		 userID = "12345678";
		 try {
			test.setUserID(userID);
		} catch (IDFormatExcetpion e) {
			System.out.println(e.getMessage());
		}
	 }

}

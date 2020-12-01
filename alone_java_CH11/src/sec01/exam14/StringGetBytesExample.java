package sec01.exam14;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "�ȳ��ϼ���";
		
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length : " + bytes1.length);
		String str1 = new String(bytes1);
		System.out.println("bytes1->String: " + str1);
		
		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes1.length : " + bytes2.length);
			String str2 = new String(bytes1);
			System.out.println("bytes1->String: " + str2);
			
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes1.length : " + bytes3.length);
			String str3 = new String(bytes1);
			System.out.println("bytes1->String: " + str3);
		}catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
	}

}

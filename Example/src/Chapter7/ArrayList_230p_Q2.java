package Chapter7;

public class ArrayList_230p_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alphabets = new char[26];
		char ch = 'a';
		int tmp;
		char[] alphabets2 = new char[26];
		
		
		for(int i = 0; i < alphabets.length; i ++, ch++) {
			alphabets[i] = ch;
		}
		
		for(int i = 0; i < alphabets.length; i ++) {
			if ( (97 <= alphabets[i]) && (alphabets[i] <= 122)) {
				alphabets2[i] += (char)(alphabets[i] - 32);
				System.out.println(alphabets[i] + "," + alphabets2[i]);
				
				
			}
			
		}
	
	}

}

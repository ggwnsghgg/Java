package Chapter7;

public class ArrayList_230p_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numArray = new int[5];
		int evenCnt = 0;
		int sum = 0;
		
		for(int i=1; i< 10; i++) {
			if(i % 2 ==0) {
				numArray[evenCnt] = i;
					evenCnt++;
			}
		}
	       for (int i = 0; i < numArray.length; i++) {
               sum += numArray[i];    
	       }
	       	System.out.println(sum);
		}
		
	}


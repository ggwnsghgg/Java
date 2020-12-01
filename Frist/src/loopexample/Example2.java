package loopexample;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		int num1;
		int num2;
		
		for(num1 = 2;  num1 <= 9; num1++) {
			for(num2 = 1; num2 <= 9; num2++) {
				System.out.println(num1 + "x" +num2 + "=" + num1*num2);
				if(num2 % 2 ==0) {
					continue;
					}
				}
			}
		}
	}

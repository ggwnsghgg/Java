package IfExample;

import java.util.Scanner;

///*
//1. �ǹ��� �� ������ �Է� �ޱ� => scan �ϳ� �� �ޱ�
//2. �� ������ �Է� ������ ���ؼ� �迭�� ������ �����ϱ� => �迭���� ������ (���� ã�ƺ���!!)
//3. ���� ������ ���ؼ� Scanner�� �Է� �޾� �迭�� �ʱⰪ ���� => ����ڰ� �౹ �����ܰ� => {"�౹", "�����ܰ�"}
//*/


public class CH04_p106_mission2 {

	public static void main(String[] args) {
		// "" str ���϶�
		// '' char ���϶�
		
		
		// �ǹ� �� �Է��ϱ�
		System.out.println("�ǹ���  ���� �Է��ϼ��� ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		
		// �Է¹��� �� �� ��ŭ �迭�� ����
		String[] building_info = new String[num];
		int size = building_info.length;
		
		
		// �迭�� (size) ũ�⸸ŭ for�� �Է��Ͽ� �� �� �����Է��ϱ�
		 for(int i=0; i<size; i++){
			Scanner put = new Scanner(System.in);
			 System.out.println("�� �� ������ �Է��ϼ��� ");
			 	building_info[i] = put.nextLine();
			 	
	           }
		 // �� for�� ������ ���� �� �� ���� ������ֱ�
	             for(int i=0; i<size; i++){
	            	 System.out.println("�̸�: " +building_info[i]);
	       }
	             
	    //  �̵��ϰ��� �ϴ� �� �Է��ϱ�
	   System.out.println("  --------------------------------------  ");
	   
	         	System.out.println("�̵��Ͻ�  ���� �Է��ϼ��� ");
	    		Scanner button = new Scanner(System.in);
	    		int move = button.nextInt();
	    		button.close();
		System.out.println("  --------------------------------------  ");
		
		
		
		// switch �� 
		switch(move) {
		case 1:
			System.out.println(move + "�� " + building_info[0] + " �Դϴ�." );
			sc.close();
			break;
		case 2:
			System.out.println(move + "�� " + building_info[1] + " �Դϴ�." );
			sc.close();
			break;
		case 3:
			System.out.println(move+ "�� " + building_info[2] + " �Դϴ�." );
			sc.close();
			break;
		case 4:
			System.out.println(move + "�� " + building_info[3] + "�Դϴ�." );
			sc.close();
			break;
		case 5:
			System.out.println(move +  "�� " + building_info[4] + " �Դϴ�." );
			sc.close();
			break;
		default:
			System.out.println("�߸��� ���� �����̽��ϴ�.");
			
		}
	}
}





           // ����� Ǯ��


//
//package ifexample;
//
//import java.util.Scanner;
//
//
//public class CH04_p106_alone2 {
//   
//   public static void main(String[] args) {
//      
//      System.out.println("������ ���� �� �� �ΰ���?"); // �迭���� ���� �Է� �ȳ� �޽���
//      
//      Scanner scan1 = new Scanner(System.in);     // ����ڿ��� �迭���� ���� �Է� ����
//      int floor_count;                            // ����ڿ��� ���� ���� �����ϴ� ����
//      floor_count = scan1.nextInt();              // ����ڿ��� ���� ���� ������ ����
//      
//      scan1.close();
//      
//      String[] name = new String[floor_count];    // name�� �迭���� ������ ����
//      
//      System.out.println("�� ���� ���� ������ �Է��ϼ���. ex) �౹ ����(�� �� ���) �����ܰ�"); // 1�� : �౹, 2�� �����ܰ�
//      Scanner scan2 = new Scanner(System.in);
//      
//      scan2.close();
//      
//      System.out.println(floor_count); // �Էµ� ���� �� ���Դ��� Ȯ���ϴ� ��ɾ�
//      
//      for (int i = 0; i < floor_count; i++) {
//         name[i] = scan2.next();
//      }
//      
//      for (int i = 0; i < floor_count; i++) {
//         System.out.println("���� ���� ���� ������ " + (i+1) + "�� : " + name[i]);
//      }
//   }
//}

package IfExample;

import java.util.Scanner;

///*
//1. 건물이 몇 층인지 입력 받기 => scan 하나 더 받기
//2. 몇 층인지 입력 받은걸 통해서 배열방 갯수로 지정하기 => 배열에서 디테일 (몰라도 찾아보자!!)
//3. 층별 업종에 대해서 Scanner로 입력 받아 배열방 초기값 설정 => 사용자가 약국 정형외과 => {"약국", "정형외과"}
//*/


public class CH04_p106_mission2 {

	public static void main(String[] args) {
		// "" str 값일때
		// '' char 값일때
		
		
		// 건물 층 입력하기
		System.out.println("건물의  층을 입력하세요 ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		
		// 입력받은 층 수 만큼 배열방 생성
		String[] building_info = new String[num];
		int size = building_info.length;
		
		
		// 배열방 (size) 크기만큼 for문 입력하여 층 별 정보입력하기
		 for(int i=0; i<size; i++){
			Scanner put = new Scanner(System.in);
			 System.out.println("층 별 정보를 입력하세요 ");
			 	building_info[i] = put.nextLine();
			 	
	           }
		 // 위 for문 끝나면 받은 층 별 정보 출력해주기
	             for(int i=0; i<size; i++){
	            	 System.out.println("이름: " +building_info[i]);
	       }
	             
	    //  이동하고자 하는 층 입력하기
	   System.out.println("  --------------------------------------  ");
	   
	         	System.out.println("이동하실  층을 입력하세요 ");
	    		Scanner button = new Scanner(System.in);
	    		int move = button.nextInt();
	    		button.close();
		System.out.println("  --------------------------------------  ");
		
		
		
		// switch 문 
		switch(move) {
		case 1:
			System.out.println(move + "층 " + building_info[0] + " 입니다." );
			sc.close();
			break;
		case 2:
			System.out.println(move + "층 " + building_info[1] + " 입니다." );
			sc.close();
			break;
		case 3:
			System.out.println(move+ "층 " + building_info[2] + " 입니다." );
			sc.close();
			break;
		case 4:
			System.out.println(move + "층 " + building_info[3] + "입니다." );
			sc.close();
			break;
		case 5:
			System.out.println(move +  "층 " + building_info[4] + " 입니다." );
			sc.close();
			break;
		default:
			System.out.println("잘못된 층을 누르셨습니다.");
			
		}
	}
}





           // 강사님 풀이


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
//      System.out.println("빌딩의 층이 몇 개 인가요?"); // 배열방의 갯수 입력 안내 메시지
//      
//      Scanner scan1 = new Scanner(System.in);     // 사용자에게 배열방의 갯수 입력 받음
//      int floor_count;                            // 사용자에게 받은 값을 저장하는 변수
//      floor_count = scan1.nextInt();              // 사용자에게 받은 값을 실제로 저장
//      
//      scan1.close();
//      
//      String[] name = new String[floor_count];    // name의 배열방의 갯수를 조정
//      
//      System.out.println("각 층별 입점 정보를 입력하세요. ex) 약국 엔터(한 줄 띄기) 정형외과"); // 1층 : 약국, 2층 정형외과
//      Scanner scan2 = new Scanner(System.in);
//      
//      scan2.close();
//      
//      System.out.println(floor_count); // 입력된 값이 잘 들어왔는지 확인하는 명령어
//      
//      for (int i = 0; i < floor_count; i++) {
//         name[i] = scan2.next();
//      }
//      
//      for (int i = 0; i < floor_count; i++) {
//         System.out.println("빌딩 층별 입점 정보는 " + (i+1) + "층 : " + name[i]);
//      }
//   }
//}

package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		
		// 학생 두명 생성
		Student studentJames = new Student("James", 5000);		
		Student studentTomas = new Student("Tomas", 10000);

		
		
		Bus bus100 = new Bus(100);			// 노선 번호 100번인 버스 생성
		studentJames.takeBus(bus100);		// james가 버스 탑승
		studentJames.showInfo();				// james 정보 출력
		bus100.showInfo();						// 버스 정보 출력
		
		
		Subway subwayGreen = new Subway("2호선");		// 노선 번호 2번인 지하철 생성
		studentTomas.takeSubway(subwayGreen);			// tomas가 지하철 탑승
		studentTomas.showInfo();									// tomas 정보 출력
		subwayGreen.showInfo();									// 지하철 정보 출력
	}

}

package school;

public class MajorEvaluation implements GradeEvaluation{

	
	// 필수 과목 점수를 point 변수로 받아온후에 grade String 타입으로 넘겨서
	// if문에 조건을 추가하여 A ~ F로 나눈후 grade 값에 넘기기
	
	@Override
	public String getGrade(int point) {
		// TODO Auto-generated method stub
		String grade;
		// TODO Auto-generated method stub

		
		
		if(point >= 95 && point <= 100)
			grade = "S";
		else if (point >= 90)
			grade = "A";
		else if (point >= 80)
			grade = "B";
		else if (point >= 70)
			grade = "C";
		else if (point >= 60)
			grade = "D";
		else
			grade = "F";
		return grade;
	}

}

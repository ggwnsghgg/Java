package school;

public class MajorEvaluation implements GradeEvaluation{

	
	// �ʼ� ���� ������ point ������ �޾ƿ��Ŀ� grade String Ÿ������ �Ѱܼ�
	// if���� ������ �߰��Ͽ� A ~ F�� ������ grade ���� �ѱ��
	
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
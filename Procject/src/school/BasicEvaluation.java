package school;

public class BasicEvaluation implements GradeEvaluation{

	
	// �Ϲ� ���� ������ point ������ �޾ƿ��Ŀ� grade String Ÿ������ �Ѱܼ�
	// if���� ������ �߰��Ͽ� A ~ F�� ������ grade ���� �ѱ��
	
	@Override
	public String getGrade(int point) {
		// TODO Auto-generated method stub
		String grade;
		
		if(point >= 90 && point <= 100)
			grade = "A";
		else if (point >= 80)
			grade = "B";
		else if (point >= 70)
			grade = "C";
		else if (point >= 55)
			grade = "D";
		else
			grade = "F";
		return grade;
	}
	
}

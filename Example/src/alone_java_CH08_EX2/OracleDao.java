package alone_java_CH08_EX2;

public class OracleDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("Oraclel DB���� �˻� ");
		
	}

	@Override
	public void insert() {
		System.out.println("Oraclel DB�� ���� ");
		
	}

	@Override
	public void update() {
		System.out.println("Oraclel DB�� ���� ");
		
	}

	@Override
	public void delete() {
		System.out.println("Oraclel DB���� ���� ");
		
	}

}

package alone_java_CH08_EX2;

public class OracleDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("Oraclel DB에서 검색 ");
		
	}

	@Override
	public void insert() {
		System.out.println("Oraclel DB에 삽입 ");
		
	}

	@Override
	public void update() {
		System.out.println("Oraclel DB를 수정 ");
		
	}

	@Override
	public void delete() {
		System.out.println("Oraclel DB에서 삭제 ");
		
	}

}

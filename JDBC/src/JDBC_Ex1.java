import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Ex1 {
	
	public static void main(String[] args) {
		
		Connection conn;
		Statement stmt = null;
		
		String url = "jdbc:mysql://localhost:3306/sampledb?serverTimezone=UTC";
		String id = "root";
		String pw = "1234";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,id,pw);
			
			System.out.println("DB 연결 완료");
			stmt = conn.createStatement();
			ResultSet srs = stmt.executeQuery("select * from student");
			
			printData(srs, "name", "id", "dept");
			srs = stmt.executeQuery("select name, id, dept from student where name='이기자'");
			
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("JDBC 드라이버 로드 에러");
		}catch (SQLException e) {
			System.out.println("DB 연결 에러");
		}
	}
	
	private static void printData(ResultSet srs, String col1, String col2, String col3) throws SQLException {
		while(srs.next()) {
			if(col1 != "")
				System.out.print(new String(srs.getString("name")));
			if(col2 != "")
				System.out.print("\t|\t" + srs.getString("id"));
			if(col3 !="")
				System.out.print("\t|\t" + new String(srs.getString("dept")));
			else
				System.out.println();
		}
	}

}

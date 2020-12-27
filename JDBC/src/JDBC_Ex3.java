import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Ex3 {
	
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
			stmt.executeUpdate("insert into student (name, id, dept) values('아무개','0893012','컴퓨터공학');");
			
			printTable(stmt);
			stmt.executeUpdate("update student set id='0189011' where name='아무개'");
			
			printTable(stmt);
			stmt.executeUpdate("delete from student where name='아무개'");
			
			printTable(stmt);
			
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("JDBC 드라이버 로드 에러");
		}catch (SQLException e) {
			System.out.println("DB 연결 에러");
		}
	}
	
	private static void printTable(Statement stmt) throws SQLException {
		ResultSet srs = stmt.executeQuery("select * from student");
		while(srs.next()) {
			System.out.println(new String(srs.getString("name")));
			System.out.println("\t|\t" + srs.getString("id"));
			System.out.println("\t|\t" + new String(srs.getString("dept")));
		}
	}

}

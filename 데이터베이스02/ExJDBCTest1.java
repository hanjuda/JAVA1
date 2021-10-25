package jdbctest;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ExJDBCTest1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "hr";
		String pw = "hr";
		
		System.out.println("<JDBC 오라클 접속 테스트>");
		
		Class.forName(driver);    // JDBC 드라이버 파일을 로딩.
		DriverManager.getConnection(url, id, pw);
		
		System.out.println("테스트 정상종료.");		
	}
}










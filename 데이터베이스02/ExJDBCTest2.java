package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExJDBCTest2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "hr";
		String pw = "hr";
		
		Connection conn = null;    // (1) Connection 객체를 가리킬 참조변수 선언
		
		System.out.println("<JDBC 오라클 접속 테스트>");
		
		Class.forName(driver);    // JDBC 드라이버 파일을 로딩.
		conn = DriverManager.getConnection(url, id, pw);  // Connection 객체를 얻음
				
		System.out.println("정상적으로 접속됨.");
		
		String sql = "SELECT * FROM jobs";   // [주의] 세미콜론(;) 사용하면 오류.
		Statement stmt = conn.createStatement();  // (2) Statement 객체 생성
		ResultSet rs = stmt.executeQuery(sql);  // (3) SELECT문 실행의 결과집합을 ResultSet객체로 받아옴
		
		// rs.next() : 다음 행! 그런데, 더 이상의 행(row)이 없으면 false를 리턴!
		while(rs.next()) {
			String jobId = rs.getString("job_id");
			String jobTitle = rs.getString("job_title");
			int minSalary = rs.getInt("min_salary");
			int maxSalary = rs.getInt("max_salary");
			System.out.println(jobId + " / "+jobTitle 
								+" / "+minSalary+" / "+maxSalary);
		}
		rs.close();
		stmt.close();
		conn.close();
	}
}









package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExJDBCTest3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "hr";
		String pw = "hr";
		
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url,id,pw);
		
		
		Statement stmt = conn.createStatement();
		
		String sql = "SELECT first_name 이름, last_name 성, salary \"급여(월)\" FROM employees";
		ResultSet rs = stmt.executeQuery(sql);
		//(Ex) 사원들 중에서 급여(salary)가 14000 이상인 사원들의
		//		"이름", "성", "급여(월)"을 출력.
		System.out.println("이름 / 성 / 급여(월)");
		System.out.println("----------------");
		while(rs.next()) {
			String firstName = rs.getString("이름");
			String lastName = rs.getString("성");
			int salary = rs.getInt("급여(월)");
//			if(salary >= 14000) {
//				System.out.println(firstName + "/" + lastName + "/" + salary);
//			}
			if(salary < 14000) 
				continue;            // 필요시 [복습]
			
			System.out.println(firstName + "/" + lastName + "/" + salary);

		}
		rs.close();
		stmt.close();
		conn.close();
	}
}









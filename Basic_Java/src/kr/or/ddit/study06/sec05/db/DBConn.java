package kr.or.ddit.study06.sec05.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	
	
	private static Connection conn = null; //db에 접속한다 여려개 접속하면 과부하걸리니 
	
	public static Connection getConnection() { // 하나만 접속하게 만드는 싱글톤형식으로
		
		String url  = "jdbc:oracle.thin;@localhost:1521:xe";
		String user = "PC13";
		String pass = "java";
		
		
		if(conn==null) { //1.아직 한번도 접속하지 않았으면 
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn= DriverManager.getConnection(url, user, pass); //2.접속해서 conn에 저장하고
			} catch (ClassNotFoundException e) { //빨간줄뜨면 f2
				e.printStackTrace();
			} catch (SQLException e) { //빨간줄 또뜨면 또 f2눌러서 두번째 
				e.printStackTrace();
			}
		}
		
		return conn; //3.conn을 리턴한다
	}
	//이 

}

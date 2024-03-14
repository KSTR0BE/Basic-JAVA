package kr.or.ddit.study06.sec05.db;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

public class DBservice {
	Connection conn = null;
	Statement  stmt = null;
	ResultSet  rs   = null;
	
	
	public static void main(String[] args) {
		DBservice dbs = new DBservice();
		dbs.selectAll();
	}
	
	

	public void selectAll() {
		try {
			conn = DBConn.getConnection();
			stmt = conn.createStatement(); //쿼리를 보내준다
			String sql = "SELECT MEM_ID, MEM_PASS, MEM_NAME \r\n" + 
					"    FROM MEMBER"; //복사해서 넣는다
			
			rs = stmt.executeQuery(sql);
			while(rs.next()) { //불러옴 rs에 값이 없을때 
				String mid = rs.getString("MEM_ID"); //꺼낼때 겟스트링으로 멤 아이디를 스트링으로 꺼낸다
				String mps = rs.getString("MEM_PASS");
				String mnm = rs.getString("MEM_NAME");
			}
		} catch (Exception e) {
			System.out.println(e);
			
		}
	}
	
	
}

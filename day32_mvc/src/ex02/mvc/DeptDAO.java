package ex02.mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.commons.dbcp2.BasicDataSource;

public class DeptDAO { //controller
	BasicDataSource ds;

	public DeptDAO(){
		ds = new BasicDataSource();
		ds.setDriverClassName("oracle.jdbc.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		ds.setUsername("happykyoeun");
		ds.setPassword("oracle");
		ds.setInitialSize(4);
	}// constructor end
	//DML - select
	public ArrayList<DeptDTO> select () throws Exception {
		
		ArrayList<DeptDTO> list = new ArrayList<DeptDTO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		conn = ds.getConnection();
		String sql = "SELECT * FROM DEPT2";
		pstmt = conn.prepareStatement(sql);
		rs= pstmt.executeQuery();
		
		while(rs.next()){
			DeptDTO dto = new DeptDTO();
			dto.setDcode(rs.getInt(1));
			dto.setDname(rs.getString(2));
			dto.setPdept(rs.getInt(3));
			dto.setArea(rs.getString(4));
			list.add(dto);
		}
		return list;
	}
	//DML - Delete
public ArrayList<DeptDTO> delete () throws Exception {
		
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("삭제할 dcode 입력 : ");
	    int  num = sc.nextInt();
		ArrayList<DeptDTO> list2 = new ArrayList<DeptDTO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		conn = ds.getConnection();
		String sql = "delete from dept2 where dcode = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, num);
		rs= pstmt.executeQuery();
		
		sql = "SELECT * FROM DEPT2";
		pstmt = conn.prepareStatement(sql);
		rs= pstmt.executeQuery();
          while(rs.next()){
			DeptDTO dto = new DeptDTO();
			dto.setDcode(rs.getInt(1));
			dto.setDname(rs.getString(2));
			dto.setPdept(rs.getInt(3));
			dto.setArea(rs.getString(4));
			list2.add(dto);
           }
		
		return list2;
	}
}

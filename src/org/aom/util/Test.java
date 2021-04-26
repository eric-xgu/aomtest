package org.aom.util;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class Test {
	
	public static void main(String [] a) {
		Connection conn=C3p0Utils.getConnection();
		String sql="select * from aom_user";
		try {
			Statement st=  conn.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				int id=rs.getInt(1);
				String name=rs.getString(2);
				System.out.println(id+"-"+name);
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}

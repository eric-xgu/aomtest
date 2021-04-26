package org.aom.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.aom.bean.User;
import org.aom.util.C3p0Utils;

public class UserDaoImp implements UserDao {
	//获取连接-》准备sql-》获取数据
	
	
	@Override
	public User findByNameAndPass(String name, String password) {
		// TODO Auto-generated method stub
		Connection conn=C3p0Utils.getConnection();
		String sql="select * from aom_user where name=? and passwd=?";
		//System.out.println(name+":"+password);
		try {
		PreparedStatement pst=conn.prepareStatement(sql);
		pst.setString(1,name);
		pst.setString(2,password);
		ResultSet rs= pst.executeQuery();
		while(rs.next()) {
			User us=new User();
			us.setId(rs.getInt("id"));
			us.setName(rs.getString("name"));
			us.setRole(rs.getInt("role_id"));
			return us;
		}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public User findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}

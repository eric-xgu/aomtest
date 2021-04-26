package org.aom.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;


public class C3p0Utils {
   //static org.apache.log4j.Logger logger=org.apache.log4j.Logger.getLogger(C3p0Utils.class.getName()); 
    //通过标识名来创建相应连接池
	//自动读取C3p0-config.xml文件
    public static DataSource dataSource=new ComboPooledDataSource("mysql");
    public static Connection conn;
    //从连接池中取用一个连接
    public static Connection getConnection(){
        try {
        	return dataSource.getConnection();

        } catch (Exception e) {
        //    logger.error("Exception in C3p0Utils!", e);
      //      throw new MyError("数据库连接出错!", e);            
        }
       return null;
    }    
    //释放连接回连接池
     public static void close(Connection conn,PreparedStatement pst,ResultSet rs){  
            if(rs!=null){  
                try {  
                    rs.close();  
                } catch (SQLException e) {  
                   // logger.error("Exception in C3p0Utils!", e);
                   // throw new MyError("数据库连接关闭出错!", e);            
                }  
            }  
            if(pst!=null){  
                try {  
                    pst.close();  
                } catch (SQLException e) {  
                    //logger.error("Exception in C3p0Utils!", e);
                    //throw new MyError("数据库连接关闭出错!", e);    
                }  
            }  
      
            if(conn!=null){  
                try {  
                    conn.close();  
                } catch (SQLException e) {  
                    //logger.error("Exception in C3p0Utils!", e);
                    //throw new MyError("数据库连接关闭出错!", e);    
                }  
            }  
        }  
}
package com.brilliance.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDao {
   //驱动路径
   static final String driver="oracle.jdbc.driver.OracleDriver";
   //连接数据库的URL
   static final String  url="jdbc:oracle:thin:@localhost:1521:xe";
   //用户名
   static final String username="scott";
   //密码
   static final String password="939535";
   
   Connection con;
   public PreparedStatement getPreparedStatement(String sql) throws Exception{
	   Class.forName(driver);
	   con=DriverManager.getConnection(url,username,password);
	   //Statement state=con.createStatement();
	   PreparedStatement ps=con.prepareStatement(sql);
	   return ps;
   }
   
   
   public void closeAll(Statement sta,ResultSet rst) throws Exception{
	   if(con!=null){
		  con.close(); 
	   }
	   if(sta!=null){
		   sta.close();
	   }
	   if(rst!=null){
		   rst.close();
	   }
   }
   
	
}

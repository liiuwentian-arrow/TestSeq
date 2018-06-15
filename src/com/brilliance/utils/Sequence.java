package com.brilliance.utils;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.brilliance.dao.BaseDao;
import com.brilliance.pojo.CNT;
import com.brilliance.pojo.STU;

public class Sequence {
	BaseDao  bd = new BaseDao();
	 public CNT getCnt(String name) {
		 
		 CNT cnt = null;
		 try {
			PreparedStatement ps = bd.getPreparedStatement("select * from tb_cnt where tbname=?");
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				  //System.out.println(1);
				 cnt = new CNT(rs.getString(1),rs.getShort(2),rs.getShort(3));
				 bd.closeAll(ps, rs);
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 return cnt; 
		
	 }
	 
	 
	 public int getValue(String name) {
		 int value = 0;
		 try {
			PreparedStatement ps = bd.getPreparedStatement("select value from tb_cnt where tbname=?");
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			
			
			if(rs.next()) {
				
				value=rs.getInt(1);
				bd.closeAll(ps, rs);
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		 
		 
		 return value;
		 
	 }
}

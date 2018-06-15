package com.brilliance.lwt;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.brilliance.dao.BaseDao;
import com.brilliance.pojo.CNT;
import com.brilliance.pojo.STU;
import com.brilliance.utils.Sequence;

/**
 * Servlet implementation class TestSeq
 */
@WebServlet("/TestSeq")
public class TestSeq extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestSeq() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		BaseDao bd = new BaseDao();
		Sequence sequence = new Sequence();
		String stunum = request.getParameter("stunum");
		String tbname = request.getParameter("tbname");
	
		CNT cnt = sequence.getCnt(tbname);
		
		
		//System.out.println(cnt.getName());
		
		//System.out.println(cnt.getValue());
		
		if(cnt==null){
			try {
				PreparedStatement ps = bd.getPreparedStatement("insert into tb_cnt values(?,?,?)");
				ps.setString(1, tbname);
				ps.setInt(2, 1);
				ps.setInt(3, 1);
				ps.execute();
				bd.closeAll(ps, null);
				
				PreparedStatement ps1 = bd.getPreparedStatement("insert into tb_stu(INR,STUNUM) values(?,?)");
				ps1.setString(1, "1");
				ps1.setString(2, stunum);
				ps1.execute();
				bd.closeAll(ps1, null);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else {
		
			String inr = null;
			try {
				 PreparedStatement ps2 = bd.getPreparedStatement("select step from tb_cnt where tbname=?");
				 ps2.setString(1, tbname);
				 ResultSet rs = ps2.executeQuery();
				 if(rs.next()) {
					 int step = rs.getInt(1);
				    inr = String.valueOf(sequence.getValue(tbname)+step);
					 
				 }
				 
				 
				 
				PreparedStatement  ps1 = bd.getPreparedStatement("update tb_cnt set value=? where tbname=?");
				ps1.setString(1, inr);
				ps1.setString(2, tbname);
				ps1.execute();
				bd.closeAll(ps1, null);
				
				
				
				
				PreparedStatement ps = bd.getPreparedStatement("insert into tb_stu(INR,STUNUM) values(?,?)");
				
				
				ps.setString(1, inr);
				ps.setString(2, stunum);
				ps.execute();
				bd.closeAll(ps, null);
				
			
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
		
	}

}

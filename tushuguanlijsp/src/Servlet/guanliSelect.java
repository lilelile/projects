package Servlet;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import JavaBean.guanliBean;
import text.Daoguanli;

/**
 * Servlet implementation class guanliSelect
 */
@WebServlet("/guanliSelect")
public class guanliSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ResultSet rs = null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public guanliSelect() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
HttpSession session = request.getSession();
		
		List<guanliBean> lists = new ArrayList<guanliBean>();
		Daoguanli dg = new Daoguanli();
		
		rs = dg.selelctText(request);
		
      try{
    	  while (rs.next()) {
        
        guanliBean gua = new guanliBean();
        
	
	
		gua.setAid(rs.getString("Aid"));
		gua.setAname(rs.getString("name"));
		gua.setpassword(rs.getString("password"));
		gua.setAtel(rs.getString("Atel"));
		
		lists.add(gua);
		session.setAttribute("list", lists);
		response.sendRedirect("updateguanli.jsp");
		return ;
	}
      } catch (Exception e) {
			System.out.println(e.getMessage());
		
	}


	}
	}



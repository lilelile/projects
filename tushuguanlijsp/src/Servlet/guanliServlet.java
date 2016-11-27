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
 * Servlet implementation class guanliServlet
 */
@WebServlet("/guanliServlet")
public class guanliServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ResultSet rs = null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public guanliServlet() {
        super();
        // TODO Auto-generated constructor stub
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
HttpSession session = request.getSession();
		
		List<guanliBean> lists = new ArrayList<guanliBean>();
		Daoguanli dg = new Daoguanli();
		
		rs = dg.selelctText(request);
		
      try{
    	  while (rs.next()) {
        
        guanliBean guanli = new guanliBean();
        
        guanli.setAid(rs.getString("Aid"));
        guanli.setAname(rs.getString("Aname"));
        guanli.setpassword(rs.getString("password"));
        guanli.setAtel(rs.getString("Atel"));
		
		lists.add(guanli);
		session.setAttribute("list", lists);
		
		
	}
      } catch (Exception e) {
			System.out.println(e.getMessage());
		
	}
      response.sendRedirect("guanliyuan.jsp");

	}
	}



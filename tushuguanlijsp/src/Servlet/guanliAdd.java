package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import text.Daoguanli;

/**
 * Servlet implementation class guanliAdd
 */
@WebServlet("/guanliAdd")
public class guanliAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public guanliAdd() {
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
		Daoguanli ad=new Daoguanli();
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
	
		String Aid=request.getParameter("Aid");
		String Aname=request.getParameter("Aname");
		String password=request.getParameter("password");
		String Atel=request.getParameter("Atel");
		
		try {
			ad.insert_Select(Aid,Aname,password,Atel);
			System.out.println("≤Â»Î≥…π¶");
			response.sendRedirect("guanliServlet");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
		
		
	}

}

package org.aom.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.aom.service.UserService;
import org.aom.service.UserServiceImp;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/user.action")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserService us=new UserServiceImp();
		String action=request.getParameter("action");
		System.out.println("action:"+action);
		if(action !=null && action.equals("list")) {
			request.setAttribute("mainRight","userlist.jsp" );
			request.getRequestDispatcher("/WEB-INF/jsp/home.jsp").forward(request, response);
		}
		else if(action !=null && action.equals("adduser")){
			//System.out.println("1");
			request.setAttribute("mainRight","useradd.jsp" );
			request.getRequestDispatcher("/WEB-INF/jsp/home.jsp").forward(request, response);
		}
		else if(action !=null && action.equals("saveuser")){
			System.out.println("1");
			String name=request.getParameter("name");
			String password=request.getParameter("password");
			System.out.println(name+":"+password);
			//名字不可重复
			us.findByName(name);
			
		}
	}

}

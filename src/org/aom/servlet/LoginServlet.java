package org.aom.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.aom.bean.User;
import org.aom.service.UserService;
import org.aom.service.UserServiceImp;
import org.aom.util.CookieUtil;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//根据输入框，name的属性值获取
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String readme=request.getParameter("readme");
		System.out.print(name+":"+password+":"+readme);
		UserService us=new UserServiceImp();
		User user=us.findByNameAndPass(name,password);
		if(user==null) {
			System.out.println("登录失败");
			request.setAttribute("error","错误信息");
			//getRequestDispatcher可以在下一个servlet获取request保存值，
			//request.setAttribute("error","错误信息");
			CookieUtil.addcookie("cookie_name_pass",7*24*60*60,response,request,name,password);
			request.getSession().setAttribute("session_user", user);
			request.getRequestDispatcher("/WEB-INF/jsp/index.jsp").forward(request, response);
			
		}
		else {
			if(readme!=null && readme.equals("t")) {
				CookieUtil.addcookie("cookie_name_pass",7*24*60*60,response,request,name,password);
			}
			request.getSession().setAttribute("session_user", user);
			System.out.println("登录成功");
			System.out.println("user:"+user);
			request.getRequestDispatcher("/WEB-INF/jsp/home.jsp").forward(request, response);
		}
		//System.out.println("User:"+user);
	}
}

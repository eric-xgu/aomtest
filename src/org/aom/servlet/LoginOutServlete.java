package org.aom.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.aom.util.CookieUtil;

/**
 * Servlet implementation class LoginOutServlete
 */
@WebServlet("/loginout")
public class LoginOutServlete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginOutServlete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//清除session中的信息
		request.getSession().removeAttribute("session_user");
		//清除cookie
		Cookie cookie=CookieUtil.getCookieByName(request,"cookie_name_pass");
		if(cookie !=null) {
			cookie.setMaxAge(0);
			cookie.setPath(request.getContextPath());
			response.addCookie(cookie);
		}
		//WEB-INF下的内容，只能通过内部跳转
		request.getRequestDispatcher("/WEB-INF/jsp/index.jsp").forward(request, response);
		//response.sendRedirect(getServletContext().getContextPath()+"/WEB-INF/jsp/index.jsp");
	}

}

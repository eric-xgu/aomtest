package org.aom.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieUtil {

	public static void addcookie(String cook_name, int time, HttpServletResponse response,HttpServletRequest request, String name, String password) {
		// TODO Auto-generated method stub
		Cookie cookie=getCookieByName(request,cook_name);
		//遍历request中所有的cookie，如果有用户名与学号的cookie，则改值，否则重新创建

		if(cookie != null) {
			cookie.setValue(name+"#"+password);
		}
		else {
			cookie=new Cookie(cook_name,name+"#"+password);
		}
		//设置作用范围(当前范围有效)，响应时间
		cookie.setMaxAge(time);
		cookie.setPath(request.getContextPath());
		System.out.print("ContextPath:"+request.getContextPath());
		response.addCookie(cookie);
	}

	public static Cookie getCookieByName(HttpServletRequest request, String cook_name) {
		Cookie [] cookies=request.getCookies();
		if(cookies != null&&cookies.length>0) {
			for(Cookie c:cookies) {
				if(c.getName().equals(cook_name)) {
					return c;
				}
			}
		}
		return null;
	}

}

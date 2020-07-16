package com.gfz.interceptor;

import net.sf.json.JSONObject;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

public class Interceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		String url = request.getRequestURI();
		System.out.println("come in interceptor,url= "+ url);
		Object admin = request.getSession().getAttribute("admin");
		if(admin == null) {
			//表示未登录或者登录失效
			System.out.println(", url = " +url);

			if("XMLHttpRequest".equals(request.getHeader("X-Requested-With"))) {
				//ajax请求
				Map<String, String> ret =new HashMap<String, String>();


					ret.put("type","error");
					ret.put("msg","登录失效,请重新去登录！");
					response.getWriter().write(JSONObject.fromObject(ret).toString());
					return false;
			}

			response.sendRedirect(request.getContextPath() + "/login/login");
			return false;
		}
	return true;
	}

}

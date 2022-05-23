package tach.web.filter;


import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import tach.web.dao.UserDao;
import tach.web.jwt.Token;
import tach.web.model.User;
public class AuthorizationFilter implements Filter{
	
	private ServletContext context;

	public void init(FilterConfig filterConfig) throws ServletException {
		this.context = filterConfig.getServletContext();
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		String url = req.getRequestURI();
		System.out.println(url);
		Gson gson = new Gson();
		resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
		if (url.startsWith("/NVH/api/admin")) {
			String auth = parseToken(req);
			if (auth!=null && Token.validateJwtToken(auth)) {
				UserDao ud = new UserDao();
				User user = ud.layTaiKhoanBangUsername(Token.getUserNameFromJwtToken(auth));
				if (user.getRole()==1) {
					System.out.println("You are admin!!!");
					chain.doFilter(request, response);
				}
				else {
					System.out.println("You are not admin!!!");
					resp.getWriter().write(gson.toJson("You are not admin!!!"));
				}
			}
			else {
				System.out.println("Token is expired!!!");
				resp.getWriter().write(gson.toJson("Token is expired!!!"));
			}
		}
		else {
			System.out.println("Do not need authorization!!!");
			chain.doFilter(request, response);
		}
	}

	public void destroy() {
		
	}
	
	private String parseToken(HttpServletRequest req) {
		String auth = req.getHeader("Authorization");
		if (auth!=null && auth.startsWith("Bearer ")) {
			return auth.substring(7);
		}
		return null;
	}

}

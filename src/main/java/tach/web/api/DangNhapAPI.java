package tach.web.api;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mindrot.jbcrypt.BCrypt;

import com.google.gson.Gson;

import tach.web.dao.UserDao;
import tach.web.jwt.Token;
import tach.web.model.Login;
import tach.web.model.LoginResponse;
import tach.web.model.User;
@WebServlet(urlPatterns="/api/dangnhap")
public class DangNhapAPI extends HttpServlet{
private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
		Gson gson = new Gson();
		Login acc = gson.fromJson(getRequestBody.getBody(req.getReader()), Login.class);
		System.out.println(acc.getUsername() + "-----" + acc.getPassword());
		UserDao tk = new UserDao();
		User u = tk.layTaiKhoanBangUsername(acc.getUsername());
		resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
		if(u!=null && BCrypt.checkpw(acc.getPassword(), u.getPassword())) {
			Cookie cookie=new Cookie("token",Token.generateToken(u));
			resp.addCookie(cookie);
			resp.getWriter().write(gson.toJson(
					new LoginResponse(Token.generateToken(u), u.getUsername(), u.getRole())));
		}
		else {
			resp.getWriter().write(gson.toJson("Dang nhap that bai"));
		}
	}
	
}
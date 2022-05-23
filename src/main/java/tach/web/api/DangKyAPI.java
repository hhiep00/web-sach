package tach.web.api;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import tach.web.dao.UserDao;
import tach.web.model.User;


@WebServlet(urlPatterns="/api/dangky")
public class DangKyAPI extends HttpServlet{
	private static final long serialVersionUID = 1L;

	//Dang ky
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		Gson gson = new Gson();
		User acc = gson.fromJson(getRequestBody.getBody(req.getReader()), User.class);
		System.out.println(acc.getUsername() + "-----" + acc.getPassword());
		UserDao ud = new UserDao();
		User u = ud.layTaiKhoanBangUsername(acc.getUsername());
		resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        if(u==null) {
			ud.themTaiKhoan(acc);
			resp.getWriter().write(gson.toJson(acc));
        }
        else {
        	resp.getWriter().write(gson.toJson("Dang ky that bai!!!"));
        }
	}
}
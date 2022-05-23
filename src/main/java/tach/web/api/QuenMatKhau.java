package tach.web.api;


import java.io.IOException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import tach.web.dao.UserDao;
import tach.web.model.ForgotPass;
import tach.web.model.User;
@WebServlet(urlPatterns="/api/quenmatkhau")
public class QuenMatKhau extends HttpServlet{

	private static final long serialVersionUID = 1L;
 
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
		
        //kiem tra username va email
        Gson gson = new Gson();
        ForgotPass fp = gson.fromJson(getRequestBody.getBody(req.getReader()), ForgotPass.class);
        UserDao ud = new UserDao();
        User user = ud.layTaiKhoanBangUsername(fp.getUsername());
        if (user==null) {
        	resp.getWriter().write(gson.toJson("Tài khoản không tồn tại"));
        	return;
        }
        if (!user.getEmail().equalsIgnoreCase(fp.getEmail())) {
        	resp.getWriter().write(gson.toJson("Tài khoản và email không trùng khớp"));
        	return;
        }
        
        // Dang nhap mail server
		final String username_mail = "bookawesometravel@gmail.com";
		final String password_mail = "ttcs08052022";
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		Session session = Session.getInstance(props, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username_mail, password_mail);
			}
		});
		
		// tao mat khau moi
		String newpass = "";
		String AlphaNumericStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz0123456789";
		for(int i=0 ; i<10 ; i++) {
			int pos = (int)(AlphaNumericStr.length() * Math.random());
			newpass += AlphaNumericStr.charAt(pos);
		}
		System.out.println(newpass);
		ud.capNhatMatKhau(fp.getUsername(), newpass);
		// Gui mail
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username_mail));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(fp.getEmail()));
			message.setSubject("Khôi phục mật khẩu", "UTF-8");
			message.setText("Mật khẩu mới của bạn là: " + newpass, "UTF-8");
			Transport.send(message);
			resp.getWriter().write(gson.toJson("Vui lòng kiểm tra email"));
        	return;
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
}
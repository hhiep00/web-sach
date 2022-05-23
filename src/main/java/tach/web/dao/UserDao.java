package tach.web.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.mindrot.jbcrypt.BCrypt;

import tach.web.connect.ConnectDatabase;
import tach.web.model.User;

public class UserDao extends ConnectDatabase{
	public UserDao() {
		// TODO Auto-generated constructor stub
	}
	
	public void themTaiKhoan(User user) {
		String sql = "insert into Users(username, email, pass, vai_tro) values (?,?,?,?)";
		try {
			PreparedStatement st = conn.prepareStatement(sql);
			String encodePass = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt(12));
			st.setString(1, user.getUsername());
			st.setString(2, user.getEmail());
			st.setString(3, encodePass);
			st.setInt(4, 1);
			st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void capNhatMatKhau(String username, String pass) {
		String sql = "update Users set pass=?";
		try {
			PreparedStatement st = conn.prepareStatement(sql);
			String encodePass = BCrypt.hashpw(pass, BCrypt.gensalt(12));
			st.setString(1, encodePass);
			st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public User layTaiKhoanBangUsername(String username) {
		String sql = "select * from Users where username=?";
		try {
			User user = new User();
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, username);
			ResultSet rs = st.executeQuery();
			if (rs.next()) {
				user.setID_User(rs.getInt("id_user"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("pass"));
				user.setImg(rs.getString("avata"));
				user.setEmail(rs.getString("email"));
				user.setHoTen(rs.getNString("ho_ten"));
				user.setRole(rs.getInt("vai_tro"));
				return user;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}

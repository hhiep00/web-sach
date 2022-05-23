package tach.web.model;

public class LoginResponse {
	private String Token;
	private String Username;
	private int Role;
	
	public LoginResponse() {
		// TODO Auto-generated constructor stub
	}

	public LoginResponse(String token, String username, int role) {
		super();
		Token = token;
		Username = username;
		Role = role;
	}

	public String getToken() {
		return Token;
	}

	public void setToken(String token) {
		Token = token;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public int getRole() {
		return Role;
	}

	public void setRole(int role) {
		Role = role;
	}
	
	
}

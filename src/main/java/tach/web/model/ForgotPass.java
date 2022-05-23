package tach.web.model;

public class ForgotPass {
	private String Username;
	private String Email;
	
	public ForgotPass() {
		// TODO Auto-generated constructor stub
	}

	public ForgotPass(String username, String email) {
		super();
		Username = username;
		Email = email;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
	
	
}
package View;

public class BankingEntity {
	private String email;
	private String username;
	private String password;
	
	
	public BankingEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "BankingEntity [email=" + email + ", username=" + username
				+ ", password=" + password + "]";
	}
	
	
	
	

}
